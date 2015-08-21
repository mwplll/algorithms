package sort;

public class InsertSort {
	public static void insertSort(int[] a){
		if(a!=null){
			for(int i=1;i<a.length;i++){
				int temp = a[i];
				int j = i;
				//将a[i]插入到有序排列a[0..i-1]中
				while(j>=1&&a[j-1]>temp){
					a[j]=a[j-1];
					j--;
				}
				a[j] = temp;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] a = {5,2,4,6,1,3};
		insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
