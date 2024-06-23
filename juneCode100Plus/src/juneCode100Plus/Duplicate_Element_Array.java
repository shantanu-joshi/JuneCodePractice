package juneCode100Plus;

public class Duplicate_Element_Array {
	
	public static void main(String[] args) {
		
		int arr[]  = {1,4,4,5,5,6,7};
		
		int freq = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					freq++;
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
