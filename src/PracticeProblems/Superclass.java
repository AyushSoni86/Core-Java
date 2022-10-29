package PracticeProblems;

class Subclass extends Superclass{
   int num = 110;
   void printNumber(){
   
   System.out.println(super.num);
   }
   public static void main(String args[]){
   Subclass obj= new Subclass();
   obj.printNumber();   
   }
}
class Superclass{
   int num = 100;
}
 

