package _09.matriz;

import java.util.Scanner;

public class MayMatriz {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	int [][] mat = new int[num][num];
	for (int i=0; i<mat.length; i++) {
		for (int j=0; j<mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	System.out.println("Main diagonal: ");
	for(int i=0; i<num; i++) {
		System.out.print(mat[i][i]+ " ");
	}
	System.out.println();
	int count =0;
	for (int i=0; i<num; i++) {
		for (int j=0; j<num; j++) {
			if (mat[i][j]<0) {
				count++;
			}
		}
	}
	
	System.out.print("Negative numbers= "+count);
	sc.close();
}
}
