class Lamp
{
	String brand;
	String colour;
	
	public Lamp(String brandLocal, String colourLocal)
	{
		System.out.println("Start constructor in lamp");
		System.out.println("brand of lamp: "+brandLocal);
		System.out.println("colour of lamp: "+colourLocal);
		
		System.out.println("                                       ");
		brand=brandLocal;
		colour=colourLocal;
		
		System.out.println("Instance brand of lamp: "+brand);
		System.out.println("Instance colour of lamp: "+colour);
		
		System.out.println("End constructor in lamp");
	}
	
	
}