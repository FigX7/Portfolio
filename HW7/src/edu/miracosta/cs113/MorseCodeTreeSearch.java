package edu.miracosta.cs113;

public class MorseCodeTreeSearch<E extends Comparable<E>>extends BinaryTree<E>implements SearchTree<E> {

	boolean addReturn;
	
	public int compareTo(E data, E data2) {
		String toComp1 = (String) data;
		String toComp2= (String) data2;
		toComp1 = toComp1.substring(2);
		toComp2 = toComp2.substring(2);
		
		int result = 0;
		if(toComp1.compareTo(toComp2) == 0){
			result = 0;
		}else if(toComp1.compareTo(toComp2) < 0) {
			result = -1;
		}else if(toComp1.compareTo(toComp2) > 0) {
			result = 1;
		}
		
		return result;
		
	}
	
	/** Find method
	 * pre: the target object must implement
	 * 		the Comparable Interface
	 * @param item The object being added
	 * @return true if object is inserted else false
	 */
	
	
	@Override
	public boolean add(E item) {
		root = add(root, item);
		
		return addReturn;
	}
	
	/**Recursive add method
	 * post: the data fiel Addreturn is set true if the item is added, else false
	 *@param localRoot
	 *@param item
	 *@return new local root
	 */
	
	private Node<E> add(Node<E> localRoot, E item){

		if(localRoot == null) {
			addReturn = true;
			return new Node<E>(item);
		}else if(compareTo(item,localRoot.data)== 0) {
			addReturn = false;
			return localRoot;
		}else if(compareTo(item,localRoot.data) < 0) {
			localRoot.left = add(localRoot.left, item);
			return localRoot;
		}else if(compareTo(item,localRoot.data) > 0) {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
			
		}
		return localRoot;
		
	}

	@Override
	public boolean contains(E target) {
		// TODO Auto-generated method stub
		return false;
	}
	/** Find method
	 * pre: the target object must implement
	 * 		the Comparable Interface
	 * @param target
	 * @return the object or null if not found
	 */
	
	
	@Override
	public E find(E target) {
		// TODO Auto-generated method stub
		return find(root, target);
	
	}
	
	private E find(Node<E> localRoot, E target) {
		if (localRoot == null) {
			return null;
		}
		
		int compResult = target.compareTo(localRoot.data);
		if(compResult == 0) {
			return localRoot.data;
		}else if (compResult < 0) {
			return find(localRoot.left, target);
		}else {
			return find(localRoot.right, target);
		}
	}

	@Override
	public E delete(E target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(E target) {
		// TODO Auto-generated method stub
		return false;
	}

}
