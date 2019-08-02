package capgemini.interfaces;

import java.util.Arrays;

interface ArraySort{
	void sortAsc();
	void sortDesc();
}
class ArraySortImpl implements ArraySort{
	int[] nums;
	public ArraySortImpl(int[] nos){
		this.nums=nos;
	}
	@Override
	public void sortAsc(){
		//Ascending Sort Algorithm.......
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
}
	@Override
	public void sortDesc(){
		//Descending sort algorithm.....
		
			
	}
	//own method of ArraySortImpl class.....
	public void print(){
		System.out.println(Arrays.toString(nums));
	}
}
public class Array_Sort_Test {
	public static void main(String[] args) {
		int[] nums={1,3,2,5,4,7,6,9,8,10};
		ArraySortImpl arraysortImpl = new ArraySortImpl(nums);
		arraysortImpl.sortAsc();
		arraysortImpl.sortDesc();
		
	}

}
