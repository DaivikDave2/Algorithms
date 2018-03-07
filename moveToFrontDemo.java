public class moveToFrontDemo{
	public static void main(String[] args) {
		moveToFront<Integer>  mf=new moveToFront<>();
		for(int i=0;i<args.length;i++){
			mf.add(Integer.parseInt(args[i]));
		}
		mf.display();
	}
}