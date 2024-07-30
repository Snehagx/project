class PrintingMachine
{
	String brand;
	String type;
	
	public PrintingMachine(String brandLocal, String typeLocal)
	{
		System.out.println("Start constructor in PrintingMachine");
		System.out.println("brand of PrintingMachine: "+brandLocal);
		System.out.println("type of PrintingMachine: "+typeLocal);
		
		System.out.println("                                       ");
		brand=brandLocal;
		type=typeLocal;
		
		System.out.println("Instance brand of PrintingMachine: "+brand);
		System.out.println("Instance colour of PrintingMachine: "+type);
		
		System.out.println("End constructor in PrintingMachine");
	}
	
	
}