import java.util.ArrayList;

public class PartingWishes {

    private ArrayList<String> partingWishes = new ArrayList<>()
    {{
        add("новый год принесёт много радостных и счастливых дней!");
        add("каждый новый миг наступающего года приноситв дом счастье, везение, уют и теплоту!");
        add("всё что мы планировали, обязательно сбудется");
        add("наступающий год станет самым плодотворным годом в вашей жизни");
        add("год будет полон ярких красок, приятных впечатлений ирадостных событий");
        add("этот год будет ВАШИМ годом!");
        add("новый год принесёт всё, о чём вы мечтаете, и немного больше");
    }};

    public String getPartingWishes() {
        int max = 6;
        int randomIndex = (int) (Math.random() * ++max);
        return partingWishes.get(randomIndex);
    }
}