public class power {
    public double myPow(double x, int n) {
        while(n > 0) {
            x*= x;
            n --;
        }
        return x;
    }

    public static void main(String[] args) {
        power p = new power();
        System.out.println(p.myPow(2,10));
    }
}
