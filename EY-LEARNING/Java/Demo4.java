class A{
	int val=10;
	
}
class B extends A{
	int val=20;
	void display(){
		System.out.println("val : "+val); 
		 
	}
}

class Demo3{
	public static void main(String args[]){
		B p=new B();
		p.display();
		
		
	}
	
	
}