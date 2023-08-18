package com;
import java.util.Scanner;
class Emp
{
	Scanner sc= new Scanner(System.in);
	int id,age;
	String name;
	int salary;
	String desig;
	Emp()
	{
		System.out.println("Enter ID :");
		 id=sc.nextInt();
		System.out.println("Enter name :");
		 name= sc.next();
		System.out.println("Enter Age :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("=================");
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Desig :"+desig);
	}
	
	
}													
class Clerk  extends Emp
{
	Clerk()
	{	
		 salary=20000;
		desig="Clerk";
	}	
	void raiseSalary()
	{
		salary=salary+10000;
	}
}
class Dev extends Emp
{
	Dev()
	{
		salary=30000;
		desig="Developer";		
	}
	void raiseSalary()
	{
		salary=salary+20000;
	}
}
class Manager extends Emp
{
	
	Manager()
	{
		salary=80000;
		desig="Manager";	
	}
	void raiseSalary()
	{
		salary=salary+50000;
	}
}
class Tester extends Emp
{
	Tester(){
		salary=40000;
		desig="Tester";
	}
	void raiseSalary()
	{
		salary=salary+30000;
	}
}
public class Demo6 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
        int ch = 0;
        int ch2=0;
        Clerk c = null;
        Tester t = null;
        Manager m = null;
        Dev d = null;
        
       do {
    	   System.out.println("1 - Create");
           System.out.println("2 - Display");
           System.out.println("3 - Update ");
           System.out.println("4 - Exit");
           ch = scn.nextInt();
           
           if(ch==1)
           {
        	   
        	   	do {
        	   		
        	   		System.out.println("1 - Clerk");
                    System.out.println("2 - Dev");
                    System.out.println("3 - Tester");
                    System.out.println("4 - Manager");
                    System.out.println("5 - Exit");
                    ch2 = scn.nextInt();
                    
                    
                   if(ch2==1) {
                	   c=new Clerk();
                   }
                   else if(ch2==2) {
                	   d= new Dev();
                   }
                   else if(ch2==3) {
                	   t= new Tester();
                   }
                   else if(ch2==4) {
                	   m=new Manager();
                   }
                    
                    
        	   	}while(ch2<5);
           }
           else if(ch==2) {
        	   do {
       	   		System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();
                   
                   
                  if(ch2==1) {
               	   c.display();
                  }
                  else if(ch2==2) {
               	   d.display();
                  }
                  else if(ch2==3) {
               	   t.display();
                  }
                  else if(ch2==4) {
               	   m.display();
                  }       
       	   	}while(ch2<5);

           }
           else if(ch==3) {
        	   do {
       	   		System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();
                   
                   
                  if(ch2==1) {
               	   c.raiseSalary();
               	   System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==2) {
               	   d.raiseSalary();
               	System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==3) {
               	   t.raiseSalary();
               	System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==4) {
               	   m.raiseSalary();
               	System.out.println("Succsfully Salary Updated .....!");
                  }       
       	   	}while(ch2<5);

           }
           else if(ch==4) {
        	   System.out.println(0);
        	   System.out.println("Thank you.....!");
           }
       }while(ch<4);
	}
}