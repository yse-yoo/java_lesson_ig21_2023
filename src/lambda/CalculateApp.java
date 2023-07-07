package lambda;

public class CalculateApp {
    
    public static void main(String[] args) {
        ICalculate calculate = new ICalculate() {

            @Override
            public Integer calculateWithoutTaxPrice(Integer price) {
                return 0;
            }
            
        };
    }

}
