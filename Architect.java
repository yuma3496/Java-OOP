public class Architect // class declaration
{
   // attributes
   String name;
   int telephone_number;
   String email_address;
   String physical_address;
   public Architect(String name, int telephone_number, String email_address, String physical_address)// constructor with 3 arguments
   {
       /*The constructor has three arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.name = name;
       this.telephone_number = telephone_number;
       this.email_address = email_address;
       this.physical_address = physical_address;
   }
   public String getName()// constructor that will return the argument name
   {
       return name;
   }
   public String getEmailAddress()// constructor that will return the argument email address
   {
      
       return email_address;
   }
   public String getPhysiclAddress()// constructor that will return the argument physical address
   {
      
       return physical_address;
   }
   public int getTelephone()// constructor that will return the argument telephone
   {
       return telephone_number;
   }
  
   public String toString()// Create constructor toString that will return all the arguments in other constructors
   {
      
       String output = "Name: " + name + "\n";
       output += "Telephone number: " + telephone_number + "\n";
       output += "Email address: " + email_address + "\n";
       output += "Physical address: " + physical_address + "\n";
       return output;
   }
}