/**
 * 
 */
package linkedlist;

/**
 * @author NHON NGUYEN
 *
 */
public class IntLinkedList {
	private Node head;

	public IntLinkedList() {
		head = null;
	}

	public void appendElement(int data) {
		Node tempNode = new Node(data, null);
		Node currentNode = head;

		if (head == null) {
			head = tempNode;
		} else {
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			currentNode.setNextNode(tempNode);
		}
	}

	public void removeLastElement() {
		Node currentNode = head;
		Node previousNode = head;

		if (head == null)
			return;

		if (currentNode.getNextNode() == null) {
			head = null;
			return;
		}

		while (currentNode.getNextNode() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}

		previousNode.setNextNode(null);
	}

	public void removeAllElementGreatThan(int value) {
		// Remove all first element that is great than value
		while (head != null && head.getData() > value) {
			head = head.getNextNode();
		}

		Node currentNode = head;
		Node previousNode = head;

		// Remove all element that is great than value
		while (currentNode != null) {
			if (currentNode.getData() > value) {
				previousNode.setNextNode(currentNode.getNextNode());
				currentNode = currentNode.getNextNode();
			} else {
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public void printLinkedList() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
}
