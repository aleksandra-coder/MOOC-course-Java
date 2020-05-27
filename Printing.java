
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times 

        //for (int i = 0; i < amount; i++) {
            //System.out.print("*");
        //}
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }System.out.println("");
    } 

    public static void printSquare(int sideSize) {
        // 39.2
        //int amount = sideSize;
        //for (int i = 0; i < amount; i++) {
            //printStars(amount);
            //System.out.println("");
            /*System.out.println("*"); tego nie moze byc, bo wtedy drukuje 
            o jeden rzad za duzo, bo jest gwizdka*/
       // }
       int amount = sideSize;
       int i = 0;
       while(i < sideSize){
           printStars(amount);
           i++;
       }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        //int amount = width;
        //for (int i = 0; i < height; i++) {
          //  printStars(amount);
          //  System.out.println("");
        //}
        int amount = width;
        int i = 0;
        while(i < height){
            printStars(amount);
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        
        //for (int i = 1; i <= size; i++) {
          //  int amount = i; {                            
            //    printStars(amount);
           // }
           // System.out.println("");
       // }
       int i = 1;
       int amount = i;
       while(i <= size){
           printStars(amount);
           amount++;
           i++;
       }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
