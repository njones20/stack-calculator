import java.util.Stack;

public class Calculator {
    Stack<Integer> stack = new Stack<Integer>(); 
    
    public String toString() {
    	if (stack.isEmpty()){
    		return "[].";
    	}
    	return stack.get(0).toString();
   
    }

	public void loadConstant(int i) {
		stack.push(i);
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}

}
