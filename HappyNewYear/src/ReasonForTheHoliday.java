import java.util.ArrayList;

public class ReasonForTheHoliday {

    private ArrayList<String> reasons = new ArrayList<>() {{
        add("с новым счастьем!");
        add("365 новых дней. 365 новых шансов!");
        add("наслаждайтесь каждым его моментом!");
        add("примите мои искренние поздравления!");
        add("годом Кролика!");
        add("новый старт начинается сегодня!");
        add("и пусть самые лучшие сюрпризы будут у вас впереди!");
    }};

    public String getReasons() {
        int max = 6;
        int randomIndex = (int) (Math.random() * ++max);
        return reasons.get(randomIndex);
    }
}
