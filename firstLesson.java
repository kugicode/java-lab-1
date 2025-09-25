package anas123;

public class firstLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		int [] arr = {3, 4, 5};
		System.out.println(arr[0]);
		
		int oddNumber[] = new int[10];
		int number = 1;
		for(int i = 0; i < 10; i++) {
			oddNumber[i] = number;
			number += 2;
//			System.out.println(array[i]);
		}
		System.out.println("First 10 odd numbers");
		for(int num : oddNumber) {
			System.out.println(num);
		}
		
		firstLesson lesson = new firstLesson();
		lesson.printArray(arr);
		
		int [][] newArray = new int[2][100];
		lesson.initArr(newArray);
		lesson.printArr(newArray);
		
	}
	
	public void printArray(int []arr) {
		System.out.println(arr[1]);
	}
	
	public void initArr(int [][] newArray) {
		for(int row = 0; row < newArray.length; row++) {
			for(int col = 0; col < newArray[row].length; col++) {
				newArray[row][col] = (row + col) * 2;
			}
	}
}
	
	public void printArr(int [][] newArray) {
		for(int row = 0; row < newArray.length; row++) {
			for(int col = 0; col < newArray[row].length; col++) {
				System.out.print(newArray[row][col] + " ");
			}
			System.out.println();
	}
}
}