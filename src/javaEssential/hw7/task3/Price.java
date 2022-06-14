package javaEssential.hw7.task3;

public class Price implements Comparable <Price>{
    private String productName;
    private String storeName;
    private double priceInUSD;

    public Price(String productName, String shopName, double priceInUSD) {
        this.productName = productName;
        this.storeName = shopName;
        this.priceInUSD = priceInUSD;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }

    public void setPriceInUSD(double priceInUSD) {
        this.priceInUSD = priceInUSD;
    }

    @Override
    public String toString() {
        return  "ProductName ='" + productName + '\'' +
                ", StoreName ='" + storeName + '\'' +
                ", Price =" + priceInUSD +
                " USD} ";
    }

    @Override
    public int compareTo(Price price) {
        return this.storeName.compareTo(price.getStoreName());
    }

    public void searchByStoreName(String storeName){
        if (this.storeName.equals(storeName)){
            toString();
        }
    }
}
