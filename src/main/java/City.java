public class City {

    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;

    public City(final String name, final String region, final String district,
                final int population, final String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{name='" + getName() + "', region='" + getRegion() + "', district='" + getDistrict() +
                "', population="+getPopulation()+", foundation='"+getFoundation()+"'}";
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }
}
