public class BonusMilesService {
    public int calculate(int price) {
        int priceBonusMiles = 20;
        int calc;
        calc = price / priceBonusMiles;
        return calc;

    }
}