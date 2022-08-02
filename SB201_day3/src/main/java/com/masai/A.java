package com.masai;

public class A {
	
	public void funA() {
		System.out.println("call me");
	}

}
/*

<bean id="s1" name="com.masai.qus2.Student">
    <property name="name" value="Micheal"></property>
    <property name="roll" value="25"></property> 
    </bean>
    
    <bean id="s2" name="com.masai.qus2.Student">
    <property name="name" value="Sam"></property>
    <property name="roll" value="30"></property> 
    </bean>
    
    <bean id="s3" name="com.masai.qus2.Student">
    <property name="name" value="Zafal"></property>
    <property name="roll" value="15"></property> 
    </bean>
    
    <bean id="s4" name="com.masai.qus2.Student">
    <property name="name" value="Joseph"></property>
    <property name="roll" value="12"></property> 
    </bean>
    
    <bean id="s5" name="com.masai.qus2.Student">
    <property name="name" value="Mathew"></property>
    <property name="roll" value="51"></property> 
    </bean>
     
    
    <bean id="D" name="com.masai.qus2.Demo" >
    <property name="students">
    <list>
    <ref bean="s1"/>
    <ref bean="s2"/>
    <ref bean="s3"/>
    <ref bean="s4"/>
    <ref bean="s5"/>
    
    
    </list>
    
    </property>
    </bean>




*/