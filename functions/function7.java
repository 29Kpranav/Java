import java.util.ArrayList;
import java.util.List;

public class function7{
 
public static void main(String args[]){
    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    int sum = 0;
    for(int i = 0; i< a.size(); i++){
        sum += a.get(i);
    }
    int max = 0;
    int min = 0;
    for(int j=0; j<a.size(); j++){
       if(a.get(j) > max){
           max = a.get(j);
       }
       if(a.get(j) < min){
           min = a.get(j);
       }
    }
    int c = sum-min;
    int b = sum-max;
    System.out.println(b+" "+c);
}
}