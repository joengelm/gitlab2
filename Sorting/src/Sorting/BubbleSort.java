package Sorting;

public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int idx;
     	boolean flag = true;   
     	int temp;  

     	while (flag) {
            flag = false;    
            for (idx = 0;  idx < num.length -1;  idx++){
                if (num[idx] < num[idx+1]) {
                    temp = num[idx];            
                    num[idx] = num[idx+1];
                    num[idx+1] = temp;
                    flag = true;           
                }
            }
      } 
  }
}
