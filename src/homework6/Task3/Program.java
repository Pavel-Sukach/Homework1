package homework6.Task3;

import java.util.Map;

public class Program {
    public static void main(String[] args) {
        CountriesCont.fillCountriesCont();

        for(Map.Entry<String,String> pair : CountriesCont.countriesCont.entrySet()){
            CountriesCont.countries.add(pair.getKey());
            CountriesCont.continents.add(pair.getValue());
        }

        int i = 0;
        for(String country : CountriesCont.countries) {
                System.out.printf("%s is in %s.\n", country, CountriesCont.continents.get(i));
                i++;
        }
    }
}
