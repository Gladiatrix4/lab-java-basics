package DifferenceMaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceMaxMin {
    public static void main(String[] args) {

        //1. Write a method in Java to get the difference between the largest and smallest values in an array of integers.
        //      The length of the array must be 1 and above. Use loops and conditionals to develop the algorithm.

        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> list = new ArrayList<String>();

        System.out.println("-------------------------------------\n\n" +
                "Enter the size of your preferred array please...");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("Need at least 2 elements !\n" +
                    "Try again !");
            System.exit(0); // cleanly terminates the program
        }
        int[] List = new int[size];

        System.out.println("Enter one by one " + size + " integer numbers");
        for (int i = 0; i < size; i++) {
            List[i] = scanner.nextInt();
        }

        System.out.println("---Information about the List that you Created---\n" +
                "-------------------------------------------------\n\n" +
                "List: " + Arrays.toString(List));

        int maxList = List[0];
        int minList = List[0];
        int doubleChecker = List[0];
        int doubleCounter = 0;

        for (int i = 0; i < size; i++) {
            if (List[i] == List[0]) {
                doubleCounter++;
            }
            if (maxList <= List[i]) {
                maxList = List[i];
            }
            if (minList >= List[i]) {
                minList = List[i];
            }
        }


        int dif = maxList - minList;
        System.out.println("1. The difference between the largest (" + maxList + ") and smallest (" + minList + ") values in your List is:     " + dif);

        //2. Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
        //      Use loops and conditionals to develop the algorithm.

        int[] List2 = new int[size - 1];
        int step = 0;
        int minList2 = 0;

        if (doubleCounter == size) {
            minList2 = minList;
        } else {
            for (int i = 0; i < size; i++) {
                if (minList != List[i]) {
                    List2[step] = List[i];
                    step++;
                }
            }

            minList2 = List2[0];

            for (int i = 0; i < (size - 1); i++) {
                if (minList2 >= List2[i]) {
                    minList2 = List2[i];
                }
            }
        }
        System.out.println("2a. Smallest Element:     " + minList);
        System.out.println("2b. Second Smallest Element:     " + minList2);
    }
}
