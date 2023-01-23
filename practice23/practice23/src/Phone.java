public class Phone {
    private String phoneNumber;
    private static final String ERROR = "Something wrong! Maybe phone number does not match the format...... Try again\n";

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String validatePhoneNumber(String phone) throws WrongNumberException {
            if (phone.length() != 0 && phone.length() >= 3 && phone.length() <= 10) {
                throw new WrongNumberException("Phone number is validate!");
            }
            return phone;
    }
}