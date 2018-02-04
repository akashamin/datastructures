class factorial {
	public static void main (String args []) {
		System.out.println("Factorial of 4 is : " + factorial(4));
	}

	static int factorial(int n){
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}