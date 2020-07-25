package epam.lambdaAndStreams;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

interface Messageable{  
     List<String> check(List<String> fi);
}  
class Message{  
    public static List<String> check(List<String> fi){  
        return fi.stream().filter(word ->word.equals(new StringBuffer(word).reverse().toString())).collect(Collectors.toList());
    }  
}  
public class lamda_task2_staticmethod_reference {  
    public static void main(String[] args) {  
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<String> words=new ArrayList<String>();
        int i;
        for(i=0;i<n;i++){
            words.add(in.next());
        }
        Messageable hello = Message::check; 
        List<String> res=hello.check(words); 
        res.forEach(x-> System.out.println(x));
    }  
}