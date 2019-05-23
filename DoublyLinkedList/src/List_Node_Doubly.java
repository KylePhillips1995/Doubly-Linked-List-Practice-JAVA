//Kyle Phillips
//205 Data Structures and Algorithms
//Doubly LinkedList
public class List_Node_Doubly<Type> {

	private Type value;
	List_Node_Doubly<Type> next;
	List_Node_Doubly<Type> previous;
	
	public List_Node_Doubly(Type initObj) {
		
			next = null;
			previous = null;
			value = initObj;
	}
	
	public Type getValue() {
	
		 return value;
	}
	
	public List_Node_Doubly<Type> getPrevious(){
		
		return previous;
		
	}
	
	public List_Node_Doubly<Type> getNext(){
		
		return next;
	}
	
	public void setPrevious(List_Node_Doubly<Type> newPrevious) {
	
		previous = newPrevious;
		
	}
	
	public void setNext(List_Node_Doubly<Type> newNext) {
		next = newNext;
	}
	
	public void setValue(Type newValue) {
	
		value = newValue;
	}
	
	}
	
	
	
	
	

