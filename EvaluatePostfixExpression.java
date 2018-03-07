import  edu.princeton.cs.algs4.*;
class EvaluatePostfixExpression{
	public static void main(String[] args) {
		Stack<Integer> operands=new Stack<>();
		while(!StdIn.isEmpty()){
			char ch=StdIn.readChar();
			if(ch>='1' && ch<='9'){
				operands.push(Integer.parseInt(Character.toString(ch)));
				System.out.println(Character.toString(ch));
			}
			else{
				try{
				switch(ch){
					case '+':
					operands.push(operands.pop()+operands.pop());
					break;
					case '-':
					operands.push(operands.pop()-operands.pop());
					break;
					case '/':
					operands.push(operands.pop()/operands.pop());
					break;
					case '*':
					int i=operands.pop()*operands.pop();
					System.out.println("i is"+i);
					operands.push(i);
					break;
					case '%':
					operands.push(operands.pop()%operands.pop());
					break;
				}

				}
				catch(StackEmptyException e){
					System.out.println("The Postfix expression is invalid."+e);
				}
			}
		}
		try{
		
			System.out.println("the value is:"+operands.pop());
		}
		catch(StackEmptyException e){
			System.out.println("invalid");
		}
	}

}