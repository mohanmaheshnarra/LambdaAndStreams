package epam.lambdaAndStreams;
import java.io.*;
import java.util.*;
public class find_average_of_array_elements {
	   public static void main(String []args){
	        // System.out.println("Hello World");
	        Scanner inpu=new Scanner(System.in);
	        int n=inpu.nextInt();
	        int[] s=new int[n];
	        int i;
	        for(i=0;i<n;i++){
	            s[i]=inpu.nextInt();
	        }
	        Double avg=findAverageUsingStream(s);
	        System.out.println(avg);
	        
	     }
	     public static double findAverageUsingStream(int[] array) {
	        return Arrays.stream(array).average().orElse(Double.NaN);
	    }
}
