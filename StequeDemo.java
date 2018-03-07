class StequeDemo {
	public static void main(String[] args) throws Exception{
		Steque<Integer> sq= new Steque<>();
		for(int i=1;i<=10;i++){
			if(i%2==0){
				sq.push(i);
			}
			else{
				sq.enqueue(i);
			}
		}
		Steque<Integer> sq1= new Steque<>(sq);
		System.out.println(sq1.size);
		while(!sq1.isEmpty()){
			System.out.println(sq1.pop());
		}
	}
}