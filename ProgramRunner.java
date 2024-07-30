class ProgramRunner
{
	public static String instruction(double cost)
	{
		System.out.println("instruction in ProgramRunner");
		System.out.println("cost: "+cost);
		if(cost>500)
		{
			return "valid cost";
		}
		else if(cost<100 && cost>10)
		{
			return "invalid cost";
		}
		return "Not Applicable";
	}
	
	
	public static String correction(String name)
	{
		System.out.println("instruction in ProgramRunner");
		System.out.println("name: "+name);
		if(name=="Manjunath Provision Stores")
		{
			
			return "valid shop name";
		}
		else
		{
			return"NA";
		}
	}
	
	
	public static void error()
	{
		System.out.println("error in ProgramRunner");
		String name1="Sneha G";
		
		if(name1=="Sneha G")
		{
			System.out.println("name: "+name1);
			return;
		}
		else if(name1=="Harshitha")
		{
			return;
		}
	}
	
	
	public static void main(String[] args)
	{
		String ref=instruction(400);		
		String ref1=correction("Manjunath Provision Stores");	
		
System.out.println(ref1);	
System.out.println(ref);		
	
		error();
		
	}
}