class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("running deliver method in DeliveryGuy class");
		System.out.println("*****************************************************");
		DeliveryVehicle.deliver(item,"Bangalore");
	}
}