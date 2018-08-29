package exercise3;

class Exercise3{
    static final int MAX = 50;
    public static void main(String[] args) {
        int lo = 1,
            hi = 1;
        
        System.out.println("Fibonucci Program");
        System.out.println(lo);
        while (hi<MAX){
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
