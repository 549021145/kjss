package com.kjss.arithmetic;

public class Arithmetic {

	public static int a [] = {12,5,9,7,50};
	
	//冒泡排序
	public static void  bubbleSort(int a []) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if (a[j] >= a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " " );
		}
		System.out.println();
	}
	
	//选择排序
	public static void  selectSort(int a []) {
		for(int i = 0; i < a.length; i++) {
			int index = i;
			int min = a[i];
			for (int j = i+1; j < a.length; j++) {
				//最小值依次比较
				if (min >= a[j]) {
					index = j;
					min = a[j];
				}
			}
			int temp = a[i];
			a[i] = min;
			a[index] = temp;
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " " );
		}
		System.out.println();
	}
	
	//快速排序
	public static void  quickSort(int a []) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] <= a[j-1]) {
					int temp =  a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}else {
					break;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " " );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Arithmetic.bubbleSort(a);
//		Arithmetic.selectSort(a);
//		Arithmetic.quickSort(a);
	}
}
