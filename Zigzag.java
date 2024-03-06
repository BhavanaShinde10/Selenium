package arrays;

import java.util.Arrays;

public class Zigzag {
	public static void main(String[]args)
	{
		int[]ar1= {1,2,3,4,5,6};
		
		int []ar2= {9,8,7,6,0};
		int ans[]=new int[ar1.length+ar2.length];
		int min=ar1.length<ar2.length?ar1.length:ans.length;
		
		for(int i=0,j=0;j<ans.length;i++)
		{
			if(i<min)
			{
				ans[j]=ar1[i];
				j++;
				ans[j]=ar2[i];
				j++;
			}
			else if(ar1.length>min)
			{
				ans[j]=ar1[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
