class reverseDemo{
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			ll.addlast(i);
		}
		for(int j:ll){
			System.out.print(j+" ");
		}
		System.out.println("After reversing");
		ll.reverseIterative();	
		for(int j:ll){
			System.out.print(j+" ");
		}
		
		ll.setfirst(ll.reverseRecursive(ll.getfirst()));
		System.out.println("After reversing");	
		for(int j:ll){
			System.out.print(j+" ");
		}
		
	}
}