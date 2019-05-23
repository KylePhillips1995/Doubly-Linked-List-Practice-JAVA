//Kyle Phillips
//205 Data Structures and Algorithms
//Doubly Linked List


import java.util.*;
public class LinkedListDoubly <Type> {

	private List_Node_Doubly<Type> first;
	private List_Node_Doubly<Type> last;
	int counter = 0;
	
	
	/**
	 * 
	 * @return
	 */
	
	public int size() {
		
		return counter;
		
	}
	
	


	/**
	 * @param obj
	 */
	public void addFirst(Type obj)
	{
		List_Node_Doubly <Type> newNode = new List_Node_Doubly<Type>(obj);
		
		if(first == null) {
			
			first = newNode;
			last = newNode;
			
		}
		
		else {
			
			newNode.setNext(first);
			first.setPrevious(newNode);
			first = newNode;
		}
	
		counter++;
	}//ends addfirst(Type)
	
	
	/**
	 * @param obj
	 */
	
	public void addLast(Type obj) {
		
		List_Node_Doubly <Type> newNode = new List_Node_Doubly<Type>(obj);
		
		if(last != null) {
		last.next = newNode;
		}
		last = newNode;
		
		if(first == null) {
			
			first = newNode;}
		
		counter++;
			
		
		}//end addLast(Type obj)
	
	/**
	 * @param obj
	 * @return
	 */
	 
	
	 public boolean add(Type obj) {
		 
		 List_Node_Doubly <Type> newNode = new List_Node_Doubly<Type>(obj);
		 if(first == null)
		 
		 {	addFirst(obj);
		 }
		 
		 else if(first == last) {
			 
			 first.setNext(newNode);
			 last = newNode;
			 newNode.setPrevious(first);
			 counter++;
		 }
		 
		 else {
			 last.setNext(newNode);
			 newNode.setPrevious(last);
			 last = newNode;
			 counter++;
		 }
		 
		 return true;
	 }//end add(Type Obj)
	 
	 
	 /*
	  *@param i 
	  *param obj
	  */
	
	 public void add(int ii, Type obj) {
		 
		 int index = 0;
		 if( ii == 0) {
			 
			 addFirst(obj);//Addfirst takes a type obj not a list node
		 }
		 
		 else if(ii>size() || ii<0) {
			
			 throw new IndexOutOfBoundsException("'ii' is greater than the size or >=0, it is okay if 'i' is equal to the size, in that case we would be putting it on the end");
			 
		 }
		 
		 else
			{	List_Node_Doubly <Type>newNode=new List_Node_Doubly<Type>(obj);
				List_Node_Doubly<Type> previous,current;
				previous=current=first;
				
				for (int i = 0; i < ii; i++) {
					current = current.next;}
					
				previous = current.getPrevious();
				previous.next = newNode;
				newNode.previous = previous;
				newNode.next = current;
				current.previous = newNode;
				counter++;
				}
			}//end add
		 
		 
		
		  
			
			/**
			 * @return
			 */
			public Type removeFirst()
			{	
				if(counter == 0) {
					
					throw new NoSuchElementException();
				}
				
				List_Node_Doubly <Type> newNode = new List_Node_Doubly<Type>(null);
				newNode = first;
				first = first.next;
				first.previous = null;
				counter--;
				return newNode.getValue();
			  }//end remove first

				
			
			/**
			 * @return
			 */
			
			public Type removeLast()
			{	
			
				if(counter == 0) 
				
				{	
				throw new NoSuchElementException();
				}
			
			List_Node_Doubly <Type> newNode = new List_Node_Doubly<Type>(null);
			last = last.getPrevious();
			last.next = null;
			counter--;
			return newNode.getValue();
			
			}//ends removeLast


			/**
			 * @return
			 */
			public Type remove()
			{
				return removeFirst();
			}//ends removeFirst()
			
			/**
			 * @param 
			 * @return
			 */
			public boolean remove(Type obj)
			{		
				if(first.getValue().equals(obj))
				{	
					removeFirst();
					return true;
				}	
				else if(last.getValue().equals(obj))
				{	removeLast();
					return true;
				}
				else
				{	
					List_Node_Doubly<Type> previous,current;
					List_Node_Doubly<Type> newNode = new List_Node_Doubly<Type>(null);
					previous=current=first;
					newNode = first;
					while(newNode.next != null) {
						newNode = newNode.next;
						if(newNode.equals(obj)) {
							newNode.next.previous = newNode.previous;
							newNode.previous.next = newNode.next;
							counter--;
							return true;
							
						}
					}
					
				}
				return false;
			}
			
		/**
		 * @param i
		 * @return
		 */
		public Type remove(int i)
		{			
			Type returnType=null;
					int index=0;
					if(i==0)
					{	
						return removeFirst();		
					}
					else if(i>size()-1 || i<0)
					{
						throw new IndexOutOfBoundsException("'i' must be less than or equal ot size()-1 and >=0 because size()-1 is the last index of a list of size() Objects");
					}
					else
					{	List_Node_Doubly<Type> previous,current;
						previous=current=first;
						while(index < i)	
						{ 	previous=current;
							current=current.getNext();
							index++;
						}
						if(i==size()-1)
						{	returnType=last.getValue();
							removeLast();
						}
						else
						{	returnType=current.getValue();
							previous.setNext(current.getNext());
							current.getNext().setPrevious(previous);
							counter--;
						}
					return returnType;
					}
				
				}//ends remove(i)
			
			/**
			 * 
			 */
			public void printForwards()
			{
				List_Node_Doubly <Type>current;
				current=first;
				while(current!=null)
				{
					System.out.println(current.getValue());
					current=current.getNext();
				}
			}//ends printForwards
			
			/**
			 * 
			 */
			public void printBackwords()
			{
				List_Node_Doubly <Type>current;
				current=last;
				while(current != null)
				{
					System.out.println(current.getValue());
					current = current.getPrevious();
				}
			
			}//ends print backwards

		

	 
			
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
