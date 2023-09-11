package DoubleLinkedList;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DLinkedList list = new DLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();
        list.insertLast(60);
        list.display();
        list.insertLast(70);
        list.display();
        list.insert(10,90);
        list.display();
	}

}
