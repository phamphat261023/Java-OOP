package OppExtends;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println(math.findMin(4, 7));
        System.out.println(math.findMin(4.5, 9.5));
        System.out.println("a + b = " + math.total(4, 7));
        double arr[] = new double[] {3,4,5,6,7};
        System.out.println("Total arr: " + math.total(arr));
    }
}
