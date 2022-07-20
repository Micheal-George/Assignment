package com.masai.Dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.Employee;
import com.Connection.ConnectSql;
import com.Exception.EmployeeException;


public class empDaoIMPL implements empDao{

	@Override
	public String insertEmployeeDetails(Employee emp) {
		
		String msg="Not Inserted";
		try(Connection conn=ConnectSql.connectionProvider()) {
			
			PreparedStatement ps=conn.prepareStatement("insert into employee3 values(?,?,?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setInt(4, emp.getSalary());
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="Inserted";
			
			
		} catch  (Exception e) {
			     // TODO Auto-generated catch block
		     	e.printStackTrace();
		}
			
	return msg;
	}

	
	
	@Override
	public int getsalaryByID(int id) throws EmployeeException {
		int salary=-1;
		
		try(Connection conn=ConnectSql.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select salary from employee3 where eid=?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				salary=rs.getInt("salary");
			else
				throw new EmployeeException("Invalid ID");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return salary;
	}

	
	
	@Override
	public String updateBonus(int bonus) {
		
		String msg="Not Updated";
		
		
		try(Connection conn=ConnectSql.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("update employee3 set salary=salary+500");
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="Updated";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

	
	
	@Override
	public String insertSpecificEmployeeDetails(Employee emp) {
		String msg="Not Inserted";
		try(Connection conn=ConnectSql.connectionProvider()) {
			
			PreparedStatement ps=conn.prepareStatement("insert into employee3(eid,name,salary) values(?,?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="Inserted";
			
			
		} catch  (Exception e) {
			     // TODO Auto-generated catch block
		     	e.printStackTrace();
		}
		return msg;
	}

	
	
	@Override
	public Employee getEmployeeDetails(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
		try(Connection conn=ConnectSql.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where eid=?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				emp=new Employee(i,n,a,s);
			}
			
			else
				throw new EmployeeException("No data with this id :"+id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return emp;
	}


	
	

	@Override
	public List<Employee> getAllDetails() throws EmployeeException {
		
		List<Employee> emp=new ArrayList<>();
		
		try(Connection conn=ConnectSql.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee3 w");
			
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				emp.add(new Employee(i,n,a,s)) ;
			}
			
		if(emp.size()<=0)
				throw new EmployeeException("No data ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}



	@Override
	public List<Employee> getAllDetailsSalaryLessThan() throws EmployeeException {
List<Employee> emp=new ArrayList<>();
		
		try(Connection conn=ConnectSql.connectionProvider()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where salary<80000");
			
		
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				emp.add(new Employee(i,n,a,s)) ;
			}
			
		if(emp.size()<=0)
				throw new EmployeeException("No data ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	
	

}
