class SimCard
{
	String brandName;
	String modelno;
	int price;
	
	public SimCard(String brandNameLocal, String modelnoLocal, int priceLocal)
	{
		System.out.println("Start constructor in SimCard");
		System.out.println("colour of SimCard: "+brandNameLocal);
		System.out.println("type of SimCard: "+modelnoLocal);
		System.out.println("cost of SimCard: "+priceLocal);
		
		System.out.println("                                       ");
		brandName=brandNameLocal;
		modelno=modelnoLocal;
		price=priceLocal;
		
		System.out.println("Instance type of SimCard: "+brandName);
		System.out.println("Instance colour of SimCard: "+modelno);
		System.out.println("Instance cost of SimCard: "+price);
		
		System.out.println("End constructor in SimCard");
		System.out.println("                                       ");
	}
	
	
}