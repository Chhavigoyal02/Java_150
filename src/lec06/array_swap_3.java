package lec06;

public class array_swap_3 {

	public static void main(String[] args) {
		int[] arr1= {3,4,1,7,8};
		int[] arr2= {30,40,10,70,80};
		System.out.println(arr1[0]+" "+arr2[0]);
		Swap(arr1,arr2);
		System.out.println(arr1[0]+" "+arr2[0]);
	}
	public static void Swap(int[] arr1,int[] arr2) {
		int[] temp=arr1;
		arr1=arr2;
		arr2=temp;
	}
}
