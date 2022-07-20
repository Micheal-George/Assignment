package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.EmployeeException.EmployeeException;
import com.bean.Employee;
import com.connection.connector;

public class empdaoImpl implements empDao {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String msg="Not Inserted";
		
		
		
		try(Connection conn=connector.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="Inserted";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp=null;
		try(Connection conn=connector.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee where empId=?");
			
			ps.setInt(1, empId);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
				int i=rs.getInt("empId");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				emp=new Employee(i,n,a,s);
			}
			
			else
				throw new EmployeeException("No data with this id :"+empId);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
List<Employee> emp=new ArrayList<>();
		
		try(Connection conn=connector.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee ");
			
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				int i=rs.getInt("empId");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				emp.add(new Employee(i,n,a,s)) ;
			}
			
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
String msg="Not deleted";
		
		
		
		try(Connection conn=connector.connectionProvider()) {
			Employee emp=new Employee();
			PreparedStatement ps=conn.prepareStatement("delete from employee where empID =?");
			ps.setInt(1, emp.getEmpId());
			
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="Deleted";
			else
				throw new EmployeeException("No data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

}
