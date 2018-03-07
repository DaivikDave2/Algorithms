class ArrayDeque<Type>{
	private int length,size,top,bottom;
	private Type values[];
	ArrayDeque(){
		values=new Type[5];
		length=5;
		size=0;
		top=-1;
		bottom=-1;
	}
	ArrayDeque(int val){
		values=new Type[val];
		length=val;
		size=0;
		top=-1;
		bottom=-1;
	}
	ArrayDeque(ArrayDeque a){}
	public int size(){return size;}
	public boolean isEmpty(){}
	public void pushLeft(Type val){}
	public void pushRight(Type val){}
	public Type popLeft(){}
	public Type popRight(){}
}