package exam47.q6;

public class City {
    private String name;
    private int population;

    public City(String name, String population) {
        this.name = name;
        this.population = Integer.parseInt(population);
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

}
