package homework6.Task3;

import java.util.*;

public class CountriesCont {
    public static Map<String,String> countriesCont = new HashMap<>();
    public static Set<String> countries = new LinkedHashSet<>();
    public static List<String> continents = new ArrayList<>();
    public static void fillCountriesCont(){
        countriesCont.put("Belarus","Eurasia");
        countriesCont.put("South Korea","Eurasia");
        countriesCont.put("Uruguay","South America");
        countriesCont.put("Namibia","Africa");
        countriesCont.put("Ghana","Africa");
        countriesCont.put("Benin","Africa");
        countriesCont.put("Bhutan","Eurasia");
        countriesCont.put("Lebanon","Eurasia");
        countriesCont.put("Belize","North America");
        countriesCont.put("Peru","South America");
    }
}
