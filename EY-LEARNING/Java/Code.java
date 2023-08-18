

import java.util.*;

abstract class Employee{

    int id,age;

    String name;

    int salary;

    String desig;

    Employee()

    {

    Scanner ab=new Scanner(System.in);

    System.out.println("Enter ID :");

    id=ab.nextInt();

 

    System.out.println("Enter name :");

    name=ab.next();

 

    System.out.println("Enter age :");

    age=ab.nextInt();

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

    abstract void bonus();

    abstract void hike();

    abstract void PF();

}

class clerk extends Employee{

    clerk()

    {

    desig="Clerk";

    salary=20000;

    }

    void raise_salary()

    {

        salary+=10000;

    }

    void bonus(){

        System.out.println("You got a bonus of 5000");

        salary+=5000;

    }

    void hike()

    {

        System.out.println("You got a hike for 5%");

        salary+=(salary*0.05);

    }

    void PF()

    {

        System.out.println("PF of 12% of Salary");

    }

}

class Developer extends Employee{

    Developer()

    {

    desig="Developer";

    salary=30000;

    }

    void raise_salary()

    {

        salary+=20000;

    }

    void bonus(){

        System.out.println("You got a bonus of 15000");

        salary+=15000;

    }

    void hike()

    {

        System.out.println("You got a hike for 15%");

        salary+=(salary*0.15);

    }

    void PF()

    {

        System.out.println("PF of 12% of Salary");

    }

}

class Tester extends Employee{

    Tester()

    {

    desig="Testor";

    salary=25000;

    }

    void raise_salary()

    {

        salary+=5000;

    }

    void bonus(){

        System.out.println("You got a bonus of 10000");

        salary+=10000;

    }

    void hike()

    {

        System.out.println("You got a hike for 10%");

        salary+=(salary*0.10);

    }

    void PF()

    {

        System.out.println("PF of 12% of Salary");

    }

}

class Manager extends Employee{

    Manager()

    {

    desig="Manager";

    salary=50000;

    }

    void raise_salary()

    {

        salary+=30000;

    }

    void bonus(){

        System.out.println("You got a bonus of 25000");

        salary+=25000;

    }

    void hike()

    {

        System.out.println("You got a hike for 25%");

        salary+=(salary*0.25);

    }

    void PF()

    {

        System.out.println("PF of 12% of Salary");

    }

}

public class Code{

    public static void main(String args[])

    {

    clerk cc=null;

    Developer dd=null;

    Tester tt=null;

    Manager mm=null;

    boolean conn=true;

    int rolechoice;

    Scanner ab = new Scanner(System.in);

   

        while(conn)

        {

            System.out.println("=======================================");

            System.out.println("Choose a role:");

            System.out.println("1. Create");

            System.out.println("2. Display");

            System.out.println("3. Update Salary");

            System.out.println("4. Bonus");

            System.out.println("5. Hike");

            System.out.println("6. PF");

            System.out.println("7. Exit");

            System.out.println("=======================================");

            int roleChoice = ab.nextInt();

            switch(roleChoice)

            {

                case 1:

                    System.out.println("=======================================");

                    System.out.println("Choose a role:");

                    System.out.println("1. clerk");

                    System.out.println("2. dev");

                    System.out.println("3. tester");

                    System.out.println("4. manager");

                    roleChoice=ab.nextInt();

                    switch(roleChoice)

                    {

                        case 1:

                           cc=new clerk();

                            break;

                        case 2:

                            dd=new Developer();

                            break;

                        case 3:

                            tt=new Tester();

                            break;

                        case 4:

                            mm=new Manager();

                            break;

                    }

                    break;

                    case 2:

                        System.out.println("=======================================");

                        System.out.println("Choose a role:");

                        System.out.println("1. clerk");

                        System.out.println("2. dev");

                        System.out.println("3. tester");

                        System.out.println("4. manager");

                        roleChoice=ab.nextInt();

                        switch(roleChoice)

                       {

                        case 1:

                           cc.display();

                            break;

                        case 2:

                            dd.display();

                            break;

                        case 3:

                            tt.display();

                            break;

                        case 4:

                            mm.display();

                            break;

                       }

                       break;

                    case 3:

                        System.out.println("=======================================");

                        System.out.println("Choose a role:");

                        System.out.println("1. clerk");

                        System.out.println("2. dev");

                        System.out.println("3. tester");

                        System.out.println("4. manager");

                        roleChoice=ab.nextInt();

                        switch(roleChoice)

                       {

                        case 1:

                           cc.raise_salary();

                            break;

                        case 2:

                            dd.raise_salary();

                            break;

                        case 3:

                            tt.raise_salary();

                            break;

                        case 4:

                            mm.raise_salary();

                            break;

                       }

                       break;

                       case 4:

                        System.out.println("=======================================");

                        System.out.println("Choose a role:");

                        System.out.println("1. clerk");

                        System.out.println("2. dev");

                        System.out.println("3. tester");

                        System.out.println("4. manager");

                        roleChoice=ab.nextInt();

                        switch(roleChoice)

                       {

                        case 1:

                           cc.bonus();

                            break;

                        case 2:

                            dd.bonus();

                            break;

                        case 3:

                            tt.bonus();

                            break;

                        case 4:

                            mm.bonus();

                            break;

                       }

                       break;

                       case 5:

                        System.out.println("=======================================");

                        System.out.println("Choose a role:");

                        System.out.println("1. clerk");

                        System.out.println("2. dev");

                        System.out.println("3. tester");

                        System.out.println("4. manager");

                        roleChoice=ab.nextInt();

                        switch(roleChoice)

                       {

                        case 1:

                           cc.hike();

                            break;

                        case 2:

                            dd.hike();

                            break;

                        case 3:

                            tt.hike();

                            break;

                        case 4:

                            mm.hike();

                            break;

                       }

                       break;

                       case 6:

                        System.out.println("=======================================");

                        System.out.println("Choose a role:");

                        System.out.println("1. clerk");

                        System.out.println("2. dev");

                        System.out.println("3. tester");

                        System.out.println("4. manager");

                        roleChoice=ab.nextInt();

                        switch(roleChoice)

                       {

                        case 1:

                           cc.PF();

                            break;

                        case 2:

                            dd.PF();

                            break;

                        case 3:

                            tt.PF();

                            break;

                        case 4:

                            mm.PF();

                            break;

                       }

                       break;

                    case 7:

                        conn=false;

                        System.out.println("Thank You.......");

            }

}

}

}