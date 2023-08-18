import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Demo {
	public static void main(String args[]){
	   System.out.println("Hello World");
 	   A a=new A();
	   String s="Ayan";
	   int[] array ={1,2,3,4,52,3,4,5,4,5,6};
 	   a.printEvenOrOdd(15);
	   a.printEvenNumbers(9,30);
	   a.reverseNumber(34567);
	   a.isPalindrome(121);
	   
	   a.swapTwonumbers(1,2);
	   a.generateRandomNumber(100,1);
	   a.duplicateElements(array);
	   a.removeDups(array);
	   a.stringManage(s);
	   
	   B b=new B();
	}
}

class B{
	B(){
		Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Id : " ); 
	   int id=sc.nextInt();
	   System.out.print("Enter Name : " );
	   String name=sc.next();
	   System.out.print("Enter Age : " );
	   int age=sc.nextInt();
	   System.out.print("Enter Salary : " );
	   int salary=sc.nextInt();
	   System.out.print("Enter Designation : " );
	   String deg=sc.next();
	   System.out.print("Id : " + id+ " Name : " +name+ " Age : " + age + " Salary : " + salary+" Designation : " + deg);
	}
	public static void main(String args[]){
	   System.out.println("Inside - B ");
	   
	   
	}
}
class A{
	public static void main(String args[]){
	   System.out.println("Hello A");
	}
	public static void printEvenOrOdd(int number) {
          	if (number % 2 == 0) {
            		System.out.println(number + " is even.");
          	} else {
            		System.out.println(number + " is odd.");
          	}
       }
	public static void printEvenNumbers(int start, int end) {
        	if (start % 2 != 0) {
           	    start++; 
        	}
        	for (int i = start; i <= end; i += 2) {
            		System.out.print(i + " ");
        	}
        	System.out.println();
    	}
	public static void reverseNumber(int number) {
        	int reversed = 0;
        	while (number != 0) {
            		int digit = number % 10;
            		reversed = reversed * 10 + digit;
            		number /= 10;
        	}

        	System.out.println(reversed);
    	}
	public static void isPalindrome(int number) {
        	int originalNumber = number;
        	int reversed = 0;

        	while (number != 0) {
            	int digit = number % 10;
            	reversed = reversed * 10 + digit;
            	number /= 10;
        	}

        	boolean ans= originalNumber == reversed;
			System.out.println(ans);
    	}
	public static void swapTwonumbers(int a,int b) {
		System.out.println(a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " "+b);
	}
	public static void fibonacciSeries(int n) {
		int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(fib[i] + " ");
        }

	}	
	public static void stringReverse(String s){
		StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();
        System.out.println(reversed.toString());
	}
	public static void generateRandomNumber(int max,int min) {		
		System.out.println(ThreadLocalRandom.current().nextInt(min, max));
	}
	public static void duplicateElements(int[] array) {
		Map<Integer,Integer> map=new HashMap<>();
		int largest=0;
		int sum=0;
		for(int num:array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			largest=Math.max(largest,num);
			sum+=num;
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey()+" ");
            }
        }
		Arrays.sort(array);
		System.out.println("Largest Number : " + largest );
		System.out.println("Sum Number : " + sum );
		System.out.print("Sorted Array : ");
		for(int i:array) {
			System.out.print(i + " ");
		}
	}
	public static void removeDups(int[] array) {
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> uniqueList = new ArrayList<>();
		int odd=0,even=0;
		for(int num:array) {
			if(odd%2==1) {
				odd++;
			}
			else {
				even++;
			}
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.get(num) == 1) {
				uniqueList.add(num);
            }
			
		}
		
		for (int num : uniqueList) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println("Odd :" +odd + " Even : " + even );
	} 
	public static void stringManage(String s) {
		System.out.println("Number of Character in this : "+ s.length());
		
		StringBuilder result = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			}
			else {
				result.append(Character.toUpperCase(c));
			}
		}
		System.out.println(result.toString());
		
	} 
}


