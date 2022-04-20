import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CityUtils {

    public static List<City> parse() {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/cities.csv"));
            while (scanner.hasNextLine()) {
                cities.add(parse(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cities;
    }


    public static void print(List<City> cities) {
        cities.forEach(System.out::println);
    }

    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";");
        scanner.skip("\\d*");
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation = null;
        if (scanner.hasNext()) {
            foundation = scanner.next();
        }
        scanner.close();
        return new City(name, region, district, population, foundation);
    }

    public static List<City> sortAsAlphabetically() {
        List<City> cities = parse();
        cities.sort(Comparator.comparing(City::getName));
        return cities;
    }

    public static List<City> doubleSortAsAlphabetically() {
        List<City> cities = parse();
        cities.sort(Comparator
                .comparing(City::getDistrict)
                .thenComparing(City::getName));
        return cities;
    }
}
