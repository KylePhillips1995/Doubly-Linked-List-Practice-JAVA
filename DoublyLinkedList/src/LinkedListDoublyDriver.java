//Kyle Phillips
//205 Data Structures and Algorithms
//Doubly Linked List
public class LinkedListDoublyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDoubly<String>list=new LinkedListDoubly<String>();
		System.out.println("\nTesting addFirst and addLast");
		list.addFirst("Bill");
		list.addFirst("Sam");
		list.addLast("Karen");
		list.addLast("Leslie");
		list.printForwards();
		System.out.println("\nTesting add(Type, obj)");
		list.add("Dylan");
		list.add("Cacey");
		list.add("Adam");
		list.add("Jen");
		list.add("Sean");
		list.add("Max");
		list.add("Matt");
		list.add("Tony");
		list.add("Ruan");
		list.add("William");
		list.add("Noah");
		list.add("Kacey");
		list.add("Alex");
		list.add("Brett");
		list.add("Chris");
		list.add("Jacob");
		list.printForwards();
		System.out.println("\nTesting removeLast(); and removeFirst()");
		list.removeLast();
		list.removeLast();
		list.removeFirst();
		list.removeFirst();
		list.printForwards();
		System.out.println("\n****Testing print backwards****");
		list.printBackwords();
		System.out.println("\nTesting remove(Type object)");
		list.remove("Adam");
		list.remove("Brett");
		list.printForwards();
		System.out.println("\nTesting remove(Type obj)");		
		list.remove("Kacey");
		list.remove("Noah");
		list.remove("Alex");
		list.remove("Brett");
		list.remove("Sean");
		list.remove("Jen");
		list.remove("Adam");
		list.remove("Namath");
		System.out.println("\nTesting add(int i, Type obj)");		
		list.add(0,"Jim");
		list.add(6,"Gill");
		list.add(3,"Brady");
		list.add(0,"Unitas");
		list.printForwards();
		try{
			list.add(100,"Namath");
		}catch (IndexOutOfBoundsException e) {System.out.println(e);}
		System.out.println("\nTesting various methods");
		System.out.println("Adding Joe " +list.add("Joe"));
		System.out.println(list.remove(4));
		System.out.println(list.removeLast());
		System.out.println("removing Matt " +list.remove("Matt"));
		list.addFirst("Sarah");
		list.addLast("Mimmy");
		list.add("Sam");
		list.add(4,"Susan");
		list.printForwards();
		System.out.println("\n***** print backwards***");
		list.printBackwords();
		System.out.println("\nvarious Removes");
		System.out.println(list.remove());
		System.out.println(list.remove(4));
		System.out.println(list.remove("Max"));
		System.out.println(list.remove("Sandy"));
		try{
			System.out.println(list.remove(-4));
		}catch (IndexOutOfBoundsException e) {System.out.println(e);}
		System.out.println("\nFinal Check");
		list.printForwards();
		System.out.println("The size is " +list.size());
	}

}