class Train
{
	public static void book(String source, String destination)
	{
		System.out.println("This is a method with two parameter");
		System.out.println("The source location is: "+source);
		System.out.println("The destination location is: "+destination);
		System.out.println("================================================");
	}
	
	public static void book(String source, String destination, int quantity)
	{
		System.out.println("This is a method with three parameter");
		System.out.println("The source location is: "+source);
		System.out.println("The destination location is: "+destination);
		System.out.println("Number of people travelling in train: "+quantity);
		System.out.println("================================================");
	}
	
	public static void book(String source, String destination, int quantity, int price)
	{
		System.out.println("This is a method with four parameter");
		System.out.println("The source location is: "+source);
		System.out.println("Number of people travelling in train: "+quantity);
		System.out.println("The destination location is: "+destination);
		System.out.println("Price of train ticket per head: "+price);
		System.out.println("================================================");
	}
	
	public static void cancel(String ticketNo)
	{
		System.out.println("This is a method with one parameter");
		System.out.println("Ticket ID: "+ticketNo);
		System.out.println("================================================");
	}
	
	public static void cancel(String source, String destination)
	{
		System.out.println("This is a method with two parameter");
		System.out.println("Enter the source location to cancel your journey: "+source);
		System.out.println("Enter the destination location to cancel your journey: "+destination);
		System.out.println("================================================");
	}
	
}