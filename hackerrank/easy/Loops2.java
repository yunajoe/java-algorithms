import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();  
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int answer = 0;     
            for(int j = 0; j< n; j++){
                   
                for(int p = 0; p<=j; p++){                   
                    int result = (int) Math.pow(2, p);
                    int result2 = result * b;
                    answer += result2;
                                                    
                }
            answer += a;
            System.out.printf("%d ", answer);       
            answer =0;
        }           
        System.out.println();
    }
    
      in.close();
   }    
};
