package StudentManagementSystem;

public class Student {
	private String id;
	private String name;
	private double gpa;

	public Student(String id, String name, double gpa) {
		if (!isValidId(id)) {
			throw new IllegalArgumentException("Ma sinh vien khong hop le");
		}
		this.id = id;
		this.name = name;
		setGpa(gpa);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}

	public String getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	public String getName() {
		return name;
	}

	public void setGpa(double gpa) {
		if (gpa < 0 || gpa > 10) {
			throw new IllegalArgumentException("Diem khong hop le");
		}
		this.gpa = gpa;
	}

	public static boolean isValidId(String id) {
		return id != null && id.matches("SV\\d{2,6}");
	}

}
