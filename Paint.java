class Paint
{
	public static void wall(String brand)
	{
		System.out.println("This is first method with one parameter");
		System.out.println("The brand is: "+brand);
		System.out.println("-------------------------------------------");
		
	}
	public static void door(String brand, String colour)
	{
		System.out.println("This is second method with two parameter");
		System.out.println("The brand name is: "+brand);
		System.out.println("The colour is: "+colour);
		System.out.println("-------------------------------------------");
	}
	public static void book(String brand, double price)
	{
		System.out.println("This is third method with two parameter");
		System.out.println("The brand is: "+brand);
		System.out.println("The price is: "+price);
		System.out.println("-------------------------------------------");
	}
	public static void canvas(String colour, String type, double price)
	{
		System.out.println("This is fourth method with three parameter");
		System.out.println("The colour is: "+colour);
		System.out.println("The type is: "+type);
		System.out.println("The price is: "+price);
		System.out.println("-------------------------------------------");
	}
	
}