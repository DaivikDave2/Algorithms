class DoublyDemo{
	public static void main(String[] args) throws Exception{
		DoublyLinkedList<Integer> dll=new DoublyLinkedList<>();
		dll.insertAtFirst(-2);
		dll.insertAtFirst(-2);
		dll.insertAtFirst(-2);
		dll.insertAtFirst(-2);
		for(int i=0;i<=100;i+=10){
			dll.insertBefore(i+2,i/10);
		}
		dll.insertAtFirst(-2);
		System.out.println("Showing after initial insertion");
		dll.removeAtLast();
		dll.display();
	}
}