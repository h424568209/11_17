import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Mains_11_16 {
    public int[] multiply(int[] A) {
        int []B = new   int[A.length];
        Queue<Integer> queue = new LinkedList<>();
        int num = 1;
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A.length ;j++) {
                if(i!=j){
                    num *= A[j];
                }
            }
            B[i] = num;
            num = 1;
        }
        return B;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3};
        Mains_11_16 m = new Mains_11_16();
        System.out.println(Arrays.toString(m.multiply(arr)));
        byte a = 127;
        byte b = 127;
        ++a;
        System.out.println(a);
        b = ++b;
        System.out.println(++b);
    }

}
