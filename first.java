import java.util.*;


public class first{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=0; i<=a; i++){
            for(int j=0; j<=b; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }


    }

}