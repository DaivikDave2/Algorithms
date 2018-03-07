public class Parenthesis{
	public static void main(String[] args) {
		Stack<Character> s=new Stack<Character>();
		boolean flag=true;
	while(!Stdin.isEmpty()){
		char a=Stdin.readChar();
		if(a=="{"||a=="["||a=="("){
			s.push(a);
		}
		else{
			if((s.pop()=="{"&&a=="}")||(s.pop()=="("&&a==")")||(s.pop()=="["&&a=="]")){

			}
			else{
				flag=false;
				break;
			}
		}
	}
	if(s.size()!=0){
		flag=false;
	}
	System.out.println("Stack is"+flag);

	}
}