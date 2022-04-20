import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();
        CityUtils.print(sortAsAlphabeticallyLambda(cities));
        CityUtils.print(sortAsAlphabeticallyComp(cities));
        CityUtils.print(doubleSortAsAlphabetically(cities));
    }

    public static List<City> sortAsAlphabeticallyLambda(List<City> cities) {
        cities.sort((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return cities;
    }

    public static List<City> sortAsAlphabeticallyComp(List<City> cities) {
        cities.sort(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return cities;
    }

    public static List<City> doubleSortAsAlphabetically(List<City> cities) {
        cities.sort(Comparator
                .comparing(City::getDistrict)
                .thenComparing(City::getName));
        return cities;
    }
}
