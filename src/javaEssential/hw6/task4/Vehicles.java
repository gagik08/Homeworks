package javaEssential.hw6.task4;

public enum Vehicles {
    CAR(5000, "Green"){
        @Override
        public String toString() {
            return "CAR{" +
                    "price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
    }, MOTORCYCLE(3000, "Black"){
        @Override
        public String toString() {
            return "MOTORCYCLE{" +
                    "price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
    }, TRAIN(150000, "Red"){
        @Override
        public String toString() {
            return "TRAIN{" +
                    "price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
    };
    int price;
    String color;
    Vehicles(int price, String color){
        this.price = price;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
