class Cap
{
	String colour;
	String type;
	int cost;
	
	public Cap(String colourLocal, String typeLocal, int costLocal)
	{
		System.out.println("Start constructor in Cap");
		System.out.println("colour of Cap: "+colourLocal);
		System.out.println("type of Cap: "+typeLocal);
		System.out.println("cost of Cap: "+costLocal);
		
		System.out.println("                                       ");
		colour=colourLocal;
		type=typeLocal;
		cost=costLocal;
		
		System.out.println("Instance colour of Cap: "+colour);
		System.out.println("Instance type of Cap: "+type);
		System.out.println("Instance cost of Cap: "+cost);
		
		System.out.println("End constructor in Cap");
		System.out.println("                                       ");
	}
	
	
}