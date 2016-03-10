import java.util.Stack;

//03.10(2) - Stack만들기 시험 ★★★

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("길동");
		
		//길동
		//---
		//마이콜
		//---
		//둘리
		
		String s = stack.pop();	// 데이터가 빠져나오면서 setting
		System.out.println(s);
		System.out.println(stack.size());
		
		s = stack.peek();		// 지우진 않고 스택의 맨 위(top)에 있는 것을 빼내는 것
		System.out.println(s);
		System.out.println(stack.size());
		
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		
		if(!stack.isEmpty()){
			stack.pop();
		}
		
			
	}

}
