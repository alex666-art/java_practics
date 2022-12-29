public class Phone extends Address {

    private String phone;

    public Phone(String phone, String street, String building) {
        super(street, building);
        this.phone = validatePhoneNumber(phone);
    }

    private String validatePhoneNumber(String phone) {
        if (phone.length() <= 11) {
            return "Wrong number! Please retry enter phone number";
        }
            return phone;
    }

    @Override
    public String toString() {
        return phone + ", " +
                "Address: " +
                street + " " +
                building;
    }
}
