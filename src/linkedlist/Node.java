/**
 * 
 */
package linkedlist;

/**
 * @author NHON NGUYEN
 *
 */
public class Node {
	int data;
	Node nextNode;

	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return this.nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
