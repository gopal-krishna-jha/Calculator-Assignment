import java.util.*;
public class Main extends Division {
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter first number : ");
	 int number1 = sc.nextInt();
	 System.out.println("");
	 System.out.print("Enter operator : ");
	 char op = sc.next().charAt(0);
	 System.out.print("\n"+"Enter Second number : ");
	 int number2 = sc.nextInt();
	 
	 Main obj = new Main();
	 if(op=='+'){
	    obj.Add(number1,number2);
	 }
	 else if (op=='-'){
	    obj.Sub(number1,number2);
	 }
	 else if (op=='*'){
	    obj.Mul(number1,number2);
	 }
	 else if (op=='/'){
	    obj.Div(number1,number2);
	 }
	 else{
	    System.out.println("Invalid Operator");
	 }

	}

}