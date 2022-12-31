public class HappyNewYear {
    public static void main(String[] args) {
        ReasonForTheHoliday reasonForTheHoliday = new ReasonForTheHoliday();
        IWish iWish = new IWish();
        PartingWishes partingWishes = new PartingWishes();

        System.out.println("С новым годом, " + reasonForTheHoliday.getReasons() + " Я желаю " + iWish.getWish() + " И пусть " + partingWishes.getPartingWishes());
    }
}
