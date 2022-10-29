package PatternQuestions;

class Pattern{
  public static void main(String[] args)
    {
        pattern3_1(6);
    }

    static void pattern2(int n)
     {
//        *
//        * *
//        * * *
//        * * * * *
//        * * * * * *
         // this pattern will be printed
         for (int row = 1; row <= n; row++)
         {
             for (int column = 1; column <=row ; column++)
             {
                 System.out.print("* ");
             }
             System.out.println();

         }
    }
    static void pattern3(int n) {
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        for (int row = 1; row <= n; row++) {
            for (int column = n; column >row ; column--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }    static void pattern3_1(int n) {
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        for (int row = 1; row <= n; row++) {
            for (int column = 0; column <n-row +1; column++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


}
 class PatternDiamond {

        public static void main(String[] args) {
            int number=5;
//        this for loop for printing number of rows of pattern
            for (int i=0;i<number;i++){

                for (int j = number-i; j>1 ; j--){

                    System.out.print(" ");
                }
                for (int j = 0 ;j<=i;j++) {

                    System.out.print("* ");
                }
                 System.out.println();

            } for (int i=number-1;i>0;i--){

                for (int j = i; j<number ; j++){

                    System.out.print(" ");
                }
                for (int j = 0 ;j<i;j++) {

                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
 class Pattern01 {
    public static void main(String[] args) 
    {
        for (int i = 0 ; i<5 ;i++) {
            for (int j=5-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j=0 ;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=5-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j=0 ;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
