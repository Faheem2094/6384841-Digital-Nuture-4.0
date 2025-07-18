package week1.DesignPatternAndPrinciples.MVCPattern;

public class MVCPatternExample {
    public static void main(String[] args) {
        // Fetch student record from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update the model data
        controller.setStudentName("Moni");
        controller.setStudentGrade("A");

        // Display updated student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Tinu");
        student.setId("100");
        student.setGrade("O");
        return student;
    }
}
