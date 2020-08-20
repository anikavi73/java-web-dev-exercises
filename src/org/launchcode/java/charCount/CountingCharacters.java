package org.launchcode.java.charCount;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i< charactersInString.length; i++){

            char c = charactersInString[i];

            if (charCounts.containsKey(charactersInString[i])){

                charCounts.put(c, charCounts.get(c)+1);

            }else {

                charCounts.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> countChar: charCounts.entrySet()){
            System.out.println(countChar.getKey() + ": "+ countChar.getValue());
        }
    }
}
