 import java.util.Scanner;
public class Calculatoract{

	public static int multiply (int x, int y) {
		return  x * y;
	}
	public static int subtract (int x, int y) {
		return x - y;
	}
	public static int add (int x, int y) {
		return x + y;
	}
	public static double div (int x, int y) {
		return x / y;
	}

	public static void main (String[] args) {
		Scanner c = new Scanner(System.in);
		int h;

		do {
			System.out.println("Calculator");
			System.out.println("1. Multiplication");
			System.out.println("2. Subtraction");
			System.out.println("3. Addition");
			System.out.println("4. Division");
                        System.out.println("5. Close");
                        
			System.out.print("Choose: ");
			h = c.nextInt();
			
			if (h >= 1 && h <= 4) {
			    System.out.print("First Number: ");
			    int n1 = c.nextInt();
			    
			    System.out.print("Second Number: ");
			    int n2 = c.nextInt();
			    
			    int r = 0;
			    double e = 0;
			    
			    switch (h) {
			        case 1:
			            r = multiply(n1,  n2);
			              break;
			         case 2:
			             r = subtract(n1,  n2);
			             break;
			         case 3:
			             r = add(n1,  n2);
			             break;
			         case 4:
                                     if (n2 != 0){
			             e = div(n1,  n2);
                            }else{
                                    System.out.println("Cant divide by zero");
                                    continue;
                                     }   
			             break;
			    }
			    System.out.println("Result: " + r);
			}
		} while(h != 5 );
	}
} import java.util.Scanner;
public class Calculator{

	public static int multiply (int x, int y) {
		return  x * y;
	}
	public static int subtract (int x, int y) {
		return x - y;
	}
	public static int add (int x, int y) {
		return x + y;
	}
	public static double div (int x, int y) {
		return x / y;
	}

	public static void main (String[] args) {
		Scanner c = new Scanner(System.in);
		int h;

		do {
			System.out.println("Calculator");
			System.out.println("1. Multiplication");
			System.out.println("2. Subtraction");
			System.out.println("3. Addition");
			System.out.println("4. Division");
                        System.out.println("5. Close");
                        
			System.out.print("Choose: ");
			h = c.nextInt();
			
			if (h >= 1 && h <= 4) {
			    System.out.print("First Number: ");
			    int n1 = c.nextInt();
			    
			    System.out.print("Second Number: ");
			    int n2 = c.nextInt();
			    
			    int r = 0;
			    double e = 0;
			    
			    switch (h) {
			        case 1:
			            r = multiply(n1,  n2);
			              break;
			         case 2:
			             r = subtract(n1,  n2);
			             break;
			         case 3:
			             r = add(n1,  n2);
			             break;
			         case 4:
                                     if (n2 != 0){
			             e = div(n1,  n2);
                            }else{
                                    System.out.println("Cant divide by zero");
                                    continue;
                                     }   
			             break;
			    }
			    System.out.println("Result: " + r);
			}
		} while(h != 5 );
	}
}