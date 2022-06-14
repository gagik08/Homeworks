package javaEssential.hw9.task5;

public class MyClass <T>{
    private static Class<?> modelType;

    public MyClass() {
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "genericType - " + modelType +
                '}';
    }

    public static <T> void factoryMethod(T model, String country) {
        modelType = model.getClass();
        System.out.println("Type of field - " + modelType);
        if (model instanceof Country) {
            System.out.println("The country is located in northern europe - " + Country.ifNorthernEurope(country));
            if (Country.ifNorthernEurope(country)) System.out.println("Is the population of this country more than 10 million?" + Country.iSPopulationMoreThan10M(Country.countryPopulation(country)));
        }
//        else if (field instanceof Company){
//            System.out.println("Company name - " + ((Company) field).getName());
//            System.out.println("The company's staff is less than 100? - " + Company.isStaffLessThan100((Company) field));
//        }
//        else System.out.println("No such methods have been found.");
    }
}
