import java.util.*;
public class EmployeeData {
	public static void main(String[] args) {
        
		Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter number of employes:");
        n = sc.nextInt();
        Employee[] empData= new Employee[n];
        for(int i=0;i<n;i++)
        {    
            empData[i]=new Employee();
            System.out.println("Enter employee Number:" );
            empData[i].setEmpID(sc.nextInt());
            System.out.println("Enter employee Name:" );
            empData[i].setEmpName(sc.next());
            System.out.println("How many technologies do employee work on:");
            int num=sc.nextInt();
            String[] technology=new String[num];
            System.out.println("Enter names of technology(s) known:");
            for(int j=0;j<num;j++)
            {
                technology[j]=sc.next();
            }
            empData[i].setEmpTechnologies(technology);    
        }
        System.out.println("Entered Details of Employee Are:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee Number: "+empData[i].getEmpID() );
            System.out.println("Employee Name: "+empData[i].getEmpName());
            System.out.print("Employee Technologies: ");
            for(String tech:empData[i].getEmpTechnologies()) 
            {
                System.out.print(tech+" ");
            }
        }

 

    }

 

}
 

