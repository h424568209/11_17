import java.util.Arrays;

public class Main_11_17_1 {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]  = AB [1]^AB[0];
        AB[1] = AB[1]^AB[0] ;
        AB[0]  = AB [1]^AB[0];
        return AB;
    }

    public static void main(String[] args) {
        int []arr= {1,2};

        System.out.println(Arrays.toString(Main_11_17_1.exchangeAB(arr)));
    }
}
