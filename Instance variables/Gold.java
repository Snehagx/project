class Gold
{
	String carat;
	String type;
	int cost;
	
	public Gold(String caratLocal, String typeLocal, int costLocal)
	{
		System.out.println("Start constructor in Gold");
		System.out.println("colour of Gold: "+caratLocal);
		System.out.println("type of Gold: "+typeLocal);
		System.out.println("cost of Gold: "+costLocal);
		
		System.out.println("                                       ");
		carat=caratLocal;
		type=typeLocal;
		cost=costLocal;
		
		System.out.println("Instance carat of Gold: "+carat);
		System.out.println("Instance type of Gold: "+type);
		System.out.println("Instance cost of Gold: "+cost);
		
		System.out.println("End constructor in Gold");
		System.out.println("                                       ");
	}
	
	
}