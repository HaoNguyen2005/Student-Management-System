package StudentManagementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		boolean running = true;

		while (running) {
			System.out.println("1. Them sinh vien");
			System.out.println("2. Xoa sinh vien");
			System.out.println("3. Tim theo id");
			System.out.println("4. In danh sach");
			System.out.println("5. In Sinh vien co Gpa cao nhat");
			System.out.println("0. Thoat");
			System.out.print("Chon: ");

			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so");
				continue;
			}

			switch (choice) {
			case 1:
				try {
					System.out.print("Vd: SV01 " + "Nhap ma sinh vien: ");
					String id = sc.nextLine();

					System.out.print("Nhap ten sinh vien: ");
					String name = sc.nextLine();

					System.out.print("Nhap GPA: ");
					double gpa = Double.parseDouble(sc.nextLine());

					Student s = new Student(id, name, gpa);
					manager.addStu(s);

					System.out.println("Them sinh vien thanh cong!");

				}  catch (NumberFormatException e) {
				    System.out.println("Loi: GPA phai la so");
				} catch (DuplicateStudentException | IllegalArgumentException e) {
				    System.out.println("Loi: " + e.getMessage());
				}

				break;
			case 2:
				System.out.print("Nhap ma sinh vien can xoa: ");
				String idRemove = sc.nextLine();

				if (manager.remove(idRemove)) {
					System.out.println("Xoa sinh vien thanh cong!");
				} else {
					System.out.println("Khong tim thay sinh vien!");
				}
				break;
			case 3:
				System.out.print("Nhap ma sinh vien can tim: ");
				String idFind = sc.nextLine();

				Student found = manager.findById(idFind);

				if (found != null) {
					System.out.println("Tim thay sinh vien:");
					System.out.println(found);
				} else {
					System.out.println("Khong tim thay sinh vien!");
				}
				break;
			case 4:
				manager.displayStu();
				break;
			case 5: 
				Student top = manager.findTop();
			    if (top == null) {
			        System.out.println("Danh sach trong");
			    } else {
			        System.out.println("Sinh vien co GPA cao nhat: " + top);
			    }
			case 0:
				running = false;
				break;
			default:
				System.out.println("Lua chon khong hop le");
			}
		}
		sc.close();
	}

}
