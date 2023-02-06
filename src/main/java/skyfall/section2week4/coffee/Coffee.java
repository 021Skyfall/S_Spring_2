package skyfall.section2week4.coffee;

public class Coffee {
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;

    public Coffee(long coffeeId, String korName, String engName, int price) {
        this.coffeeId = coffeeId;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }
}
