public class ArtHomeWork6 {

    static int calculate(int applesPete, int applesTotal) {
        return applesTotal - applesPete;
    }

    static void print(int apples) {
        System.out.println(apples);
    }

    public static void main(String[] args) {
        int aaa = calculate(10, 15);
        print(aaa);
    }
}
