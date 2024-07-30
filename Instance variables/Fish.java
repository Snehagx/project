class Fish
{
	String type;
	String size;
	
	public Fish(String typeLocal, String sizeLocal)
	{
		System.out.println("Start constructor in Fish");
		System.out.println("Type of fish: "+typeLocal);
		System.out.println("Size of fish: "+sizeLocal);
		
		System.out.println("                                       ");
		type=typeLocal;
		size=sizeLocal;
		
		System.out.println("Instance Type of fish: "+type);
		System.out.println("Instance Type of fish: "+size);
		
		System.out.println("End constructor in Fish");
	}
	
	
}