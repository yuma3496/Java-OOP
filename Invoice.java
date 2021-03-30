public class Invoice // class declaration
{
   // attributes
   String customer_name;
   String customer_surname;
   String customer;
   double total_fee;
   double total_paid;
   double balance;
   String contact_details;
   public Invoice(String customer, String contact_details, double total_fee, double total_paid, double balance)
   {
       /*The public method has 6 arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.customer = customer;
       this.total_fee = total_fee;
       this.total_paid = total_paid;
       this.balance = balance;
       this.contact_details = contact_details;
   }
   //public method that will return the argument customer in a string form
   public String getCustomer()
   {
       return customer;
   }
   //public method that will return the argument contact details in a string form
   public String getContanctdetails()
   {
       return contact_details;
   }
   //public method that will return the argument total fee in a double form
   public double getTotalFee()
   {
       return total_fee;
   }
   //public method that will return the argument total paid in a double form
   public double getTotalPaid()
   {
       return total_paid;
   }
   //public method that will return the argument balance in a double form
   public double getBalance()
   {
       return balance;
   }
   // public method toString that will return all the arguments in other methods
   public String toString()
   {
       String output = "Customer name: " + customer + "\n";
       output += "Contact details: " + contact_details + "\n";
       output += "Opening balance:" + total_fee + "\n";
       output += "Paid amount: " + total_paid + "\n";
       output += "closing balance: " + balance;
       return output;
   }
}