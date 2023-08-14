public class sixth {
    public static void main(String[] args) {
        int a=5;

        for(int row=0;row<=a;row++){
            for(int col=0;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int row=1;row<=a;row++){
            for(int col=0;col<=a-row;col++){
                System.out.print(" * ");
            }
            System.out.println();
           
        }






        

        
    }
}
