class Blood
{
	public static char lab()
	{
		char group='B';
		return group;
	}
	public static String test()
	{
		String personName="Sneha G";
		return personName;
	}
	public static int doc()
	{
		int price=50;
		return price;
	}
	public static String chair()
	{
		String hospitalTested="MCgaan";
		return hospitalTested;
	}
	public static boolean stretcher()
	{
		boolean Sickness=false;
		return Sickness;
	}
	public static boolean camp()
	{
		boolean donate=true;
		return donate;
	}
	public static void main(String[] args)
	{
		char labs= lab();
		System.out.println("blood group: "+labs);
		String tests= test();
		System.out.println("person name: "+tests);
		int docs= doc();
		System.out.println("cost: "+docs);
		String chairs= chair();
		System.out.println("hospital: "+chairs);
		boolean stretchers= stretcher();
		System.out.println("sickness or not: "+stretchers);
		boolean camps= camp();
		System.out.println("donate or not: "+camps);
	}
}