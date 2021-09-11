import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			List<Student> studentList = new ArrayList<>();

			Student s1 = new Student(101,"Kim",23);
			studentList.add(s1);
			Student s2 = new Student(102,"Ki",24);
			studentList.add(s2);
			Student s3 = new Student(106,"Lee",22);
			studentList.add(s3);
			Student s4 = new Student(103,"Jo",26);
			studentList.add(s4);
			Student s5 = new Student(100,"Park",20);
			studentList.add(s5);
			Student s6 = new Student(105,"Joo",27);
			studentList.add(s6);
			Student s7 = new Student(107,"Son",24);
			studentList.add(s7);
			Student s8 = new Student(104,"Song",23);
			studentList.add(s8);
			Student s9 = new Student(109,"Ryu",22);
			studentList.add(s9);
			Student s10 = new Student(110,"Choi",23);
			studentList.add(s10);

			System.out.println("Student List (ordered by name)");
			Collections.sort(studentList);
			for (Student s : studentList) {
				System.out.println(s.toString());
			}

			System.out.println("Student List (reverse ordered by name)");
			Collections.sort(studentList, Collections.reverseOrder());
			for (Student element : studentList) {
				System.out.println(element.toString());
			}
	}

}