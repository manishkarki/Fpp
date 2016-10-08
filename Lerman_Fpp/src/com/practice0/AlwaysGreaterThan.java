package com.practice0;

public class AlwaysGreaterThan {
	
	public static boolean isAlwaysGreaterThan(int [][]a , int [][] b){
		boolean ret = true;
		for(int i =0; i<a.length;i++){
			for(int j =0; j< a[0].length; j++){
				if(a[i][j] < b[i][j]){
					System.out.println("a:"+a[i][j]);
					System.out.println("b:"+b[i][j]);
					return false;
				}
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(isAlwaysGreaterThan(new int [][]{new int[]{12,5,7,22},new int[]{33,8,9,44}}, new int [][]{new int[]{8,4,6,9},new int[]{3,1,6,8}}));
	}
}
