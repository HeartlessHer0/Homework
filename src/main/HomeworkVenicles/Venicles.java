package main.HomeworkVenicles;

abstract class Venicles {
    private int enginepower;
    private int maxspeed;
    private double weight;
    private String brand;
    protected Venicles(int enginepower, int maxspeed, double weight, String brand){
        this.enginepower = enginepower;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public int getEnginepower() {
        return enginepower;
    }
}
