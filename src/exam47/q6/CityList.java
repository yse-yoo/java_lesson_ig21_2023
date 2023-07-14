package exam47.q6;

public class CityList {
    private static final int BASE = 10;
    private static final int PLACE_MAX = BASE * BASE;
    private City[] cities;

    //コンストラクタ
    CityList(City[] cityData) {
        // cities = cityData;
        cities = new City[cityData.length];
        for (int dist = 0; dist < cityData.length; dist++) {
            cities[dist] = cityData[dist];
        }
    }

    void sortData() {
        final int length = cities.length;
        int place = 1;
        while (place <= PLACE_MAX) {
            int next = 0;
            for (int digit = 9; digit >= 0; digit--) {
                // target: cities の index
                // next: cities の index
                for (int target = 0; target < length; target++) {
                    System.out.println("-- getDigit --");
                    System.out.println(cities[target].getName() + "の" + place + "の位：" + getDigit(target, place));
                    if (getDigit(target, place) == digit) {
                        move(target, next);
                        next++;
                    }
                }
            }
            // 位を10倍する　問題の10の説明
            place *= BASE;
        }
    }

    private int getDigit(int target, int place) {
        return ((cities[target].getPopulation() / place) % BASE);
    }

    private void move(int from, int to) {
        City tmp = cities[from];
        for (int shift = from - 1; shift >= to; shift--) {
           cities[shift + 1] = cities[shift]; 
        }
        cities[to] = tmp;
    }

    void showData() {
        for (City city : cities) {
            String message = city.getName() + "\t" + city.getPopulation();
            System.out.println(message);
        }
    }
}
