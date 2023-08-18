import java.util.*;
class Demo17{
	public static void main(String args[]){
		m1();
	}
	static void m1(){
		m2();
		System.out.println("M1 class");
	}
	static void m2() {
		m3();
		System.out.println("M2 class");
	}
	static void m3() {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a value : ");
	    		int a=sc.nextInt();
			System.out.print("Enter a value : " );
			int b=sc.nextInt();
			System.out.print("Enter a value : " );
			String c=sc.next();
			int ans=a+Integer.parseInt(c);
			System.out.println("Result : "+ ans);
		}catch(NumberFormatException ne){
			System.out.print("Enter number only. ");
		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println(e);
		}
		//File f=new File();
		//FileReader fr=new FileReader(fr);
}
	}