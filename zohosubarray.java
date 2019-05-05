//@author-Ravisankar
import java.util.Scanner;
public class zohosubarray {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int[]arr={36,145,67,1004,88,456,2034};//initializing array
    int window_size=sc.nextInt();//getting window size
    int []sub_arr=new int[window_size] ;//initializing subarray
         int arrlength=arr.length;//length of the array
         int limit=arrlength-window_size;//setting boundaries to generate subarray
         for(int i=0;i<=limit;i++) {
             for (int j = i, a = 0; j < (j + window_size) && a < window_size; j++, a++) {
                 sub_arr[a] = arr[j];
             }
             System.out.print("{");
             int temp = 0;
             for (int k = 0; k < window_size; k++) {
                 if (temp < sub_arr[k]) {//finding the largest number in the sub array
                     temp = sub_arr[k];
                 }
                 if (k == (window_size - 1)) {//printing elements in the sub array
                     System.out.print(sub_arr[k]);
                 } else {
                     System.out.print(sub_arr[k] + ",");
                 }
             }
             System.out.print("} : ");
             //System.out.print(" "+temp);
             String s = "" + temp;//int->string
             int len = s.length();//finding the length of the largest number
             //System.out.print(" "+len);
             int number[] = new int[len];//setting the len as the size of the final output
             for (int m = 0; m < len; m++) {//setting the value of the final ouput in reverse order
                 int tempp = 0;
                 int t = 0;
                 for(int n=0;n<window_size;n++) {// iterating through elements in the subarray
                     if (sub_arr[n] != 0) {//finding the largest number based in each unit position
                         int a = sub_arr[n];
                         t = a % 10;
                         sub_arr[n] = sub_arr[n] / 10;
                     }
                     if (tempp <= t) {
                         tempp = t;
                     }
                 }
                 number[m] = tempp;//filling the array with largest number from each unit position of numbers in the subarray
             }
             for (int x = len - 1; x >= 0; x--){ //printing it in backwards
                 System.out.print(number[x]);
             }
             System.out.println("");
         }
}
}
