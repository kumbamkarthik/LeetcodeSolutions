package newPack.LinkedList;

public class main {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		list.insert(90,3);
		System.out.println(list.find(30));
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(2));
		list.display();
		list.insertRec(2,100);
		list.display();
		
	}
}
