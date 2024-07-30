class Lens
{
	String brand;
	String type;
	
	public Lens(String brandLocal, String typeLocal)
	{
		System.out.println("Start constructor in Lens");
		System.out.println("brand of Lens: "+brandLocal);
		System.out.println("colour of Lens: "+typeLocal);
		
		System.out.println("                                       ");
		brand=brandLocal;
		type=typeLocal;
		
		System.out.println("Instance brand of Lens: "+brand);
		System.out.println("Instance colour of Lens: "+type);
		
		System.out.println("End constructor in Lens");
	}
	
	
}