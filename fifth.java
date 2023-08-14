import java.util.Scanner;

public class fifth {
public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int a = sc.nextInt();

        for(int row=0; row<=a;row++){
            for(int col=0; col<=a-row; col++){
                System.out.print("  *  ");
            }
            System.out.println();
        }

}
}
