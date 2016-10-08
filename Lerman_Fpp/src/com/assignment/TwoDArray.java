package com.assignment;



public class TwoDArray {
	public static void main(String args[])
	{
		double[][] arr=new double[3][6];
		System.out.println(arr.length);
		
		int interest=10;
		double balance=10000; 
		for(int j=0;j<arr[0].length;j++)
		{
			double totalBalance=0;
			for(int i=0;i<arr.length;i++)
			{
				
				if(totalBalance==0)
				{ 
					totalBalance=balance;
					arr[i][j]=balance; 	 
				}
				else
				{
					totalBalance= totalBalance+((totalBalance*interest)/100);
					arr[i][j]=totalBalance; 	
				}
			}
			interest++;
		}
		
		System.out.println("Row's Average");
		for(int i=0;i<arr.length;i++)
		{
			double rowAverage=0; 
			for(int j=0;j<arr[i].length;j++)
			{
				rowAverage+=arr[i][j];
			}
			System.out.println( (i+1)+" row average is: "+ rowAverage/arr[i].length);
		}
		System.out.println("Column's Average");
		for(int j=0;j<arr[0].length;j++)
		{
			double columnAverage=0;
			for(int i=0;i<arr.length;i++)
			{
				columnAverage+=arr[i][j];
			}
			System.out.println( (j+1)+ " Colums Average " +columnAverage/arr.length);
		}
	}
	

}

