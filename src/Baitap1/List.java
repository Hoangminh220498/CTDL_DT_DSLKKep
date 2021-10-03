package Baitap1;

public class List {
	
	public Node first, last;
	
	public List() {
		first = last = null;
	}
	
	public void chenDau(int x) { 
		Node nut = new Node(x);
		if (first != null) {
			nut.next = first;
			nut.pre = null;
			first.pre = nut;
			first = nut;
		}
		else {
			nut.next = nut.pre = null;
			first = last = nut;
		}
	}
	
	// In mang
	public void printList() {
		Node p = first;	
		System.out.println("List la: ");
		while (p != null) {
			p.printNode();
			p = p.next;
		}
	}
		
	// In cac phan tu le
	public void printLe() {
		Node p = first;	
		System.out.println("\nCac so le là:");
		while (p != null) {
			if (p.noidung %2 == 1) {
				p.printNode();
			}
				p = p.next;
		}
	}
		
	//Kiem tra danh sach rong hay k?
	public boolean isEmpty() {
		return first == null;
	}
		
	//TBC
	public double tinhTrungBinhCong() {
		Node p = first;	
		int tong = 0;
		int dem = 0;
		while (p != null) {
			tong += p.noidung;
			dem++;
			p = p.next;
		}
		return (double) tong/dem;
	}
		
	// Mang co x hay k?	
	public boolean checkX(int x) {
		Node p = first;	
		while (p != null) {
			if (p.noidung == x) {
				return true;
			}
			p = p.next;
		}
		return false;
	}
		
	//so phan tu chia het cho x, nhung k chia het cho y
	public void checkXY(int x, int y) {
		Node p = first;
		int dem = 0;
		while (p != null) {
			if ((p.noidung % x == 0) && (p.noidung % y != 0)) {
				dem++;
			}
			p = p.next;
		}
		System.out.printf("So phan tu chia het cho %d nhung k chia het cho %d la: %d",x,y,dem);
	}
		
	// Sx 
	public void sxList(){
		Node p = first;
		boolean check = true;
		while (p.next != null) {
			if (p.noidung > p.next.noidung) {
				check = false;
			}
			p = p.next;
		}
		if (check == true) {
			System.out.println("\n Mang tang dan");
			printList();
		} else {
			System.out.println("\n Mang sau khi sap xep la");
			Node temp;
			while (p.next != null) {
				while (p != null) {
					if (p.noidung > p.next.noidung) {
						temp = p;
						p = p.next;
						p.next = temp;
					}
					p = p.next;
				}
				p = p.next;
			}
			printList();
		}
	}

}
