package Others;

public class ReverseChars {
    public static void ofString(String str){
        String out = "";

        if(str != null && str.length()>0){
            str = str.toLowerCase();
            for (char ch:str.toCharArray()) {
                ch = (char) ('z' - (ch - 'a'));
                out += ch;
            }

            System.out.println(str + " is changed to " + out);
        }
        else
            System.out.println("null value occur");
    }
}
