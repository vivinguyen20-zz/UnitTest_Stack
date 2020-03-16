
public class Stack implements IStack{
	private final int size = 10;
    private Integer[] stack = new Integer[size]; 
    private int top = -1;
    
	public Stack() {
		
	}
	@Override
	public Integer Top() {
		return top;
	}
	@Override
	public boolean IsEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	@Override
	public boolean Contains(Integer number) {
		if (!IsEmpty()) {
			for (int i = 0; i < stack.length; i ++) {
				if (stack[i].equals(number)) {
					return true;
				}
			}
        }
		return false;
	}
	
	@Override
	public void Pop()  {
		if(IsEmpty()) {
			System.out.println("Stack is full");
			return;
		}
		stack[top] = null;
		top--;
	
	}
	@Override
	public Integer Peek() {
		if(IsEmpty()) {
			System.out.println("Stack is empty");
		}
		return stack[top];
	}
	
	@Override
	public void Clear(){		
		if (IsEmpty()) {
			System.out.println("Stack is empty");
			return;
        }
		for (int i = top; i >= 0; i --) {
			Pop();
		}
	}
	
	@Override
	public void Push(Integer number) {
	
		if(top == stack.length -1) {
			System.out.println("Stack is full");
			return;
		}
		
		top++;
		stack[top] = number;
		
	}
}


