package pkg16;

public class Main {
    public static void main(String[] args){
        String[] arr1 = {"A","B","C","D"};
        String[] arr2 = new String[20];
        arr2[0]=arr1[0];
        arr2[1]=arr1[1];
        arr2[2]=arr1[0];

        arr2[3]=arr1[0]+arr1[1];
        arr2[4]=arr1[1]+arr1[2];
        arr2[5]=arr1[2]+arr1[0];

        for(String i : arr2){
            System.out.println(i);
        }
    }
}
