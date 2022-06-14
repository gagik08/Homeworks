package javaEssential.hw9.task5;

public class Company {
    static Company [] companies = {new Company("CocaCola",86.2),new Company("Pepsi", 70), new Company("KFC", 820)};
    private String name;
    private double staffSize;

    Company(String name, double staffSize) {
        this.name = name;
        this.staffSize = staffSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStaffSize() {
        return staffSize;
    }

    public void setStaffSize(double staffSize) {
        this.staffSize = staffSize;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", staffSize=" + staffSize +
                '}';
    }

    public static boolean isStaffLessThan100(Company company) {
        if (company.getStaffSize() < 100) return true;
        else return false;
    }

}
