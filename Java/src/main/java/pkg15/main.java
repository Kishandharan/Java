package pkg15;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "";
        String[] arr1 = s1.split("");
        String[] output = new String[80];
        output[0] = arr1[0];
        output[1] = arr1[1];
        output[2] = arr1[2];

        output[3] = arr1[0]+arr1[1];
        output[4] = arr1[1]+arr1[2];
        output[5] = arr1[2]+arr1[0];

        for(String i : output){
            System.out.println(i);
        }
    }
}
