Class Bank{
	void loan() {
		System.out.println("8%");
	}
}
Class ICICI extends Bank{
	void loan() {
		System.out.println("10%");
	}
}
Class HDFC extends Bank{
	
}
class Demo5{
	public static void main(String args[]){
		ICICI ic=new ICICI();
		ic.loan();
		
		
	}
	
	
}