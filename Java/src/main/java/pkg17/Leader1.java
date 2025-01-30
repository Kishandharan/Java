package pkg17;
import java.util.ArrayList;

public class Leader1 {
    public static void main(String[] args){
        ArrayList<Integer>leaders = new ArrayList<>();
        int[] arr1 = {7, 17, 9, 2, 8, 3};
        int lcn;

        for (int j = 0; j < arr1.length; j++) {
            lcn = arr1[j];
            for (int i = j+1; i < arr1.length; i++) {
                if(lcn > arr1[i]) {
                    continue;
                }
            }
        }

        System.out.println(leaders);
    }
}
