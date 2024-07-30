class BuyProductRunner
{
	public static void product(String brand, double price)
	{
		System.out.println("running product method");		
		System.out.println("brand name: "+brand);		
		if(brand=="hairbands")
		{
			System.out.println("valid brand");
		}
		else
		{
			System.out.println("invalid brand");
		}
		System.out.println("price is: "+price);
		if(price>1 && price<=50)
		{
			System.out.println("valid price");
		}
		else
		{
			System.out.println("invalid price");
		}
		System.out.println("_____________________________________________");
	}
	
	public static void product(String name, int quantity, String quality, double price)
	{
		System.out.println("running product2 method");		
		System.out.println("product name: "+name);
		if(name=="rice")
		{
			System.out.println("valid product name");
		}
		else
		{
			System.out.println("invalid product name");
		}
		System.out.println("quantity is: "+quantity);
		if(quantity>1 && quantity<=30)
		{
			System.out.println("valid product price");
		}
		else
		{
			System.out.println("invalid product price");
		}
		System.out.println("quality: "+quality);
		if(quality=="premium")
		{
			System.out.println("valid product quality");
		}
		else
		{
			System.out.println("invalid product quality");
		}
		System.out.println("price is: "+price);
		if(price>1000 && price<=1800)
		{
			System.out.println("valid product price");
		}
		else
		{
			System.out.println("invalid product price");
		}
		System.out.println("_____________________________________________");
	}
	
	public static void bookMovieTicket(String name, String theatreName, int quantity, double price)
	{
		System.out.println("running bookMovieTicket method");		
		System.out.println("Movie name: "+name);
		if(name=="kalki")
		{
			System.out.println("valid movie name");
		}
		else
		{
			System.out.println("invalid movie name");
		}
		System.out.println("Theatre Name: "+theatreName);
		if(theatreName=="mallikarjunaTheatre")
		{
			System.out.println("valid theatre name");
		}
		else
		{
			System.out.println("invalid theatre name");
		}
		System.out.println("quantity: "+quantity);
		if(quantity>0 && quantity<=50)
		{
			System.out.println("valid quantity of people");
		}
		else
		{
			System.out.println("invalid quantity of people");
		}
		System.out.println("price for ticket: "+price);
		if(price>100 && price<=1000)
		{
			System.out.println("valid price of ticket");
		}
		else
		{
			System.out.println("invalid price of ticket");
		}
		System.out.println("_____________________________________________");
	}
	
	
	public static void buyEggs(int total, double pricePerEgg)
	{
		System.out.println("running buyEggs method");		
		System.out.println("Total number of eggs: "+total);
		if(total>100 && total<=1000)
		{
			System.out.println("valid total of eggs");
		}
		else
		{
			System.out.println("invalid total of eggs");
		}
		System.out.println("price Per Egg: "+pricePerEgg);
		if(pricePerEgg>1000 && pricePerEgg<=7000)
		{
			System.out.println("valid price Per Egg");
		}
		else
		{
			System.out.println("invalid price Per Egg");
		}
		System.out.println("_____________________________________________");
	}
	
	
	public static void buyShampoo(int quantityInMl, double price, String brand, String manfDate)
	{
		System.out.println("running buyShampoo method");		
		System.out.println("Quantity in milileter : "+quantityInMl);
		if(quantityInMl>100 && quantityInMl<=200)
		{
			System.out.println("valid quantityInMl");
		}
		else
		{
			System.out.println("invalid quantityInMl");
		}
		System.out.println("price Per pack/bottle: "+price);
		if(price>50 && price<=100)
		{
			System.out.println("valid price Per product");
		}
		else
		{
			System.out.println("invalid price Per product");
		}
		System.out.println("brand: "+brand);
		if(brand=="meeraShampoo")
		{
			System.out.println("valid brand name");
		}
		else
		{
			System.out.println("invalid brand name");
		}
		System.out.println("Manufacturing Date: "+manfDate);
		if(manfDate=="jan2024")
		{
			System.out.println("valid manufacturing date");
		}
		else
		{
			System.out.println("invalid manufacturing date");
		}
		System.out.println("_____________________________________________");
	}
	
	
	public static void buyCake(char size, String type, String flavour, double cost, int quantity)
	{
		System.out.println("running buyCake method");		
		System.out.println("size: "+size);
		if(size=='B')
		{
			System.out.println("valid size of cakes");
		}
		else
		{
			System.out.println("invalid size of cakes");
		}
		System.out.println("type: "+type);
		if(type=="pinata")
		{
			System.out.println("valid cake type");
		}
		else
		{
			System.out.println("invalid cake type");
		}
		System.out.println("flavour: "+flavour);
		if(flavour=="chocolate")
		{
			System.out.println("valid cake flavour");
		}
		else
		{
			System.out.println("invalid cake flavour");
		}
		System.out.println("cost: "+cost);
		if(cost>200 && cost<=500)
		{
			System.out.println("valid cost Per product");
		}
		else
		{
			System.out.println("invalid cost Per product");
		}
		System.out.println("quantity: "+quantity);
		if(quantity>0 && quantity<=10)
		{
			System.out.println("valid quantity of cake");
		}
		else
		{
			System.out.println("invalid quantity of cake");
		}
		System.out.println("_____________________________________________");
	}
	
	public static void buyLaptop(String brand, int serialNo, double price, int batteryCapacity, double screenSize, String os, int hardDisk, int ramSize)
	{
		System.out.println("running buyLaptop method");	
		System.out.println("brand name: "+brand);
		if(brand=="lenovo")
		{
			System.out.println("valid brand name");
		}
		else
		{
			System.out.println("invalid brand name");
		}
		System.out.println("serialNo: "+serialNo);
		if(serialNo>734232265 && serialNo<=745279996)
		{
			System.out.println("valid serialNo of laptop");
		}
		else
		{
			System.out.println("invalid serialNo of laptop");
		}
		System.out.println("price is: "+price);
		if(price>10000 && price<=1000000)
		{
			System.out.println("valid price of laptop");
		}
		else
		{
			System.out.println("invalid price of laptop");
		}
		System.out.println("Battery Capacity: "+batteryCapacity);
		if(batteryCapacity>1000 && batteryCapacity<=5000)
		{
			System.out.println("valid batteryCapacity of laptop");
		}
		else
		{
			System.out.println("invalid batteryCapacity of laptop");
		}		
		System.out.println("screenSize:	 "+screenSize);
		if(screenSize>1000 && screenSize<=10000)
		{
			System.out.println("valid screenSize of laptop");
		}
		else
		{
			System.out.println("invalid screenSize of laptop");
		}
		System.out.println("os: "+os);
		if(os=="windows")
		{
			System.out.println("valid operating system");
		}
		else
		{
			System.out.println("invalid operating system");
		}
		System.out.println("hardDisk: "+hardDisk);
		if(hardDisk>1000 && hardDisk<=4600)
		{
			System.out.println("valid hardDisk of laptop");
		}
		else
		{
			System.out.println("invalid hardDisk of laptop");
		}
		System.out.println("ramSize: "+ramSize);
		if(ramSize>2000 && ramSize<=6600)
		{
			System.out.println("valid ramSize of laptop");
		}
		else
		{
			System.out.println("invalid ramSize of laptop");
		}
		System.out.println("_____________________________________________");
	}
	
	
	public static void buySmartWatch(String brand, double price, int colour, char type, int mode)
	{
		System.out.println("running buySmartWatch method");		
		System.out.println("brand name: "+brand);
		if(brand=="boat")
		{
			System.out.println("valid brand of smart watch");
		}
		else
		{
			System.out.println("invalid brand of smart watch");
		}
		System.out.println("price is: "+price);
		if(price>1000 && price<=6000)
		{
			System.out.println("valid price of smart watch");
		}
		else
		{
			System.out.println("invalid price of smart watch");
		}
		System.out.println("colour: "+colour);
		if(colour>=1 && colour<=7) //from1 to 7
		{
			System.out.println("valid colour of smart watch");
		}
		else
		{
			System.out.println("invalid colour of smart watch");
		}
		System.out.println("type: "+type);
		if(type=='d') //digital-d analog-a
		{
			System.out.println("valid ramSize of smart watch");
		}
		else
		{
			System.out.println("invalid ramSize of smart watch");
		}
		System.out.println("mode: "+mode);
		if(mode>0 && mode<=3)
		{
			System.out.println("valid mode of smart watch");
		}
		else
		{
			System.out.println("invalid mode of smart watch");
		}
		System.out.println("_____________________________________________");
	}
	
	public static void main(String[] args)
	{
		System.out.println("running main method with invalid arguments!!!!!!!");				
		product("chopsticks",49.9);		
		product("sugar",40,"standard",1900);
		bookMovieTicket("pushpa2","manjunathTheatre",100,2000);
		buyEggs(1200,10000);
		buyShampoo(1000,200,"karthikaShampoo","jun2025");
		buyCake('A',"dreamCake","pineapple",700,1);
		buyLaptop("dell",554323454,150000,5000,10000,"macos",9876,8765);
		buySmartWatch("truke",15000,9,'k',4);
	
	}
}