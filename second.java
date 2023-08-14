
import java.util.*;

public class second {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b=sc.nextInt();

        for(int row=0;row<a;row++){
            for(int col=0;col<b;col++){
                //print stars
                if(row==0|| row==a-1|| col==0 ||col==b-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }
}
