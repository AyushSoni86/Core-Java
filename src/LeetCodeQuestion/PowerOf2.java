package LeetCodeQuestion;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPow(65));
    }

    static boolean isPow(int num) {
        for (int i = 0; i < 31; i++) {
            if (Math.pow(2, i) == num) return true;
        }
        return false;
    }
}
