package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> myString = new ArrayList<>();
        Integer sumOfEvenNums = 0;

        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

       for (int i:nums){
           if (i%2 !=0) {
               sumOfEvenNums +=i;
           }
       }
       System.out.println(sumOfEvenNums);

       String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
       String[] strArray = str.split(" ");

       for ( int i = 0; i< strArray.length; i++){
            myString.add(strArray[i]);
        }

//       myString.add("I would not, could not, in a box. I would not, could not with a fox.");
        System.out.println(myString);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int wordLength = input.nextInt();

        for (String s : myString) {

            if (s.length() == wordLength) {
                System.out.println(s);
            }
        }
    }
}
