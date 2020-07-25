package epam.lambdaAndStreams;
  
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class lamda_task2_return_listofstrings_with_given_conditions{

     public static void main(String []args){
        // System.out.println("Hello World");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<String> words=new ArrayList<String>();
        int i;
        for(i=0;i<n;i++){
            words.add(in.next());
        }
        List<String> fi=checkstring(words);
        fi.forEach(x-> System.out.println(x));
     }
     public static List<String> checkstring(List<String> result){
         return result.stream().filter(word -> word.length()==3 && word.charAt(0)=='a')
                .collect(Collectors.toList());
         
     }
}
