import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectOverview
{
   public static void main(String [] args) throws ParseException
   {
       // this are details for the architecture
       System.out.println("These column inputs the details of the architecture ");
       System.out.println("Enter the name of the architecture:");
       Scanner arch_name = new Scanner(System.in);
       String name = arch_name.nextLine();
       System.out.println("Enter the telephone numbers of the architecture: ");
       Scanner scandet = new Scanner(System.in);
       int telephone_numbers = scandet.nextInt();
       System.out.println("Enter the physical address of the architecture");
       Scanner new_address = new Scanner(System.in);
       String physical_address = new_address.nextLine();
       System.out.println("Enter the email address of the architecture");
       Scanner new_email = new Scanner(System.in);
       String email_address = new_email.nextLine();
       System.out.println();// create a double line between inputs and results
       System.out.println();
       Architect ArchObject = new Architect(name, telephone_numbers, physical_address, email_address);
       System.out.println("Details of the architecture: ");
       System.out.println(ArchObject);
      
       // create lines between architecture and customer details
       System.out.println();
       System.out.println();
      
       // details of the customer
       System.out.println("These column inputs the details of the customer");
       System.out.println("Enter the name of the customer:");
       Scanner customer = new Scanner(System.in);
       String customer_name = customer.nextLine();
       System.out.println("Enter the telephone numbers of the customer: ");
       Scanner tel_num = new Scanner(System.in);
       int customer_tel = tel_num.nextInt();
       System.out.println("Enter the physical address of the customer");
       Scanner customer_address = new Scanner(System.in);
       String address = customer_address.nextLine();
       System.out.println("Enter the email address of the customer");
       Scanner customer_email = new Scanner(System.in);
       String email_for_customer = customer_email.nextLine();
       System.out.println();// create a double line between inputs and results
       System.out.println();
       Customer custObj = new Customer(customer_name, customer_tel, address, email_for_customer);
       System.out.println("Details of the customer: ");
       System.out.println(custObj);
      
       // create lines between project and customer details
       System.out.println();
       System.out.println();
      
       // details of the project
       //Enter project number using Scanner function
       System.out.println("These column inputs the details of the project");
       System.out.println("Enter project number: ");
       Scanner proj_num = new Scanner(System.in);
       int project_number = proj_num.nextInt();
      
       // Enter ERF number
       System.out.println("Enter ERF number: ");
       Scanner ERF_num = new Scanner(System.in);
       String ERF_number = ERF_num.nextLine();
      
       // Enter customer name
       System.out.println("Enter customer name: ");
       Scanner proj_cust_name = new Scanner(System.in);
       String project_customer_name = proj_cust_name.nextLine();
      
       // Enter customer surname
       System.out.println("Enter customer surname: ");
       Scanner proj_cust_surname = new Scanner(System.in);
       String project_customer_surname = proj_cust_surname.nextLine();
       String project_customer = project_customer_surname + " " + project_customer_name;
      
       // Enter project name
       System.out.println("Enter project name: ");
       Scanner proj_name = new Scanner(System.in);
       String project_name = proj_name.nextLine();
      
      
       // Enter project type using Scanner
       System.out.println("Enter project type: ");
       Scanner proj_type = new Scanner(System.in);
       String project_type = proj_type.nextLine();
      
       if(project_name == " ")
       {
           project_name = project_type + project_customer_surname;
       }
      
       // entering dates using scanner function
       // use simpleDateFormat to store dates in date format
       // use date1.after(date2) to compare two dates inputs
       System.out.println("Enter current date (yyyy-MM-dd):");
       Scanner current_date = new Scanner(System.in);
       String date1 = current_date.nextLine();
       System.out.println("Enter deadline for the project (yyyy-MM-dd): ");
       Scanner deadline = new Scanner(System.in);
       String date2 = deadline.nextLine();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date first_date = sdf.parse(date1);
       Date second_date = sdf.parse(date2);
       System.out.println();// create a double line between inputs and results
       System.out.println();
       Project projObj = new Project(project_number, ERF_number, project_customer, project_name, project_type, date2);
       System.out.println("Details of the project: ");
       System.out.println(projObj);
       if (first_date.after(second_date))
       {
          
System.out.println("Project is overdue");
}
       // create lines between project and invoice details
       System.out.println();
       System.out.println();
      
       // Invoice details
       System.out.println("These column inputs the details of the invoice");
       System.out.println("Enter the name of the customer :");
       Scanner cust_inv_name = new Scanner(System.in);
       String invoice_customer = cust_inv_name.nextLine();
      
       System.out.println("Enter the telephone numbers of the customer: ");
       Scanner cust_inv_tel = new Scanner(System.in);
       String invoice_telephone_numbers = cust_inv_tel.nextLine();
      
       System.out.println("Enter the total fee to be paid:");
       Scanner total_fee_cust = new Scanner(System.in);
       double total_fee = total_fee_cust.nextDouble();
      
       System.out.println("Enter the total fee paid:");
       Scanner total_paid_cust = new Scanner(System.in);
       double total_paid = total_paid_cust.nextDouble();  
      
       double balance = total_fee - total_paid;
       if (balance == 0)
       {
           System.out.println("Your balance is 0 so there is no invoice ");
       }
       System.out.println();// create a double line between inputs and results
       System.out.println();
      
       System.out.println("INVOICE ");
       Invoice objInv = new Invoice(invoice_customer, invoice_telephone_numbers, total_fee, total_paid, balance);
       System.out.println(objInv);
   }
}
