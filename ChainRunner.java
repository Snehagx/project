class ChainRunner
{
	public static int carat()
	{
		int carat=24;
		return carat;
	}
	public static double costPerGram()
	{
		double costPerGram=100000;
		return costPerGram;
	}
	public static String type()
	{
		String type="yellow gold";
		return type;
	}
	public static String quality()
	{
		String quality="good";
		return quality;
	}
	public static double quantity()
	{
		double quantity=10;
		return quantity;
	}
	public static String wastage()
	{
		String wastage="10%";
		return wastage;
	}
	public static int serviceCharge()
	{
		int serviceCharge=15000;
		return serviceCharge;
	}
	public static double GST()
	{
		double GST=45.786d;
		return GST;
	}
	
	public static void main(String[] args)
	{
		int carats= carat();
		System.out.println("gold carat: "+carats);
		double costPerGrams= costPerGram();
		System.out.println("costPerGram: "+costPerGrams);
		String types= type();
		System.out.println("type: "+types);
		String qualitys= quality();
		System.out.println("quality: "+qualitys);
		double quantitys= quantity();
		System.out.println("quantity: "+quantitys);
		String wastages= wastage();
		System.out.println("wastage: "+wastages);
		int serviceCharges= serviceCharge();
		System.out.println("serviceCharge: "+serviceCharges);
		double GSTs= GST();
		System.out.println("GST: "+GSTs);
	}
}