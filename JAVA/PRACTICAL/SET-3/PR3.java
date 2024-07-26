import java.util.*;
public class PR3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.getdata();
        e2.getdata();
        e1.printdata();
        e2.printdata();
        e1.increment();
        e2.increment();
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
    
}
 class Employee {
     String first_name,last_name;
     double m_salary;
    Employee()
    {
        first_name ="";
        last_name="";
        m_salary=0;

    }
    public void setdata(String fname,String lname,double ms)
    {
        first_name=fname;
        last_name=lname;
        m_salary =ms;
    }
    public  void getdata () {
        Scanner dp= new Scanner(System.in);
        System.out.println("ENTER THE FIRST NAME OF THE EMPLOYEE:");
        first_name =dp.nextLine();
        System.out.println("ENTER THE LAST NAME OF THE EMPLOYEE:");
        last_name =dp.nextLine();
        System.out.println("ENTER THE MONTHLY SALARY OF THE EMPLOYEE:");
        m_salary =dp.nextDouble();
        if(m_salary<0)
        {
            m_salary=0;
        }
    }
    public void printdata(){
        System.out.println("<---------------------------------->");
        System.out.println("THE YEARLY SALARY OF \""+first_name+" "+last_name+ "\"IS:"+(12*m_salary));
        // System.out.println("<---------------------------------------------->");
    }
    public void increment()
    {
        System.out.println("<----------------------------------->");
        double n = (m_salary+(10*m_salary)/100);
        System.out.println("THE 10% RAISE GIVEN TO\"["+first_name+" "+last_name+"]\" THE YEARL SALARY AND THE NEW SALARY IS :"+(12*n));
        // System.out.println("<---------------------------------------------->");
    }
}

