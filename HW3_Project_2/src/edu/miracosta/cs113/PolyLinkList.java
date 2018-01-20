package edu.miracosta.cs113;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * PolyLink.java 
 * <P> Adapted LinkList for types of Term										
 * <P> NOte: Only modificatopn is method addTwoPoly();
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0
 * @param <PolyLinkedLis>

				
*/	

public class  PolyLinkList<E> implements List<E>{

	// Data Memebers
	private Node<E> head = null;;
	private Node<E> tail = null;
	private int size = 0;
	private String container = "";
	//END DATA Memebers
	
	/**Default Contrcuctor
	 * 
	 */
	public PolyLinkList(){
	
	}
	
	/**Checks if LinkList is empty
	 *@returns boolean
	 *
	 */
	//USE Methods
	public boolean isEmpty(){ 
		return size == 0;
	}	
	
	/**Return size of LinkList
	 *@returns size
	 *
	 */
	public int size(){
		return this.size;
	}
	
	
	/**Adds Element to Linke list at a specfic index
	 *@param index (Index to be Inserted at.
	 *@param obj Object to be added
	 *@returns void
	 *
	 *@throws IndexOutOfBoundsException
	 */
	public void add(int index,E obj){
		if(index > size || index < 0){
			throw new IndexOutOfBoundsException("\nIndex = " + index +"\nSize = " + size );
		}

		ListIterator<E> it = this.listIterator(index);
		it.add(obj);

	}
	
	/**Adds Element to  front of List
	 
	 *@param obj Object to be added
	 *@returns void
	 *
	 */
	public void addFirst(E obj){
		add(0,obj);
		
	}
	
	/**Adds Element to  end of List
	 
	 *@param obj Object to be added
	 *@returns boolean Always true.
	 *
	 */
	public boolean add(E obj){
		listIterator(size).add(obj);
		
		return true;
		
	}
	
	
	/**Removes Element from front
	 *@returns null
	 *
	 */
	public  E removeFirst(){
		Node<E> temp = head;
		ListIterator<E> it = this.listIterator(1);
		Node<E>secNode =  new Node<E>();
		secNode = head.next;
		
		head = head.next;
		secNode.prev = head;
		head.prev = null;
		return null;
	}
	
	/**Removes Element from end of Lis
	 *@returns null
	 *
	 */
	public E remove(){
		Node<E>lastNode =  new Node<E>();
		 lastNode = tail.prev;
		 lastNode.prev = lastNode.prev.prev;
		 tail = new Node<E>();
		 lastNode.next = tail;
		 lastNode = tail.prev;
		 System.out.println(lastNode == null);
		 if(lastNode == null){
			
		}else{
		 
		 lastNode.prev = lastNode.prev.prev;
		 tail = new Node<E>();
		 lastNode.next = tail;
		
		} 
		 return (E) lastNode;
		 
	}
	
	/**Removes Element at Index
	 *@param index (Index to remove at)
	 */
	public void removeAt(int index){
		 ListIterator<E> it = this.listIterator(index);
		
		 if(index==0){
			
			 this.removeFirst();
		 }else{
			 it.next();
			 it.remove();
		 } 
	}
	 
	/**Gets Element at Idex
	 *@param index (Index to get)
	 @return result (Object)
	 */
   public E get(int index){
	   ListIterator<E> it = listIterator(index);
	   E result;
	   
	   
	   if(!it.hasNext()){
		  result = null;
	   }else{
		   result = it.next();
		 
		   index--;
	   }
	   return result;
	}
	
     /**Gets First Element 
	 *
	 * @return head (First item in list;
	 */
	public E getFirst(){
		return (E) head;
	}
	
	/**Gets last Element 
	*		 
	* @return head (First item in list;)
	*/
	public E getlast(){
		return (E) tail;
	}
	
	/**Prints Contents List
	 *
	 */
	public void printlist(PolyLinkList x){
		for(int i =0; i<x.size() ;i++){
			
			if(x.get(i) == null){
				
			}else if (i<x.size()){
			System.out.println(x.get(i));
			}
		    
		}
	}
	
