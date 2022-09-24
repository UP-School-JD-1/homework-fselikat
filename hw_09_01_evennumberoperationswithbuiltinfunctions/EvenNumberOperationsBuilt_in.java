package hw_09_01_evennumberoperationswithbuiltinfunctions;
import java.util.function.IntConsumer;


public class EvenNumberOperationsBuilt_in {
	
	int sum = 0;
	int product = 1;
	int[] squares = new int[5];
		
	public static void main(String[] args) {
		EvenNumberOperationsBuilt_in  enob= new EvenNumberOperationsBuilt_in();
		
		doENO(10,(int k) -> System.out.println(k));
	
		doENO(10, (int k) -> enob.sum += k);
		System.out.println("Sum: " +enob.sum);

		doENO(10, (int k) -> enob.product *= k);
		System.out.println("Product: " + enob.product);

		doENO(10, (int k) -> enob.squares[k/2 -1] = k * k);
		System.out.println("Squares");
			
		for(int i : enob.squares) 
			System.out.print(i + " ");
		
		
	}
	public static void doENO( int n,IntConsumer operation) {
		for(int i = 1; i <= n; i++)
			if(i % 2 == 0)
				operation.accept(i);
		
	}


}
