class StackFixParenthesis{
	public static void main(String[] args) {
		Stack<String> equation=new Stack<String>();
		while(!Stdin.isempty()){
			char c=Stdin.readChar();
			switch(c){
				case ')':
				String token=fetch_token(equation);
				equation.push(token);
				break;
				default:
				if(c!=' '){
				equation.push(c.toString());
			}
		}
	}
	public String fetch_token(Stack<?> s){
		
	}
		
		
}