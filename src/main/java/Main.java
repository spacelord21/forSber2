import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/cities.csv"));
            scanner.useDelimiter(";");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(";");
                if(fields.length==6) {
                    cities.add(new City(fields[1],fields[2],fields[3],Integer.parseInt(fields[4]),fields[5]));
                }
                else{
                    cities.add(new City(fields[1],fields[2],fields[3],Integer.parseInt(fields[4]),""));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(City city : cities) {
            System.out.println(city.toString());
        }
    }
}
