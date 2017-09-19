package com.utcc.sakdinan;

public class SelectionSort {

	private int [ ] element;
	private int eSize;

	public SelectionSort(int size) 
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
	
	public void SelectionSort()
	{
		int out,in,min;
		
		for(out = 0 ; out < eSize-1 ; out++)
		{
			min = out ;
			
			for(in = out+1 ; in < eSize ; in ++)
			{
				if(this.element[in] < this.element[min])
				{
					min = in ;
				}
				this.swap(out,min);
			}
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
		SelectionSort select = new SelectionSort(max);
		
		select.insert(87);
		select.insert(43);
		select.insert(95);
		select.insert(32);
		select.insert(91);
		select.insert(78);
		select.insert(26);
		select.insert(12);
		
		System.out.print("  Original Order  "); 
		select.show();
		
		select.SelectionSort();
		System.out.print("   Sorted Order  ");
		select.show();
	}


}
