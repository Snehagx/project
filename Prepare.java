class Prepare
{
public static void pencil(){
System.out.println("this is java class");
paper();
}
public static void paper(){
System.out.println("this is java class");
pencil();
}
}
class PrepRunner
{
public static void main(String[] args){
Prepare.pencil();
Prepare.paper();
}
}
