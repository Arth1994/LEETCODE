import java.util.*;


public class CutMetalSurplus {
    public static long calculateMaximumProfit(int costPerCut, int salesPrice, List<Integer> l) {

        long max = 0;
        long cur;
        int maxLength = 0;
        int totalRods;
        int totalCuts;

        for (int curLength : l) {
            maxLength = Math.max(maxLength, curLength);
        }

        for (int curLength = 1; curLength < maxLength; curLength++) {
            totalRods = 0;
            totalCuts = 0;

            for (int length : l) {
                totalRods += (length / curLength);
                totalCuts += ((length - 1) / curLength);
            }

            cur = totalRods * curLength * salesPrice - totalCuts * costPerCut;

            max = Math.max(max, cur);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPerCut = sc.nextInt();
        int metal_price = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
        }
        System.out.println(calculateMaximumProfit(costPerCut, metal_price, input));
    }

}
