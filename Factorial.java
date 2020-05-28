package introduction;

import  java.util.*;

class Factorial{
	int fact(int n) {
		int result;
		if(n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Enter a number to calculate it's factorial: ");
		Factorial object = new Factorial();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Result = object.fact(N);
		System.out.println("The factorial of " + N + " is " + Result);
	}

}
