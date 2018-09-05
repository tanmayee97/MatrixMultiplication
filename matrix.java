


import java.util.*;
public class matrix {

	
			public static void main(String[] args) {
				System.out.println("enter first matrix a ,b size");
				Scanner sc=new Scanner(System.in);
				
				int a=sc.nextInt();
				int b=sc.nextInt();

				System.out.println("enter the second m,n matrix");
				int m=sc.nextInt();
				int n=sc.nextInt();
				int[][] r=new int[a][n];
				int sum=0;
				if(b!=m)
	        	{
	        		System.out.println("given matrix is not possible");
	        	}
	        	else
	        	{
	        		System.out.println("matrix is possible");
		
		
				System.out.println("enter the first martix");
				int[][] t=new int[a][b];
		        for(int i=0;i<a;i++)
		        {
		        	for(int j=0;j<b;j++ )
		        	{
		        		t[i][j]=sc.nextInt();
		        	
		        		
		        	}
		   
		        }
		        
		       
		        System.out.println("enter the second matrix");
		        int[][] s=new int[m][n];
		        for(int i=0;i<m;i++)
		        {
		        	for(int j=0;j<n;j++)
		        	{
		        		s[i][j]=sc.nextInt();

		        	}
		        }
		        	
		        
		        System.out.println("results");
		        for(int i=0;i<a;i++)
		         {
		        	for(int j=0;j<n;j++)
		        	{
		        		for(int k=0;k<m;k++)
		        		{
		        		  sum=sum+t[i][k]*s[k][j];
		        		}
		        		r[i][j]=sum;
		        		sum=0;
		        	
		        }
		        	
		        }
		        
		        	for(int i=0;i<a;i++)
		        	{
		        		for(int j=0;j<n;j++){
		     
		        		System.out.print(r[i][j]+ "\t");
		        	   
		        		}
		        		System.out.println();
		           }
		        	//System.out.println();
		        	}
			}
}

