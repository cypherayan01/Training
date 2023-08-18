class Parent{
	int val=10;
	void PDisplay(){
		System.out.println("Parent val : "+ val); 
	}
}
class Child extends Parent{
	String cString="Ayan";
	void CDisplay(){
		System.out.println("Child val : "+ super.val); 
		System.out.println("Child cString : "+ cString); 
	}
}

class Demo3{
	public static void main(String args[]){
		Parent p=new Parent();
		p.PDisplay();
		
		Child c=new Child();
		c.CDisplay();
	}
	
	
}