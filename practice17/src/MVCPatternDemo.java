public class MVCPatternDemo {
    public static void main(String[] args) {
        // Fetch employee record based on his roll no from the database
        Employee model = retrieveEmployeeFromDatabase();
        // Create a view : to write employee details on console
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        // Update model data
        controller.setEmployeeName("arkachka");
        controller.setEmployeeId(111111);
        controller.setEmployeeSalary(717171);
        controller.updateView();
    }
    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee("bobo abo", 6669, -1);
        return employee;
    }
}
