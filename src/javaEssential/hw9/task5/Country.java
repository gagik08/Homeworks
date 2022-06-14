package javaEssential.hw9.task5;

public class Country {
    private static Country [] countries = {new Country("Norway", 5.5),new Country("Sweden", 10.3),new Country("Finland", 5.5),new Country("Denmark", 5.8)};
    private String name;
    private double population;

    Country(String name, double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public static boolean ifNorthernEurope(String country){
        boolean result = false;
        for (Country it : countries){
            if (it.getName().equals(country)) result = true;
        }
        return result;
    }

    public static boolean iSPopulationMoreThan10M(Country country){
        if (country.getPopulation() > 10) return true;
        else return false;
    }

    public static Country countryPopulation (String country){
        Country returnedCountry = null;
        for (Country selectedCountry : countries){
            if (selectedCountry.getName().equals(country)) returnedCountry = selectedCountry;
        }
        return returnedCountry;
    }


}
