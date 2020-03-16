
public class Stack {
	private final int size = 10;
    private Integer[] stack = new Integer[size]; 
    private int top = -1;
    
	public Stack() {
		
	}	
	public int Top() {
		return top;
	}
	public boolean IsEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	
	public boolean Contains(int item) {
		if (!IsEmpty()) {
			for (int i = 0; i < stack.length; i ++) {
				if (stack[i].equals(item)) {
					return true;
				}
			}
        }
		return false;
	}
	
	public void Push(int item){
		if(top == stack.length -1) {
			System.out.println("Stack is full");
			return;
		}
		
		top++;
		stack[top] = item;
	}
	
	public void Pop()  {
		if(IsEmpty()) {
			System.out.println("Stack is full");
			return;
		}
		stack[top] = null;
		top--;
	
	}
	
	public int Peek() {
		if(IsEmpty()) {
			System.out.println("Stack is empty");
		}
		return stack[top];
	}
	
	
	public void Clear(){		
		if (IsEmpty()) {
			System.out.println("Stack is empty");
			return;
        }
		for (int i = top; i >= 0; i --) {
			Pop();
		}
	}
}


