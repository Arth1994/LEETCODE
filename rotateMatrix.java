import java.util.*;
import java.io.*;
import java.lang.*;

class rotateMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		matrixRotate(a);
	}

	static void matrixRotate(int m[][]) {
		int len = m.length;
		if (m.length == 0 || m[0].length != m.length)
			System.out.print("Invalid Matrix");
		for (int layer = 0; layer < len / 2; layer++) {
			int first = layer;
			int last = len - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = m[i][first];
				// top = left
				m[i][first] = m[last - offset][first];
				// left = bottom
				m[last - offset][first] = m[last][last - offset];
				// bottom = right
				m[last][last - offset] = m[i][last];
				// right = top
				m[i][last] = top;
			}
		}
		for (int k = 0; k < len; k++) {
			for (int j = 0; j < len; j++) {
				System.out.print(" " + m[k][j] + " ");
			}
			System.out.println(" ");
		}
	}
}