import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        
        int a=sc.nextInt();

       

        for(int row=1;row<a;row++){
            for(int col=1;col<a;col++){
                if(row==col || row+col==a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
