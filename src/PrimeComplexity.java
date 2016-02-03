import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeComplexity {
	//This is to test the time complexity of a sample java program
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the range");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long testPrime =  Long.parseLong(br.readLine());
		FileWriter fileWriter = new FileWriter("data.csv");
		for(long i=2; i<= testPrime; i++){
			
			long st1 = System.nanoTime();
			boolean val = testPrimeSlow(i);
			long et1 = System.nanoTime();
			if(val)
				fileWriter.write(i + ",slow,"+ (et1-st1)+",true"+"\n");
			else
				fileWriter.write(i + ",slow,"+ (et1-st1)+",false"+"\n");
			System.out.println("Time Taken:" + (et1 - st1));
			System.out.println("Testing fast prime");
			long st2 = System.nanoTime();
			boolean val2 = testPrimeFast(i);
			long et2 = System.nanoTime();
			if(val2)
				fileWriter.write(i+",fast,"+ (et2-st2)+",true"+"\n");
			else
				fileWriter.write(i+",fast,"+ (et2-st2)+",false"+"\n");
			
		}
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
