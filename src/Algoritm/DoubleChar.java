package Algoritm;

import javax.print.DocFlavor;
import java.util.LinkedHashMap;
import java.util.Map;

public class DoubleChar {

    public static Character find(String toCheck){

        Map<Character, Integer> chars = new LinkedHashMap<>();
        Integer currentCounter;
        Character founded = null;

        for(char currentChar : toCheck.toCharArray()){
            if(currentChar != ' ') {
                currentCounter = chars.get(currentChar);
                if (currentCounter != null)
                    chars.put(currentChar, ++currentCounter);
                else
                    chars.put(currentChar, 1);
            }
        }

        for (Character countedChar: chars.keySet()){
            if(chars.get(countedChar) == 2)
                founded = countedChar;
        }

        return founded;
    }
}
