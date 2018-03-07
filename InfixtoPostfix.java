import  edu.princeton.cs.algs4.*;
public class InfixtoPostfix{
	public static void main(String[] args) {
		Stack<Character> operators=new  Stack<>();
		while(!StdIn.isEmpty()){
			char ch=StdIn.readChar();
			if((Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')||(ch>='1' && ch<='9')){
				StdOut.print(ch);
			}
			else if(ch=='('){
				operators.push(ch);
			}
			else if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%'){
				try{
					if(!operators.isEmpty()){
						while((getPriority(ch)<getPriority(operators.peep())) && operators.size>=1){
							StdOut.print(operators.pop());
						}

					}
						operators.push(ch);
				}
				catch(StackEmptyException e){
					operators.push(ch);
				}
			}
			else if(ch==')'){
				try{
						while(operators.size>=1 && operators.peep()!='('){
							StdOut.print(operators.pop());
						}
						if(operators.peep()=='('){
							operators.pop();
						}
				}
				catch(StackEmptyException e){
				StdOut.println("Invalid Brackets.");
				}	
			}

			

		}
		while(!operators.isEmpty()){
			try{
			StdOut.print(operators.pop());
			}
			catch(StackEmptyException e){
				StdOut.println("stack empty");
			}
		}
	}

	public static int getPriority(char ch){
		switch(ch){
			case '(':
			return 1;
			case '+':
			case '-':
			return 2;
			case '*':
			case '/':
			return 3;
			case '%':
			return 4;
		}
		return 100;
	}
}