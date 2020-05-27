
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        //for (int i = 0; i < amount; i++) {
        // System.out.print("*");
        // }
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        //for (int i = 0; i < amount; i++) {
        // System.out.print(" ");           
        //}
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        //for (int i = 1; i <= size; i++) {
        //  printWhitespaces(size - i);
        //  {
        //     printStars(i);
        // }
        //  System.out.println();         
        //}
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
             {
                printStars(i);
            }
            i++;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        while (i < height) {
            printWhitespaces((height-1) - i);
            {
                printStars(i * 2 + 1);
            } 
            i++;            
        }
        int j = 0; //konieczne jest wprowadzic nowy index - j dla drukowania pnia choinki
        while (j < 2) {
            printWhitespaces(height - 2);
            {
               printStars(3);
            }
           j++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printStars(4);
        System.out.println("\n---");
        printWhitespaces(5);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
