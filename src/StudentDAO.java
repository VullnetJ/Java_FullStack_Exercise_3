
import java.util.List;

	public interface StudentDAO {
		   public List<Student> getAllStudents();
		   public void updateStudent(Student student);
		   public Student getStudentByID(int studentId);
		   public int deleteStudent(int studentId);
		   public int addStudent(int studentId);
		   public int deleteStudent(String id);
		   void deleteStudent(Student student);
		
		   	
}
