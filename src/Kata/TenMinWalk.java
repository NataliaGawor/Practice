package Kata;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        // position on xy axis
        int x = 0, y = 0;

        if(walk.length!=10)
            return false;

        for (char direction: walk) {
            switch (direction){
                case 'n':
                    x++;
                    break;
                case 's':
                    x--;
                    break;
                case 'w':
                    y++;
                    break;
                case'e':
                    y--;
                    break;
                default:
                    return false;
            }
        }

        if(x!=0 || y!=0)
            return false;

        return true;
        //return x==0 && y==0; // krocej
    }
}
