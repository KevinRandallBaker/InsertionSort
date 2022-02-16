import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6, 8, 2, 1, 9};
		System.out.print("array before insertionSort:");
		printArray(array);
		
		array = insertionSort(array);
		
		System.out.print("array after insertionSort:");
		printArray(array);

	}
	
	public static int[] insertionSort(int[] array) {
		
		int index = 0;
		
		for(int i  = 0; i < array.length; i++) {
			index = insert(array, index, i);
		}
		
		return array;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static int insert(int[] array, int index, int current) {
		for(int i = current; i > 0; i--) {
			if(array[i] < array[i - 1]) {
				swap(array, i, i - 1);
			}
		}
		
		return index++;
	}
	
	public static void printArray(int[] array) {
		
		for(int elem : array) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

}
