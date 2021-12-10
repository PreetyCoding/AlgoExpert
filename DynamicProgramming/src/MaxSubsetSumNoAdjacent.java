import java.net.StandardSocketOptions;
import java.util.*;

//Maximum sum of non-adjacent elements in an array

class Program {
    public static int MaxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if(array==null)
            return 0;
        int[] dpAr = new int[array.length+1];
        dpAr[0] = 0;
        if(array.length>=1)
            dpAr[1] = array[0];
        for(int i = 1;i<array.length;i++){
            dpAr[i+1] = Math.max(array[i]+dpAr[i-1], dpAr[i]);
        }
        return dpAr[array.length];
    }

    public static void main(String[] args) {
        System.out.println(MaxSubsetSumNoAdjacent(new int[]{1,2,4,5,1,2}));
    }
}
