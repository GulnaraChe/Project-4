public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_300;
        int miles;
        miles = service.calculate(price);
        System.out.println(miles);
    }
}