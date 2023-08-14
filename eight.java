public class eight {
    public static void main(String[] args) {
        

        int a = 5;

        for (int row = 0; row <= a; row++) {
            for (int col = 0; col <= a; col++) {
                if (col < a - row) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }

            for(int st=1;st<=row;st++){
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}
