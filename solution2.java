import java.util.*;

class Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int number = 0;
        int length = String.valueOf(x).length() - 1;
        while (x >= 0) {
            int num = (Math.abs(x)) % 10;
            number = number + (int) (num * Math.pow(10, length--));

            x = x / 10;
        }
        System.out.print(number);
    }
}