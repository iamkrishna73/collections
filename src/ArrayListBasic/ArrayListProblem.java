package ArrayListBasic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListProblem {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Test Case: ");
        int  t = sc.nextInt();
        while(t != 0){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(11);
            arrayList.add(9);
            arrayList.add(6);
            arrayList.add(21);
            arrayList.add(8);
            System.out.println("---------");
            System.out.print("Original ArrayList are: "+ arrayList);
            System.out.println();
            System.out.println("---------");
            System.out.println("Enter 1 for Adds an element x to the ArrayList A at the end: ");
            System.out.println("Enter 2 for Sorts the ArrayList A in ascending order: ");
            System.out.println("Enter 3 for Reverses the ArrayList A: ");
            System.out.println("Enter 4 for prints the size of the ArrayList:  ");
            System.out.println("Enter 5 for Sorts the ArrayList A in descending order:  ");
            int enteredValue = sc.nextInt();
            switch (enteredValue) {
                case 1:
                    System.out.print("Enter a Element: ");
                    int value = sc.nextInt();
                    arrayList.add(value);
                    System.out.print("ArrayList after Adding an element: "+ arrayList);
                    System.out.println("---------");
                    break;
                case 2:
                    Collections.sort(arrayList);
                    System.out.println("Sorted the ArrayList: "+arrayList);
                    System.out.println("---------");
                    break;
                case 3:
                    Collections.reverse(arrayList);
                    System.out.println("Reverses the ArrayList: "+arrayList);
                    System.out.println("---------");
                    break;
                case 4:
                    System.out.println("size of the ArrayList:  "+ arrayList.size());
                    System.out.println("---------");
                    break;
                case 5:
                    Collections.sort(arrayList);
                    Collections.reverse(arrayList);
                    System.out.println("Sorts the ArrayList A in descending order: "+arrayList);
                    System.out.println("---------");
                    break;
                default:
                   if(enteredValue < 6){
                       System.out.println("Invalid Input");
                   }
                   if(enteredValue <= 0){
                       System.out.println("Invalid Input");
                   }
            }
            t--;
        }
    }
}
