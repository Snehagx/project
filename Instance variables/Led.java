class Led
{
	String type;
	String colour;
	int cost;
	
	public Led(String typeLocal, String colourLocal, int costLocal)
	{
		System.out.println("Start constructor in Led");
		System.out.println("colour of Led: "+typeLocal);
		System.out.println("type of Led: "+colourLocal);
		System.out.println("cost of Led: "+costLocal);
		
		System.out.println("                                       ");
		type=typeLocal;
		colour=colourLocal;
		cost=costLocal;
		
		System.out.println("Instance type of Led: "+type);
		System.out.println("Instance colour of Led: "+colour);
		System.out.println("Instance cost of Led: "+cost);
		
		System.out.println("End constructor in Led");
		System.out.println("                                       ");
	}
	
	
}