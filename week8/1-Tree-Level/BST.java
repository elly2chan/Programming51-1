import java.util.LinkedList;
import java.util.List;


public class BST <T extends Comparable<T>> {
	private Node<T> root;
	
	public BST() {
		root = null;
	}
	
	public boolean empty() {
		return root == null;
	}
	
	public void add(T data) {
		if(empty()) {
			root = new Node<T>(data); 
		} else {
			if(data.compareTo(root.data) < 0 ){
				if(root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				if(root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}
	
	private void addRecursive(T data, Node<T> root) {
		if(data.compareTo(root.data) < 0) { 
			if(root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);
			}
		} else {
			if(root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); 
			}
		}
	}
	
	
	
	public int getTreeHeight(){
		return getHeightRecursive(root);
	}
	
	public int getHeightRecursive(Node <T> root){
		if (root==null) { return 0; } 
			int left = getHeightRecursive( root.left);
			int right = getHeightRecursive(root.right);
			if (left < right){
				return right +1;
			}
	return left+1;
	}
	
	public void clear(){
		root = null;
	}
	
		public void printLevel(int level) {
		printLevelRecursive(level, root, 1);
	}

	private void printLevelRecursive(int level, Node<T> root, int counter) {
		if (root == null) {
			return;
		}
		if (level == counter) {
			System.out.print(root.data + " ");
		} else {
			printLevelRecursive(level, root.left, counter + 1);
			printLevelRecursive(level, root.right, counter + 1);
		}
	}
	
	public void balance(){
		LinkedList<T> l = toList();
		clear();
		balanceRecursive(l);
	}
	
	private void balanceRecursive( List<T>l){
		if(l.isEmpty()) return;
		int size = l.size();
		int middle = size/2;
		if (size ==1){
			add(l.get(0));
			return;
		}
		add(l.get(middle));
		balanceRecursive( l.subList(0, middle));
		balanceRecursive( l.subList(middle+1, size));
		
	}
	
	public LinkedList<T> toList(){
		LinkedList<T> l = new LinkedList();
		toListRecursive(root, l);
		return l;
	}
	
	private void toListRecursive(Node<T> root, LinkedList<T> l){
		if (root==null) return;
		toListRecursive(root.left, l);
		l.add(root.data);
		toListRecursive(root.right, l);
		
	}
	
	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}
	
	private String toStringRecursive(Node<T> root) {
		if(root == null) return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}
	
	
	public static void main(String[] args){
		BST<Integer> tree = new BST<>();
		for (int i = 0; i<10;i++){
			tree.add(i);
		}
		System.out.println(tree.getTreeHeight());
		tree.balance();
		System.out.println(tree.getTreeHeight());
	}
	
}
