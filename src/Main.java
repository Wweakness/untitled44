import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int js=0;
        int p=0;
        int ys=0;
        int jj=0;
        int jc=0;
        int jb=0;
        int yj=0;
        int yc=0;
        int yb=0;

        while (sc.hasNextLine()){
            String a=sc.nextLine();
            String[] b=a.split(" ");
            char j=b[0].charAt(0);
            char y=b[1].charAt(1);

            if(j=='C'){
                if(y=='C'){
                    p++;
                }
                if(y=='J'){
                    js++;
                    jc++;
                }else{
                    ys++;
                    yb++;
                }
            }
            if(j=='J'){
                if(y=='J'){
                    p++;
                }
                if(y=='B'){
                    js++;
                    jj++;
                }else {
                    ys++;
                    yc++;
                }
            }
            else {
                if(y=='B'){
                    p++;
                }
                if(y=='J'){
                    ys++;
                    yj++;
                }else {
                    js++;
                    jb++;
                }
            }
        }
        int jf=n-js-p;
        int yf=n-ys-p;
        int jr=0;
        int yr=0;
        int[] m={jb,jj,jc};
        int[] k={yb,yj,yc};
         Arrays.sort(m);
         Arrays.sort(k);
         if(m[1]==m[2]){
             if(m[1]==jb||m[2]==jb){
                 jr='B';
             }else {
                 jr='C';
             }
         }else {
             jr=m[2];
         }
        if(k[1]==k[2]){
            if(k[1]==yb||k[2]==yb){
                yr='B';
            }else {
                yr='C';
            }
        }else {
            yr=k[2];
        }



        System.out.println(js+" "+p+" "+jf);
        System.out.println(ys+" "+p+" "+yf);
        System.out.println(jr+" "+yr);


    }
}