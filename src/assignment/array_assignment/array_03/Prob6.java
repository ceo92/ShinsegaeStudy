package assignment.array_assignment.array_03;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+ Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		int avg = (int)Arrays.stream(values).average().orElseThrow();
		int temp = Integer.MAX_VALUE;
		int midIndex=0;
		for (int i=0 ; i<values.length ; i++){
			if (Math.abs(values[i]-avg)<=temp){
				temp = Math.abs(values[i]-avg);
				midIndex = i;
			}
		}
		return values[midIndex];

	}
}
