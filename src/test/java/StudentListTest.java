import org.junit.jupiter.api.Test;
import org.testify.StudentList;

import java.io.ByteArrayInputStream;

public class StudentListTest {
    private StudentList getTestStudentList() {
        return new StudentList();
    }
    private StudentList addTestStudent(StudentList studentList){
        ByteArrayInputStream in = new ByteArrayInputStream("John\n bob@email.com\n Freshman\n Computer Science\n 18\n 12345\n".getBytes());
        System.setIn(in);
        studentList.addStudent();
        return studentList;
    }
    @Test
    public void testAddStudent() {
        // Arrange
        StudentList studentList = getTestStudentList();
        int expected = 1;
        // Act
        StudentList studentListWithStudent = addTestStudent(studentList);
        int actual = studentListWithStudent.getStudents().size();
        // Assert
        assert expected == actual;
    }

}
