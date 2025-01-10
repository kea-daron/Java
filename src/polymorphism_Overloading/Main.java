package polymorphism_Overloading;
class Util{
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }

}
public class Main {
    public static void main(String[] args) {
        int re1 = Util.sum(2,3);
        System.out.println("Result of int sum : " + re1);
        double re2 = Util.sum(2.4,5.3);
        System.out.println("Result of double sum : " + re2);
    }
}
