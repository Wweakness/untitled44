import java.util.*;

public class Main1 {
    public static int countWays(int n) {

/*
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        int array[] =new int[n];
        array[0] =1;
        array[1] =2;
        array[2] =4;
        for(int i=3;i<n;i++){
            array[i]=((array[i-1]+array[i-2])%1000000007+array[i-3]%1000000007)%1000000007;
        }
        return array[n-1];

 */
        if(n==0){
            return 0;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;
        if(n>3){
            for(int i=4;i<=n;i++){
                arr[i]=((arr[i-1]+arr[i-2])%1000000007+arr[i-3]%1000000007)%1000000007;
            }
        }
        return arr[n];


    }

    public static void main(String[] args) {
        System.out.println(countWays(5));
    }
}