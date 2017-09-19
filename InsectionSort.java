package com.utcc.sakdinan;
/**
*@author Sakdinan 5907101013
*/
public class InsectionSort {

	private int [ ] element;
	private int eSize;

	public InsectionSort(int size) 
	{
		if(size > 0)
		{
			this.element = new int [size];
		}
		else
		{
			this.element = new int [10];
		}
		eSize = 0 ;
	}
	
	public void insert(int e)
	{
		this.element[eSize] = e ;
		eSize++;
	}
	
	public void show()
	{
		for(int i = 0 ; i < eSize ; i++)
		{
			System.out.print(this.element[i]+" ");
		}
		
		System.out.println("");
	}
	
	public void InsectionSort()
	{
		int out,in,temp;
		
		for(out =  1; out < eSize ; out++)
		{
			temp = this.element[out];
			
			for(in = out ; in > 0 && this.element[in-1] >= temp ; in --)
			{
				this.element[in] = this.element[in - 1];
				
					
			}
			this.element[in] = temp ;
		}
	}

	private void swap(int left, int right) 
	{
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp ;
	}
	
	public static void main (String [] args)
	{
		int max = 20 ;
		InsectionSort ins = new InsectionSort(max);
		
		ins .insert(87);
		ins .insert(43);
		ins .insert(95);
		ins .insert(32);
		ins .insert(91);
		ins .insert(78);
		ins .insert(26);
		ins .insert(12);
		
		System.out.print("  Original Order  "); 
		ins .show();
		
		ins .InsectionSort();
		System.out.print("   Sorted Order  ");
		ins .show();
	}
}
