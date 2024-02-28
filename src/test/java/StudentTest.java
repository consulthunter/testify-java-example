import org.testify.Student;
import org.testng.annotations.Test;

public class StudentTest {
    // Helpers
    private Student getTestStudent() {
        return new Student("John", "bob@email.com", "Freshman", "Computer Science", 18, 12345);

    }
    //Tests
    @Test
    public void testGetName() {
        // Arrange
        Student student = getTestStudent();
        String expected = "John";
        // Act
        String actual = student.getName();
        // Assert
        assert actual.equals(expected);
    }
    @Test
    public void testGetEmail() {
        // Arrange
        Student student = getTestStudent();
        String expected = "bob@email.com";
        // Act
        String actual = student.getEmail();
        // Assert
        assert actual.equals(expected);
    }
    @Test
    public void testGetGradeLevel() {
        // Arrange
        Student student = getTestStudent();
        String expected = "Freshman";
        // Act
        String actual = student.getGradeLevel();
        // Assert
        assert actual.equals(expected);
    }
    @Test
    public void testGetMajor() {
        // Arrange
        Student student = getTestStudent();
        String expected = "Computer Science";
        // Act
        String actual = student.getMajor();
        // Assert
        assert actual.equals(expected);
    }
    @Test
    public void testGetAge() {
        // Arrange
        Student student = getTestStudent();
        int expected = 18;
        // Act
        int actual = student.getAge();
        // Assert
        assert actual == expected;
    }
    @Test
    public void testGetId() {
        // Arrange
        Student student = getTestStudent();
        int expected = 12345;
        // Act
        int actual = student.getId();
        // Assert
        assert actual == expected;
    }
}
