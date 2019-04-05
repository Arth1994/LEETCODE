import java.util.*;
import java.io.*;

class stringCompressionOriginal {

    static void compressedString(String str) {

        int c = 1, originalLength;
        char[] originalArray = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        originalLength = originalArray.length;

        for (int i = 0; i < originalLength; i++) {
            if (hashMap.isEmpty()) {
                hashMap.put(originalArray[i], c);
            } else if (hashMap.containsKey(originalArray[i])) {
                hashMap.put(originalArray[i], ++c);
                if (i == (originalLength - 1)) {
                    arrayList.add(originalArray[i]);
                    arrayList1.add(hashMap.get(originalArray[i]));
                }
            } else {
                arrayList.add(originalArray[i - 1]);
                arrayList1.add(hashMap.get(originalArray[i - 1]));
                hashMap.clear();
                c = 1;
                hashMap.put(originalArray[i], c);
                if (i == (originalLength - 1)) {
                    arrayList.add(originalArray[i]);
                    arrayList1.add(hashMap.get(originalArray[i]));
                }
            }

        }

        if (originalLength < (arrayList.size() + arrayList1.size())) {
            System.out.print(str);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i));
                System.out.print(arrayList1.get(i));
            }
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String basicString = sc.nextLine();
        compressedString(basicString);
        sc.close();

    }

}