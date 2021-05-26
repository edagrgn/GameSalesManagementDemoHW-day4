package Entities;

public class Game {
    private int id;
    private String gameName;
    private String serialNumber;
    private String gameDescription;
    private double price;
    private double releaseDay;

    public Game(){


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(double releaseDay) {
        this.releaseDay = releaseDay;
    }
}
