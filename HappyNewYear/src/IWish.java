import java.util.ArrayList;

public class IWish {

    private ArrayList<String> wish = new ArrayList<>() {{
        add("много новых достижений, крепкого здоровья и любви, пусть задуманное сбудется.");
        add("чтобы этот год подарил много поводов для радости и счастливых моментов.");
        add("чтобы будущий год принёс столько радостей, сколько дней в году, и чтобы каждый день дарил вам улыбку и частичку добра.");
        add("вам прекрастного года, полного здоровья и благополучия.");
        add("чтобы Кролик принёс в вашу семью любовь, нежность, взаимопонимания и счастье.");
        add("всем в Новом году быть здоровыми, красивыми, любимыми и успешными!");
        add("чтобы сбылось всё то, что вы пожелали. Все цели достигнуты, а планы перевыполнены. Всё плохое и неприятное осталось в уходящем году.");
    }};

    public String getWish() {
        int max = 6;
        int randomIndex = (int) (Math.random() * ++max);
        return wish.get(randomIndex);
    }
}
