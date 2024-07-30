class Coil
{
	String type;
	String field;
	
	public Coil(String typeLocal, String fieldLocal)
	{
		System.out.println("Start constructor in Coil");
		System.out.println("type of Coil: "+typeLocal);
		System.out.println("fields Coil used: "+fieldLocal);
		
		System.out.println("                                       ");
		type=typeLocal;
		field=fieldLocal;
		
		System.out.println("Instance type of Coil: "+type);
		System.out.println("Instance fields Coil used: "+field);
		
		System.out.println("End constructor in Coil");
	}
	
	
}