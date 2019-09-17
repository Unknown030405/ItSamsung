import java.util.*;

class calculator{
    public static void main(String[] args) {
        while(true) {
        	doEverything();
        	if(ask()) {
        		System.out.println("Goodbye!");
        		break;
        	}
        }
    }
    static void doEverything() {
    	System.out.println("Enter first number: ");
    	Scanner scan = new Scanner(System.in);
    	long a = scan.nextLong();
    	System.out.println("Enter second number: ");
    	long b = scan.nextLong();
    	System.out.println("Enter addition (+) or subtraction (-) or multiplication (*) or division (/): ");
    	char ch = scan.next().charAt(0);
    	switch(ch) {
    	case '+':
    		System.out.println("Result: " + (a+b));
    		break;
    	case '-':
    		System.out.println("Result: " + (a-b));
    		break;
    	case '*':
    		System.out.println("Result: " +  a*b);
    		break;
    	case '/':
    		System.out.println("Result: " +  a/b);
    		break;
    	}
    }
    static boolean ask() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("If you want to continue enter 'Yes' without quotes, else enter 'stop' without qoutes");
    	if (in.next().equals("Yes")){
    		return false;
    	}
		return true;
    }
}