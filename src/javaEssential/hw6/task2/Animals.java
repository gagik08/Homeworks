package javaEssential.hw6.task2;

public enum Animals {
    PIG(1){
        @Override
        public String toString() {
            return "PIG{" +
                    "age=" + age +
                    '}';
        }
    }, ELEPHANT(35){
        @Override
        public String toString() {
            return "ELEPHANT{" +
                    "age=" + age +
                    '}';
        }
    }, WOLF(7){
        @Override
        public String toString() {
            return "WOLF{" +
                    "age=" + age +
                    '}';
        }
    }, ZEBRA(12){
        @Override
        public String toString() {
            return "ZEBRA{" +
                    "age=" + age +
                    '}';
        }
    };
    int age;
    Animals(int age){
        this.age = age;
    }
}


