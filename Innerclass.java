class OuterClass
{
	int x=20;
}

class InnerClass
{
	int y=10;
}

public class main{
	public static void main(String[] args)
	{
		OuterClass myOuter=new OuterClass();
		OuterClass.InnerClass myInner=myOuter.new InnerClass();
		
		System.out.println("Hello");
		System.out.println("there is class today");
		System.out.println("welcome to java class");
		System.out.println("have a nice day");
		System.out.println("there is no class tomorrow");
		System.out.println("to bytecode");
		System.out.println("hey,Sneha!!");
		System.out.println("i'm busy today");
		System.out.println("platform independent java");
		System.out.println("methods and declarations");
	}
}