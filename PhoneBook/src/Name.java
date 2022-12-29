public class Name implements Comparable<Name> {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " +
                middleName + " " +
                lastName + ", ";
    }

    @Override
    public int compareTo(Name o) {
        if (firstName.compareTo(o.getFirstName()) != 0) {
            return firstName.compareTo(o.getFirstName());
        }
        if (middleName.compareTo(o.getMiddleName()) != 0) {
            return middleName.compareTo(o.getMiddleName());
        }
        if (lastName.compareTo(o.getLastName()) != 0) {
            return lastName.compareTo(o.getLastName());
        }

        return 0;
    }
}
