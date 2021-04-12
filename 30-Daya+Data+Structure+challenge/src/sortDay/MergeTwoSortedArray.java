package sortDay;

public class MergeTwoSortedArray 
{
	void merge(int arr1[], int arr2[], int n1, int n2)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int arr3[] = new int[n1+n2];
		
		while(i < n1 && j < n2)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k] = arr1[i];
				i++;
			}
			else
			{
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < n1)
		{
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j < n2)
		{
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		for(int l: arr3)
		{
			System.out.println(l);
		}
	}
	
	public static void main(String[] args) 
	{
		MergeTwoSortedArray mg = new MergeTwoSortedArray();
		int arr1[] = {11,22,33,44,55,66,77};
		int arr2[] = {10,20,30,40,50,60,70};
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		mg.merge(arr1, arr2, n1, n2);
	}

}
