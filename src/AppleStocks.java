import java.util.*;
import java.io.*;

//Apple Stocks Problem from Interviewcake
//Naive Code to print profits
class AppleStocks{
	
		public static void main(String[] args){
			Integer stockDetails[] = {12, 25, 7, 8, 34, 65, 78, 32};
			int lowStock = stockDetails[0];
			int highStock = stockDetails[0];
			int lowIndex = 0;
			int highIndex = 0;
			for (int i=0; i<stockDetails.length; i++){
				if(stockDetails[i] <  lowStock)
					lowStock = stockDetails[i];
				if(stockDetails[i] > highStock)
					highStock = stockDetails[i];		
			}
		System.out.println(highStock - lowStock);
		System.out.println("Saving Streak just in time");
		}
		
	
}
