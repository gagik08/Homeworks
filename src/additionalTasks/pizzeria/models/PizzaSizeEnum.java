package additionalTasks.pizzeria.models;

import additionalTasks.pizzeria.exceptions.PizzaNotFoundException;

public enum PizzaSizeEnum {
    SMALL("small", 30),
    MEDIUM("medium", 40),
    BIG("big", 50);
    private String sizeName;
    private int sizeInMM;

    PizzaSizeEnum(String sizeName, int sizeInMM) {
        this.sizeName = sizeName;
        this.sizeInMM = sizeInMM;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public int getSizeInMM() {
        return sizeInMM;
    }

    public void setSizeInMM(int sizeInMM) {
        this.sizeInMM = sizeInMM;
    }

    @Override
    public String toString() {
        return "PizzaSizeEnum{" +
                "sizeName='" + sizeName + '\'' +
                ", sizeInMM=" + sizeInMM +
                '}';
    }

    public static PizzaSizeEnum getPizzaSizeNameBySizeInMM(int size) throws PizzaNotFoundException {
        PizzaSizeEnum foundedPizza = null;
        int i = 0;
            if (PizzaSizeEnum.values()[i].getSizeInMM() >= size) foundedPizza = PizzaSizeEnum.values()[i];
            else if (PizzaSizeEnum.values()[i+1].getSizeInMM() >= size) foundedPizza = PizzaSizeEnum.values()[i+1];
            else if (PizzaSizeEnum.values()[i+2].getSizeInMM() >= size) foundedPizza = PizzaSizeEnum.values()[i+2];
            else throw new PizzaNotFoundException();
            return foundedPizza;
    }
}
