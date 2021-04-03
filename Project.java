public class Project
{
	// attributes
	int project_number;
	String project_name;
	String project_type;
	String ERF_number;
	String customer_name;
	String customer_surname;
	String customer;
	String deadline;
	public Project(int project_number, String ERF_number, String customer, String project_name, String project_type, String deadline)
	{
		/*The public method has 6 arguments
		 * Below the constructor invokes the arguments initialized in the beginning of method */
		this.project_number = project_number;
		this.project_name = project_name;
		this.project_type = project_type;
		this.ERF_number = ERF_number;
		this.customer = customer;
		this.deadline = deadline;
		}
	
	//public method that will return the argument customer in a string form
	public String getCustomer()
	{
		return customer;
		}
	
	//public method that will return the argument ERF number in a string form
	public String getERFNumber()
	{
		return ERF_number;
		}
	
	//public method that will return the argument project type in a string form
	public String getProjectType()
	{
		return project_type;
		}
	
	//public method that will return the argument project name in a string form
	public String getProjectName()
	{      
		return project_name;
		}
	
	//public method that will return the argument deadline in a string form
	public String getDeadline()
	{
		return deadline;
		}
	
	// public method toString that will return all the arguments in other methods
	public String toString()
	{
		String output = "Project number: " + project_number + "\n";
	output += "ERF number: " + ERF_number + "\n";
	output += "Customer name: " + customer + "\n";  
	output += "Project name: " + project_name + "\n";
	output += "Project type: " + project_type + "\n";
	output += "Project deadline: " + deadline;
	return output;
	}
	}
