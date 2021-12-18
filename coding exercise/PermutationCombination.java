package permutaioncombination;

public class PermutationCombination {

	public static void main(String[] args) {
		System.out.println(nCr(3,2));
		System.out.println(nPr(3,2));
	}
	
	public static int nCr(int n, int r) {
		int result=factorial(n)/(factorial(n-r)*factorial (r));
		return result;
	}
	
	public static int nPr(int n, int r) {
		int result=factorial (n)/factorial(n-r);
		return result;
	}
	public static int factorial(int n) {
		int i=1;
		int fact=1;
		for(i=1;i<=n;i++)
		fact=fact*i;
		return fact;
	}
}
