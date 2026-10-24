package StudentManagementSystem;

public class Student {
	private String id;
	private String name;
	private double gpa;

	public Student(String id, String name, double gpa) {
	    if (!isValidID(id)) {
	        throw new IllegalArgumentException("Id khong hop le");
	    }
	    if (name == null || name.trim().isEmpty()) {
	        throw new IllegalArgumentException("Ten khong duoc rong");
	    }
	    this.id = id;
	    this.name = name;
	    setGpa(gpa);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if (gpa < 0 || gpa > 10) {
			throw new IllegalArgumentException("Diem khong hop le");
		}
		this.gpa = gpa;
	}

	public static boolean isValidID(String id) {
		return id != null && id.matches("SV\\d{2,6}");
	}
	
}
