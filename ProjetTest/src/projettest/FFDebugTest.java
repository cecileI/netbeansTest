package projettest;

import java.util.Scanner;

public class FFDebugTest {

    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    
    private String myString;

    public static void main(String[] args) {
        FFDebugTest debug = new FFDebugTest(new int[3]);
        FFDebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFDebugCalc.findMax(debug.myArray));
        
        System.out.println("La plus petite valeur est : "
                + FFDebugCalc.findMin(debug.myArray));
    }

    public FFDebugTest(int[] myArray) {
        this.myArray = myArray;
    }

    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
    

   
}
