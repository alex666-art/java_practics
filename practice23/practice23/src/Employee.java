public class Employee {
  private String name;
  private String phoneNumber;
  private Position position;

  public Employee(String name, String phoneNumber, Position position) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Position getPosition() {
    return position;
  }

  public void validateName(String name){
    if (!(name.matches(".*[0-9].*"))){
      System.out.println("Name is validated\n");
    }
  }
}
