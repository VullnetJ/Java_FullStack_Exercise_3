import java.util.ArrayList;
import java.util.List;
public class StudentDAOImplementing implements StudentDAO {
	
	List<Student> students;

	public StudentDAOImplementing() {

		students = new ArrayList<Student>();
		Student student1 = new Student("Ginger", "Baker", 40, "Rumputie 10", "54120", "PULP");
		Student student2 = new Student("Jack", "Bruce", 10, "Asematori 3", "00520", "HELSINKI");
		Student student3 = new Student("Eric", "Clapp", 20, "Luuttutie 4", "54120", "PULP");
		Student student4 = new Student("Diana", "Doe", 30, "Kuusikuja 6", "01200", "VANTAA");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

	}
	
	@Override
	   public void deleteStudent(Student student) {
	     try {
	    	System.out.println("=== Delete student ==="); 
		students.remove(student.getId());
		System.out.println(student.getId() + "deleted from database"); 
	     } catch (Exception e) {
	    	 System.out.println("-1");
	     }
		
	     
	   }

	
	// Retrieve list of students from the database
	@Override
	public List<Student> getAllStudents() {
		System.out.print("\n");
		return students;
		
	}
	
	// update student
	 @Override
	   public void updateStudent(Student student) {
	      students.get(student.getId()).setName(student.getName());
	      System.out.println("=== Update student ===");
	      System.out.println("Id: " + student.getId());
	      System.out.println("First name: " + student.getName() );
	      System.out.println("Last name: " + student.getSurname());	      
	      System.out.println("Street: " + student.getStreetname());
	      System.out.println("Postcode: " + student.getPostcode());
	      System.out.println("Post office: " + student.getCity() + "\n"); 	      
	      System.out.println("Student updated from database");
	      System.out.print("\n");
	      
	   }
	 // get by student by id. 
	@Override
	public Student getStudentByID(int id) {
		return students.get(id);
	}

}
