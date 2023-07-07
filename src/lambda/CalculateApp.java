package lambda;

public class CalculateApp {
    
    public static void main(String[] args) {
        ICalculate calculate = new ICalculate() {
            @Override
            public Integer calculateWithoutTaxPrice(Integer price) {
                Float withoutPrice = price / 1.1f;
                return withoutPrice.intValue();
            }
        };
        Integer withoutTaxPrice = calculate.calculateWithoutTaxPrice(1000);
        System.out.println(withoutTaxPrice);
    }

}
