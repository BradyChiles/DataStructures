
public class Fibonacci{

	public static void main(String[] args) {
		System.out.println(fib(4));
	}
	
	private static int fib(int n){
		System.out.println("Calculating " +  n + " fib number");
		//if base case returns  value
		//else recursive step
		if(n == 1 || n == 0){
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}
}
