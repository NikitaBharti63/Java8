package com.exp.array;


public class reverseWithoutInbuilt {

	public static void main(String[] args) {
//		String str ="Nikita";
//		String rev ="";
//		
//		for(int i = str.length()-1; i>=0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//	}
//	
		String str ="Nikita";
		char[] arr = str.toCharArray();
		int left =0;
		int right = arr.length-1;
		while(left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] =temp;
			left ++;
			right --;
		}
		System.out.println(new String(arr));
			
			
			
			
		

  }
}
