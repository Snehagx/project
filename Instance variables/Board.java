class Board
{
	String name;
	String colour;
	int cost;
	
	public Board(String nameLocal, String colourLocal, int costLocal)
	{
		System.out.println("Start constructor in Board");
		System.out.println("colour of Board: "+nameLocal);
		System.out.println("type of Board: "+colourLocal);
		System.out.println("cost of Board: "+costLocal);
		
		System.out.println("                                       ");
		name=nameLocal;
		colour=colourLocal;
		cost=costLocal;
		
		System.out.println("Instance name of Board: "+name);
		System.out.println("Instance colour of Board: "+colour);
		System.out.println("Instance cost of Board: "+cost);
		
		System.out.println("End constructor in Board");
		System.out.println("                                       ");
	}
	
	
}