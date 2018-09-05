
package exercise9;

public class Exercise9 {
    static final int MAX_INDEX = 9;
    public static final String Fibonucci = "Fibonucci Program";
    public static void main(String[] args) {
        int array[]=new int[MAX_INDEX];
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.println(Fibonucci);
        for (int i = 0; i<MAX_INDEX; i++) {
            array[i]= hi;
            hi = lo + hi;
            lo = hi - lo;
        }
        for (int i = 0; i < array.length; i++){
            int place = i+1;
            if (array[i] % 2 == 0)
                mark = " *";
            else
                mark = "";
            System.out.println(place + ": " + array[i] + mark);
        }
    }
}
