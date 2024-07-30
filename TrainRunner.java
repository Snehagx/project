class TrainRunner
{
	public static void main(String[] args)
	{
		Train.book("bangalore","yeswanthpur");
		Train.book("ballapura","yeswanthpur",10);
		Train.book("django","mongodb",200,150);
		Train.cancel("TKT1234567890");
		Train.cancel("singapore","swiss");
	}
}
	