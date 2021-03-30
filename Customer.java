public class Customer // class declaration
{
   // attributes
   String name;
   int telephone_number;
   String email_address;
   String physical_address;
   public Customer(String name, int telephone_number, String email_address, String physical_address)// constructor with 4 arguments
   {
       /*The constructor has 4 arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.name = name;
       this.telephone_number = telephone_number;
       this.email_address = email_address;
       this.physical_address = physical_address;
   }
   public String getName()//public method that will return the argument name in a string form
   {
       return name;
   }
   public String getEmailAddress()//public method that will return the argument email in a string form
   {
       return email_address;
   }
   public String getPhysiclAddress() //public method that will return the argument physical address in a string form
   {
       return physical_address;
   }
   // public method toString that will return all the arguments in other methods
   public String toString()
   {
       String output = "Name: " + name + "\n";
       output += "Telephone number: " + telephone_number + "\n";
       output += "Email address: " + email_address + "\n";
       output += "Physical address: " + physical_address + "\n";
       return output;
   }
}