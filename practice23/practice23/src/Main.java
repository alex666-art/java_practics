public class Main {
    public static void main(String[] args) throws WrongNumberException {

        Employee employee1 = new Employee("Alex", "87564", Position.DEVELOPER);
        Employee employee2 = new Employee("Alex", "324232", Position.LEAD);
        Employee employee3 = new Employee("Alex", "fgdgdd", Position.MANAGER);

        Phone phone = new Phone("12342342134234234234234");

        String name = employee1.getName();
        String phoneNumber = phone.getPhoneNumber();

        System.out.println("Name: " + employee1.getName() + "\n" +
                "Phone: " + employee1.getPhoneNumber() + "\n" +
                "Position: " + employee1.getPosition() + "\n");

        System.out.println("--------------------------------------\n");

        employee1.validateName(name);
        System.out.println(phone.validatePhoneNumber(phoneNumber));

        System.out.println("Name: " + employee2.getName() + "\n" +
                "Phone: " + employee2.getPhoneNumber() + "\n" +
                "Position: " + employee2.getPosition() + "\n");

        employee2.validateName(name);

        System.out.println("--------------------------------------\n");

        employee3.validateName(name);
        System.out.println(phone.validatePhoneNumber(phoneNumber));

        System.out.println("Name: " + employee3.getName() + "\n" +
                "Phone: " + employee3.getPhoneNumber() + "\n" +
                "Position: " + employee3.getPosition() + "\n");

        employee3.validateName(name);
    }
}