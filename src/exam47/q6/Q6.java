package exam47.q6;

public class Q6 {
    
    public static void main(String[] args) {
        City[] cityData = {
            new City("札幌", "194"),   //0
            new City("仙台", "105"),   //1
            new City("新潟", "80"),    //2
            new City("横浜", "373"),   //3
            new City("名古屋", "227"), //4
            new City("大阪", "269"),   //5
            new City("熊本", "73"),    //7
            new City("岡山", "70"),    //6
        };

        CityList cList = new CityList(cityData);
        cList.sortData();
        cList.showData();

        for (City city : cityData) {
            System.out.println(city.getName());
        }
    }
}
