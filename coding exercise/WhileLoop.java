public class WhileLoop{  
        int num;
	int j = 1;

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a number!");
	num = obj.nextInt();

	while (j <= 10) {
		System.out.println(j * num);
		j++;
	}
}