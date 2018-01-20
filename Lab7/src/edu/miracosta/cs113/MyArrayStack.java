package edu.miracosta.cs113;


import java.util.Arrays;
import java.util.EmptyStackException;
/**MyArrayStack.java: 
 *<P> Description: Custom Stack Using ArrayLst
 * 
 * 
 * @author Mike Figueroa
 *
 */

public class MyArrayStack<E> implements StackInt<E>{

	//Data Memebers
		private static final int INITIAL_CAPACITY = 10;
		@SuppressWarnings("unused")
		private E[] theData;
		@SuppressWarnings("unused")
		private int topOfStack = -1;
		private int capacity = INITIAL_CAPACITY;
		
	//--------- Constructors---------//
		
		/**Default
		 * <P> Insantiates ObjectArray with Initial Capcity
		 */
		@SuppressWarnings("unchecked")
		public MyArrayStack () {
			theData = (E[]) new Object[INITIAL_CAPACITY];
		}

	//-------- Stack Methods------------//
		
		/**Stack Push
		 * <P> removes Object at top of stack an returns it.
		 *@return obj
		 */
		@Override
		public E push(E obj) {
			if(topOfStack == theData.length -1) {
				reallocate();
			}
			topOfStack ++;
			theData[topOfStack] =  obj;
			return obj;
		}
		
		/**Stack Peeks
		 * <P> does not remove Obejct at top of stack an returns it.
		 *@return obj
		 */
		@Override
		public E peek() {
			return theData[topOfStack];
		}
		
		/**Removes top obj from stack
		 * @return obj (topOfStack)
		 */
		@Override
		public E pop() {
			if (empty()) {
				throw new EmptyStackException();
			}
			return theData[topOfStack--];
		}

		/**Checks if Stack is empty
		 * @return boolean
		 */
		@Override
		public boolean empty() {
			if(topOfStack == -1) {
				return true;
			}else {
				return false;
			}
		}
		/**Returns the capcity of Stack
		 * 
		 * @return int
		 */
		
		public int getCapacity() {
			return this.capacity;
		}

		/**Doubles the capcity of Array by 2
		 * if object pushe is one + capacity o stack
		 *@param void 
		 */
		private void reallocate() {
				capacity =  2 * capacity;
				theData = Arrays.copyOf(theData, capacity);
		}
	//----------- Other Rewuired ----------//	
		public String toString() {
			String result = "";
			for (int i = 0; i < this.topOfStack + 1; i++)
			{
				
				result = result + theData[i] +  "\n";
			}
			return result;
		}
		
		public boolean equals(Object other) {
			boolean isEqual = false;
			MyArrayStack temp = (MyArrayStack) other;
			if(this.getClass() != temp.getClass()) {
				return false;
			}
			
			for (int i = 0; i<this.topOfStack + 1;i++) {
				
				if (this.pop().equals(temp.pop())){
					isEqual = true;
				}
			}
			return isEqual;
		}
		
}
	