	/**Adds Two Polynomials 
	 * 
	 * 
	 * @param x
	 * @param y
	 * @return newPoly
	 * 
	 * <P> Note: Collects Like terms. Uses custom compareTo from Class Term to collect like terms 
	 * 
	 */
	public PolyLinkList addTwoPoly(PolyLinkList x,PolyLinkList y){
		PolyLinkList newPoly = new PolyLinkList();
		int result = 0;
		Term first = new Term();	
		Term second = new Term();
		
		
		for(int i = 0; i <x.size();i++){
			first = (Term) x.get(i);
			second = (Term)y.get(i);
			result = first.compareTo(second);
			System.out.println("Result = " + result);
			if (result > 0){
					newPoly.add(first);
					newPoly.add(second);
					
				}else if( result < 0){
					newPoly.add(second);
					newPoly.add(first);
					
				}else if(result == 0){
					
					Term newTerm = new Term(first.getCoefficient() + second.getCoefficient(),first.getExponent());
					newPoly.add(newTerm);
				}
		}
		
		return newPoly;
	}
	
		
//End Used Methods
	
//----------------------Inner Class NOde
							private static class Node<E>{
								//Node DATE MEMBERS
								public Node<E> next = null;
								public Node<E> prev = null;
								public E data;
							
								public Node(){
									
								}
								
								public Node(E data){
									this.data = data;
									
								}					
							}
//----------------------END Inner Class Node
					
					
					
							
//----------------------Inner Class Iterator
								
					/** Defines an Custom Iterator
					 * 
					 *@author Michael Figueroa
					 *@version 1.0
					 * 
					 */
					private class MyIterator<E> implements ListIterator<E>{
							//Data Members
							private Node<E> nextItem;
							private Node<E> lastAccessed;
							private int index = 0;
							
							
							//Constructors
							
							/** Default Constructors
							 *  
							 */
							public  MyIterator(){
								index = 0;
								nextItem = null;
								lastAccessed = null;
							}
	
							/** Full Constructors
							 * @param i 
							 *<P>Note: i represents whart index to start iterator from) 
							 *@throws IndexOutOfBounds
							 */
							public MyIterator(int i){
								if(i< 0 || index > size){
									throw new IndexOutOfBoundsException("Invalid index" + 1);
								}
								lastAccessed = null;
								if (i == size){
									index = size;
									nextItem = null;
								}else{
									nextItem = (Node<E>) head;
									for(index = 0; index <= i; index++){
										nextItem = nextItem.next;
										
									}
								}
							}	
							//End MyIterator Contructors
							
							// MyIterator Methods
							
							/**Returns last Node Accessed
							 * 
							 * @return lastAccessed
							 */					
							public Node getLastAccessed(){
								return this.lastAccessed;
							}
							
							/**Adds obj to end of List
							 * @param obj
							 * <P>Note: obj is Object to be added
							 */
							@Override
							public void add(E obj) {
								
								
								if (head == null){
									Node newNode =  new Node<E>(obj);
									head =  newNode;
									tail = head;
									
									
									index++;
									
								}
								
								
								if (nextItem == head){
									Node newNode =  new Node<E>(obj);
									newNode.next =  nextItem;
									nextItem.prev =  newNode;
									head = newNode;
							
									size++;
									index++;
									lastAccessed = null;
								}else if (nextItem == null){
									Node newNode =  new Node<E>(obj);
									tail.next =  newNode;
									newNode.prev = tail;
									tail = newNode;
							
									size++;
									index++;
									lastAccessed =  null;
									
									
								}else{
									Node newNode =  new Node<E>(obj);
									newNode.prev = nextItem.prev;
									nextItem.prev.next = newNode;
									newNode.next = nextItem;
									nextItem.prev = newNode;
									
									size++;
									index++;
							
								}
		
							}
							
							/** Checks if there is a next Node
							 * @return hastNext
							 */
							@Override
							public boolean hasNext() {
	
								return nextItem!= null;
							}
							
							/** Checks if there is a previous Node
							 * @return hastPrevious
							 */
							@Override
							public boolean hasPrevious() {
								
								return(nextItem ==  null && size!= 0) || nextItem.prev != null;
								
							}
							/** Moves to next Node in List
							 * @return lastAccessed
							 * <P> last Accessed represents next Element
							 *@throws NoSuchElementException	
							 */
							@Override
							public E next() {
								
								if(!hasNext()){
									throw new NoSuchElementException();
								}
				
								lastAccessed =  nextItem;
								nextItem =  nextItem.next;
								index++;
								return (E) lastAccessed.data;
					
							}
				
