/**
 * 
 */
package linkedlist;

/**
 * @author NHON NGUYEN
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkedList intLinkedList = new IntLinkedList();

		intLinkedList.appendElement(13);
		intLinkedList.appendElement(4);
		intLinkedList.appendElement(4);
		intLinkedList.appendElement(3);
		intLinkedList.appendElement(2);

		System.out.println("*** LinkedList is inputed ***");
		intLinkedList.printLinkedList();

		System.out.println("*** LinkedList after remove last element ***");
		intLinkedList.removeLastElement();
		intLinkedList.printLinkedList();

		System.out.println("*** LinkedList after remove all element that great than 3 ***");
		intLinkedList.removeAllElementGreatThan(3);
		intLinkedList.printLinkedList();
	}

}
