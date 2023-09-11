package DoubleLinkedList;
public class DLinkedList {
	   Node head;
	   public void insertFirst(int val) {
		   Node node = new Node(val);
		   node.next = head;
		   node.prev = null;
		   if(head!=null)
			   head.prev = node;
		   head = node;
	   }
	   public void insertLast(int val) {
		   Node node = new Node(val);
		   if(head==null) {
			   node.prev=null;
			   head = node;
			   return;
		   }
		   Node lastNode = head;
		   while(lastNode.next!=null) {
			   lastNode = lastNode.next;
		   }
		   lastNode.next = node;
		   node.next=null;
		   node.prev = lastNode;
	   }
	   public void insert(int after,int value) {
		   Node prev = find(after);
		   if(prev==null) {
			   System.out.println("Does not exist");
			   return;
		   }
		   Node node = new Node(value);
		   node.next = prev.next;
		   prev.next = node;
		   node.prev = prev;
		   if(node.next!=null)
			   node.next.prev = node;	   
	   }
	   public Node find(int value) {
		   Node node = head;
		   while(node!=null) {
			   if(node.val == value)
				   return node;
			   node = node.next;
		   }
		   return null;
	   }
	   public void display() {
		   Node node = head;
		   while(node!=null) {
			   System.out.print(node.val+" -> ");
			   node = node.next;
		   }
		   System.out.println("END");
	   }
       private class Node{
    	   int val;
    	   Node next;
    	   Node prev;
    	   public Node(int val) { 
    		   this.val=val;
    	   }
    	   public Node(int val,Node next,Node prev) {
    		   this.val=val;
    		   this.next=next;
    		   this.prev=prev;
    	   }
       }
}
