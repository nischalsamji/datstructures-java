import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeComplexity {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long testPrime =  Long.parseLong(br.readLine());
		FileWriter fileWriter = new FileWriter("data.csv");
		System.out.println("Testing slow prime");
		long st1 = System.nanoTime();
		boolean val = testPrimeSlow(testPrime);
		long et1 = System.nanoTime();
		if(val)
			fileWriter.append("slow,"+ (et1-st1)+"\n");
		System.out.println("Time Taken:" + (et1 - st1));
		System.out.println("Testing fast prime");
		long st2 = System.nanoTime();
		boolean val2 = testPrimeFast(testPrime);
		long et2 = System.nanoTime();
		System.out.println("Time Taken:" + (et2 - st2)+"\n");
		if(val)
			fileWriter.append("fast,"+ (et2-st2));
		if(val && val2)
			System.out.println("This is prime");
		else
			System.out.println("This is not a prime");
		fileWriter.close();
	}
	
	static boolean testPrimeSlow(long tester){
		for(long i=2 ; i< tester-1; i++){
			if (tester % i == 0)
				return false;
		}
		return true;
	}

	static boolean testPrimeFast(long tester){
		for(long i=2 ; i< Math.sqrt(tester); i++){
			if (tester % i == 0)
				return false;
		}
		return true;
	}
	
}
