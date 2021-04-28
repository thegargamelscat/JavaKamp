
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Recep", "Azman");
		Student student2 = new Student(2, "Ahmet", "Y�lmaz");

		Student[] students = { student1, student2 };

		for (Student student : students) {
			System.out.println(student.id + "-" + student.name + " " + student.surname);

		}
		System.out.println("------");
		System.out.println("Total : " + students.length);

		Instructer instructer1 = new Instructer(1, "Engin", "Demiro�");
		Instructer instructer2 = new Instructer(2, "Mehmet", "Y�lmaz");

		Instructer[] instructers = { instructer1, instructer2 };
		for (Instructer instructer : instructers) {
			System.out.println(instructer.id + " " + instructer.name + " " + instructer.surname);
		}
		System.out.println("-----");
		System.out.println("Total : " + instructers.length);

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Kamp� (Java + React)", 1);
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Kamp� (C# + Angular)", 1);
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", 1);

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {

			System.out.println(course.id + " " + course.courseName + " " + course.instructorId);

		}
		System.out.println("------");
		System.out.println("Total :" + courses.length);

		CourseManager courseManager = new CourseManager();
		courseManager.resgisterToCourse(course1);

		courseManager.finishAndContinue();

	}

}
