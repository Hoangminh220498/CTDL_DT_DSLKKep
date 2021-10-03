package Baitap2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dinh nghia ds
		List list = new List();
						
		//Nhap ds sv tu ban phim
		Scanner sc = new Scanner(System.in);
		int test = 1;
		while (test == 1) {
			System.out.println("Nhap ten SV: ");
			String hoten = sc.next();
			System.out.println("Nhap tuoi: ");
			byte tuoi = sc.nextByte();
			System.out.println("Nhap DTB: ");
			double dtb = sc.nextDouble();
			list.chenDau(hoten, tuoi, dtb);
			System.out.println("Lua chon nhap 1 de tiep tuc nhap, nhap 0 de ket thuc viec nhap:");
			test = sc.nextInt();
		}
						
		//In ds sinh vien
		list.printList();
						
		//Dem xem co bao nhieu sv có dtb > 5
		System.out.println("\nSo sinh vien co DTB > 5 la: " + list.dem());
						
		//In ra cac SV tuoi tren 25 va dtb > 8
		list.print();
	}

}
