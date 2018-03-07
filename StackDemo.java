class StackDemo{
public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	for(int i=10;i<100;i++){
		s.push(i);
		
	}

	Stack<Integer> k=new Stack<>(s);
	for(int j:k){
		
		System.out.println(j);
		
	}
}
}