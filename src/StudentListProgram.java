public class StudentListProgram {
	public static void main(String[] args) {
		StudentDAO studentDao = new StudentDAOImplementing();
		// print all students
		System.out.println("=== Print students (DAO version) ===");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println(student.getId() + ": " + student.getName() + " " + student.getSurname() + ", "
					+ student.getStreetname() + ", " + student.getPostcode() + " " + student.getCity());
		}		
		//update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Chet");
	      student.setSurname("Atkins");
	      student.setId(1);
	      student.setStreetname("Ratapihantie 13");
	      student.setPostcode("00520");
	      student.setCity("HELSINKI");	   
	      studentDao.updateStudent(student);
	
		// get the student
		Student studentById = studentDao.getAllStudents().get(2);
		System.out.println("=== Find student by id (DAO version) ===");
		System.out.println("Enter student id: 20");
		studentDao.getStudentByID(2);
		System.out.println(studentById.getId() + ": " + studentById.getName() + " " + studentById.getSurname() + ", "
				+ studentById.getStreetname() + ", " + studentById.getPostcode() + " " + studentById.getCity());

	}
}
