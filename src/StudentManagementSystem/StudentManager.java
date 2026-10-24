package StudentManagementSystem;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<Student> list = new ArrayList<>();

	public void addStu(Student s) throws DuplicateStudentException {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID().equals(s.getID())) {
				throw new DuplicateStudentException("Trung ma sinh vien: " + s.getID());
			}
		}
		list.add(s);
	}

	public boolean remove(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID().equals(id)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public Student findById(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID().equals(id)) {
				return list.get(i);
			}
		}
		return null;
	}

	public void displayStu() {
		if (list.isEmpty()) {
			System.out.println("Danh sach trong");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public Student findTop() {
		   if (list.isEmpty()) {
		        return null;
		    }
		   Student top=list.get(0);
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getGpa() > top.getGpa()) {
			    top = list.get(i);
			}
		}
		return top;
	}
}
