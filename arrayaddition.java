//author @ravisankar
import java.util.Scanner;
public class arrayaddition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int [] ans;
        int carry=0;
        int a1=sc.nextInt();
        int arr1[]=new int[a1];
        int i=0;
        int j=0;
        while(i<a1){
            arr1[i]=sc.nextInt();
            i=i+1;
        }
        int a2=sc.nextInt();
        int arr2[]=new int[a2];
        while (j<a2){
            arr2[j]=sc.nextInt();
            j=j+1;
        }
        if(a1>a2){
             n=a1+1;
             ans=new int[n];
        }else{
             n=a2+1;
            ans=new int[n];
        }
        int k;
        for(i=a1-1,j=a2-1,k=n-1;i>=0&&j>=0&&k>=0 ;i--,j--,k--){
            if(arr1[i]+arr2[j]+carry>9){
                ans[k]=(arr1[i]+arr2[j]+carry)%10;
                carry=1;
            }else if(arr1[i]+arr2[j]+carry<10) {
                ans[k]=(arr1[i]+arr2[j]+carry);
                carry=0;
            }

        }
        if(a1>a2){
            int diff=a1-a2;
            for(i=diff-1,j=diff;i>=0&&j>=0;i--,j--){
              if(i==0){
                  if(arr1[i]+carry>9) {
                      ans[j] = (arr1[i] + carry)%10;
                      carry=1;
                      ans[0]=carry;
                  }else if(arr1[i]+carry<10){
                      ans[j] = arr1[i] + carry;
                      carry=0;
                      ans[0]=carry;
                  }
              } else{
                if(arr1[i]+carry>9) {
                    ans[j] = (arr1[i] + carry)%10;
                    carry=1;
                }else if(arr1[i]+carry<10){
                    ans[j] = arr1[i] + carry;
                    carry=0;
                }
                }

            }
        }else if(a2>a1){
            int diff=a2-a1;
            for(i=diff-1,j=diff;i>=0&&j>=0;i--,j--){
                if(i==0){
                    if(arr2[i]+carry>9) {
                        ans[j] = (arr2[i] + carry)%10;
                        carry=1;
                        ans[0]=carry;
                    }else if(arr2[i]+carry<10){
                        ans[j] = arr2[i] + carry;
                        carry=0;
                        ans[0]=carry;
                    }
                } else{
                    if(arr2[i]+carry>9) {
                        ans[j] = (arr2[i] + carry)%10;
                        carry=1;
                    }else if(arr2[i]+carry<10){
                        ans[j] = arr2[i] + carry;
                        carry=0;
                    }
                }

            }
        }
        if(ans[0]!=0) {
            for (i = 0; i < n; i++) {

                System.out.print(ans[i] + " ");
            }
        }else{
            for (i = 1; i < n; i++) {

                System.out.print(ans[i] + " ");
            }
        }



    }
}
-----------------------------output-------------------------------------

"size of fisrt operand"-4
5 6 8 7
"size of secpnd operand"-5
9 6 7 2 3
"ans array"
1 0 2 4 1 0 






