package Baitap1;

public class Node {
	public int noidung;
	public Node next;
	public Node pre;
	
	public Node(int nd) { 
		noidung = nd;
	}
	
	public void printNode() {
		System.out.printf("%d\t",noidung);
	}


}
