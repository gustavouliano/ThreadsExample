import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Número de threads: ");
		int numThreads = input.nextInt();
		System.out.print("Valor para o for: ");
		int numFor = input.nextInt();
		
		MyThread[] threads = new MyThread[numThreads];
		
		for(int i = 0; i < numThreads; i++) {
			threads[i] = new MyThread(numFor);
			threads[i].start();
		}
		input.close();
	}

}
