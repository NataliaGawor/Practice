package Algoritm;

public class NoPlusAdder {
    public static int add(int x, int y)
    {
        int carry = 0;
        do{
            carry = (x&y)<<1;
            y = x^y;
            x=carry;
        }while(x != 0);

        return y+x;
    }

}
