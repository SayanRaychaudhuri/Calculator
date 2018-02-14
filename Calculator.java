import java.util.*;

public class Calculator {
 
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String operation = input.nextLine();
    	String[] operationList = operation.split(" ");
		String number1 = operationList[0];
		String operator = operationList[1];
		String number2 = operationList[2];
		int firstnum = Integer.valueOf(number1);
		int secondnum = Integer.valueOf(number2);
		switch (operator) {
			case "+":
				System.out.println(number1 + " + " + number2 + " = " + (firstnum + secondnum));
				break;
			case "-":
				System.out.println(number1 + " - " + number2 + " = " + (firstnum - secondnum));
				break;
			case "*":
				System.out.println(number1 + " * " + number2 + " = " + (firstnum * secondnum));
				break;
			case "/":
				System.out.println(number1 + " / " + number2 + " = " + (firstnum / secondnum));
				break;
			case "^":
				System.out.println(number1 + " ^ " + number2 + " = " + (Math.pow(firstnum, secondnum)));
				break;
		}
		main(null);
    }
}

