import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Name, Phone> phoneBook = new TreeMap<>();
        phoneBook.put(new Name("Alex", "Igorev", "Kudris"), new Phone("+79181072937", "Gorka", "10"));
        phoneBook.put(new Name("Mikhail", "Igorevich", "Malkinian"), new Phone("+79311172337", "Severnaya", "12"));
        phoneBook.put(new Name("Igor", "Nikolaevich", "Pomidorov"), new Phone("+792811456337", "Krasnaya", "34"));
        phoneBook.put(new Name("Tatiyana", "Igorevna", "Vaznov"), new Phone("+792811456337", "Lenina", "123"));
        phoneBook.put(new Name("Irina", "Olegovna", "Podgorko"), new Phone("+792811456337", "Mira", "652"));
        phoneBook.put(new Name("Irida", "Afanasieva", "Brova"), new Phone("+792", "Zagordniya", "111"));

        for (Map.Entry<Name, Phone> string : phoneBook.entrySet()) {
            System.out.println("Name: " + string.getKey() + "Phone: " + string.getValue());
        }
    }
}
