package PatternQuestions;

public class Pattern_16 {
    public static void main(String[] args) {
        Pattern4_1(7);
    }
    static void Pattern4_1(int n) {

        for (int row = 1; row <= n ; row++) {
          for (int s = 1; s <= n - row ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();

    //          *      
    //         ***     
    //        *****    
    //       *******   
    //      *********  
    //     *********** 
    //    *************
      }

    }
}
