import Others.DoubleChar;

public class Main {


    public static void main(String[] args) {

//        int [] tab = new int[]{2,5,2,43,5,2,2};
//        List tabInt = new ArrayList(Arrays.asList(1,2,3,2,6,6));
//
//        ReverseChars.ofString(null);
//
//        System.out.println(NoPlusAdder.add(6, 10));
//
//        EvenIndexTest.test();
//        String toCheck = "mala ala ma kotakaxx";
//        System.out.println("Ostatnia litera powtarzajaca sie dokladnie dwa razy w zdaniu " + toCheck + "to : " + DoubleChar.find(toCheck));
        int rows  = 2, col = 3;
        int [][] tab = new int[rows][col];
        int count = 0;

        for (int i = 0 ; i < rows; i++){
            for(int j = 0; j < col; j++) {
                tab[i][j] = ++count;
                System.out.println(i + ":" + j + " = " + tab[i][j]);
            }
        }

    }
}
