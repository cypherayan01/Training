class Emp{
	int id=10;
	String name="AYAN";
	final int salary=10000;
	final void display(){
	}
}
final class Clerk extends Emp{

}
final class Dev extends Emp{

}

public class Demo16{
	public static void main(String args[]){
		Clerk c=new Clerk();
		System.out.println(c.id+" "+c.name+"  "+c.salary);
		
		Dev d=new Dev();
		System.out.println(d.id+" "+d.name+"  "+d.salary);
	}
}
		