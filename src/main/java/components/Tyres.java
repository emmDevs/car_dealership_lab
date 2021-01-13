package components;

public class Tyres {

    private int size;
    private String brand;
    private String season;

    public Tyres(int size, String brand, String season){
        this.size = size;
        this.brand = brand;
        this.season = season;
    }

    public int getSize() {
        return size;
    }

    public void changeSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void changeSeason(String season) {
        this.season = season;
    }
}
