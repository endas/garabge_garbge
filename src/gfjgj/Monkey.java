package gfjgj;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.*;

public class Monkey extends TreeClimber implements animal {

	private int count = 0;
	private HashSet<Integer> set = new HashSet<Integer>();
	private TreeSet<Integer> treeSet = new TreeSet<Integer>();
	static int [] test = {1,8,3,3,4,4,5,6};
	
	public boolean pay(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

		
	public Monkey(){
	}
	
	
	@Override
	public int Count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int Count(int l, int x)
	{
		super.Count();
		count = count + l + x;
		return 0;
	}

	public void addtoSet(int newInt){
		set.add(newInt);
	}
	
	public void addtoTreeSet(int newInt){
		treeSet.add(newInt);
	}
	
	public void removefromSet(int oldInt){
		set.remove(oldInt);
	}
	
	public void removefromTreeSet(int oldInt){
		treeSet.remove(oldInt);
	}
	
	
	public void buildSet(int [] build)
	{
		for(int builder : build)
		{
			addtoSet(builder);
		}
	}
	
	public void builderTreeSet(int [] build){
		
		for(int builder : build)
		{
			addtoTreeSet(builder);
		}
	}
	
	
	public void printSet(){
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public void printTreeSet(){
		Iterator iter = treeSet.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public void printFirstTreeSet(){
		System.out.println(treeSet.first());
	}
	
	public int [] bubbleSort(int [] array){
		boolean t = false;
		int holder;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 1; j < (array.length); j ++)
			{
	
				if(array[j-1] > array[j])
				{
                     //swap the elements!
                     holder = array[j-1];
                     array[j-1] = array[j];
                     array[j] = holder;
                     
				}
			}}
		
		return array;
		
	}
		
		
	public void printArray(int [] array){
		for(int i = 0; i < array.length;i++)
			System.out.println(array[i]);
	}
		
	}