							/** Returns next Index in List
							 * 
							 * @retur index +  1
							 */
							@Override
							public int nextIndex() {
								// TODO Auto-generated method stub
								return index +  1;
							}
							
							/** Moves to previous Node in List
							 * @return lastAccessed previous Element
							 *@throws NoSuchElementException	
							 */
							@Override
							public E previous() {
								if (!hasPrevious()){
									throw new NoSuchElementException();
								}
								
								if(nextItem == null){
									nextItem = (Node<E>) tail;
								}else{
									nextItem = nextItem.prev;
								}
								 lastAccessed =  nextItem;
								 index --;
								 return (E) lastAccessed.data;
							
							}
							
							/** Returns previous Index in List
							 * 
							 * @retur index -  1
							 */
							@Override
							public int previousIndex() {
								
								return index - 1;
							}
							
							/**Removes last Accessed element
							 * @param void
							 * 
							 */
							@Override
							public void remove() {
							if(!(hasPrevious())){
						
								Node<E>temp =  new Node<E>();
								Node<E>lastNode =  new Node<E>();
								lastNode = lastAccessed;
								lastNode.next = lastAccessed.next;
								lastNode.prev = lastAccessed.prev;
								
								size--;
								index--;
							}else{
								Node<E>lastNode =  new Node<E>();
								Node<E>temp =  new Node<E>();
								lastNode = lastAccessed.prev;
								temp = lastNode;
								lastNode.prev = temp.prev.prev;
								lastNode.next = lastAccessed.next;
								 size--;
								 index--;
								}
							}
							// not implemented
							@Override
							public void set(E obj) {
								// TODO Auto-generated method stub
								
							}
						
						}
//----------------------------//EndInner Class MyIterator();



			//IMPLEMENTED NOT USED
							@Override
							public boolean addAll(Collection<? extends E> c) {
								// TODO Auto-generated method stub
								return false;
							}
						
							@Override
							public boolean addAll(int index, Collection<? extends E> c) {
								// TODO Auto-generated method stub
								return false;
							}
						
							@Override
							public void clear() {
								// TODO Auto-generated method stub
								
							}
						
							@Override
							public boolean contains(Object obj) {
								// TODO Auto-generated method stub
								return false;
							}
						
							@Override
							public boolean containsAll(Collection<?> c) {
								// TODO Auto-generated method stub
								return false;
							}
						
							@Override
							public int indexOf(Object o) {
								// TODO Auto-generated method stub
									
								
								return 0;
							}
						
							@Override
							public int lastIndexOf(Object o) {
								// TODO Auto-generated method stub
								return 0;
							}
						
							@Override
							public ListIterator<E> listIterator() {
								// TODO Auto-generated method stub
								return new MyIterator<E>(0);
							}
						
							@Override
							public boolean remove(Object obj) {
								
								
								return false;
							}
						
						
							@Override
							public boolean removeAll(Collection<?> c) {
								// TODO Auto-generated method stub
								return false;
							}
						
							@Override
							public boolean retainAll(Collection<?> c) {
								// TODO Auto-generated method stub
								return false;
							}
						
							public E set(int index, E toInsert) {
								return null;
							}
						
							@Override
							public List<E> subList(int fromIndex, int toIndex) {
								// TODO Auto-generated method stub
								return null;
							}
						
							@Override
							public Object[] toArray() {
								// TODO Auto-generated method stub
								return null;
							}
						
							@Override
							public <T> T[] toArray(T[] a) {
								// TODO Auto-generated method stub
								return null;
							}
				//ENDE NOT USED			

							@Override
							public Iterator<E> iterator() {
								// TODO Auto-generated method stub
								return null;
							}

							@Override
							public ListIterator<E> listIterator(int index) {
								// TODO Auto-generated method stub
								return new MyIterator<E>(index);
							}

							@Override
							public E remove(int arg0) {
								// TODO Auto-generated method stub
								return null;
							}

							
							
						
}
//END PolyLinkList