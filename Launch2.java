package com.ineuron;

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=14;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i-j>=(n-1)/2||i+j>(n-1)+n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

	
