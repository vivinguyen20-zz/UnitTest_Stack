import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackJUnitTest {
	
	private Stack stack = new Stack();
	
	@BeforeEach
	void setUp() throws Exception {
		Integer[] number = {1, 2, 5 ,6};
		for (int i = 0; i < number.length; i ++) {
			stack.Push(number[i]);
		}
	}

	@Test
	void testStackPush() {
		
		assertEquals(3, stack.Top());
	}

	@Test
	void testStackPeek()  {

		assertEquals(6, stack.Peek());
	}

	@Test
	void testStackContains()  {
	
		assertEquals(true, stack.Contains(1));
	}

	@Test
	void testStackPop() {
		
		stack.Pop();
		assertEquals(2, stack.Top());
	}
	
	@Test
	void testStakClear(){
		
		stack.Clear();
		assertEquals(-1, stack.Top());
	}
	
	@Test
	void testStackIsEmpty(){
		
		assertEquals(false, stack.IsEmpty());
	}
	
}


