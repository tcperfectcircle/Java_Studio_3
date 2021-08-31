package firstPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class firstClass {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String myString = input.nextLine().toLowerCase();

        char[] charArray = myString.toCharArray();


        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < charArray.length; i++){
            if(Character.isLetter(charArray[i])){
                if (!chars.containsKey(charArray[i])){
                    chars.put(charArray[i], 1);
                }else {
                    chars.put(charArray[i], chars.get(charArray[i])+1);
                }
            }


        }

        for (Map.Entry<Character, Integer> ch : chars.entrySet()) {
            System.out.println(ch.getKey() + ": " + ch.getValue());
        }
        }

    }

