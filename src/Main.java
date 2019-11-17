import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.next();
            int []arr = new int[s.length()];
            for(int i = 0 ; i < s.length() ; i++){
                arr[i] = s.charAt(i) - '0';
            }
            Arrays.sort(arr);
            int count = 0 ;
            int j = 0;
            for(int i = 0 ; i < arr.length ; ){
                while(j<arr.length&&arr[i] == arr[j]){
                    count++;
                    j++;
                }
                System.out.println(arr[i]+":"+count);
                i = j ;
                count = 0;
            }

        }
    }
}
