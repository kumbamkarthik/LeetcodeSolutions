package CircularLinkedList;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CLinkedList list = new CLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        list.delete(40);
        list.display();
	}
}
