package dsa_Java;




public class ReverseArray {
public int[] Solve(int num[]) {
	
	int low=0;
	int high= num.length-1;
	while(low<high) {
		
		
		int temp= num[low];
		num[low]=num[high];
		num[high]=temp;
		low++;
		high--;
	}
	
	
	
	return num;
	
	
	
	
}

}
