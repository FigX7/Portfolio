package src.edu.miracosta.cs113;
import java.util.Stack;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**LabEight.java 
 *<P>Description: Class meets the requirements 
 *<P>of  Programming Problems 1,2,3, Pg.200
 *<P>Data Structures, Koffman & Wolfgang.
 *t
 */

public class LabEight {

	
	public static void main(String[] args){
		
		
		createLab();
		
		
	}

	/**createLab():
	 *Creates 2 stacks and queue. uses one loop to fill
	 *stack1, second loops pushes stack1 pops and offers queue2
	 *
	 *@param void
	 *
	 */

	public static void createLab(){
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		stack1.push(-1);
		stack1.push(15);
		stack1.push(23);
		stack1.push(44);
		stack1.push(4);
		stack1.push(99);
		int temp = 0;
		
		System.out.println("Stack1 size = " + stack1.size());
		int count = stack1.size();
		
		for (int i = 0  ; i < count ;i++){
			
			queue1.offer(((int)stack1.peek()));
			
			temp = stack1.pop();
			System.out.println("Stack 1 Element = " + stack2.push(temp) );
			
			
		}
		count = stack2.size();
		System.out.println();
		try{
			for (int  i = 0; i < count+1;i++){
				
				System.out.println("Stack2 ouput = " + stack2.pop()  + "");
				System.out.println("Queue ouput = " +(queue1.poll()));
				System.out.println();	
			}	
		}catch(Exception e){
			System.out.println("Stack Empty = " +(stack1.empty()));
			System.out.println("Queue Empty = " +(queue1.isEmpty()));
		}
	}		
	
}
