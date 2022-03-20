package main.HomeworkVenicles;

class Ground extends Venicles{
    private int wheels;
    private double fuelconsuption;
    protected Ground(int enginepower, int maxspeed, double weight, String brand, int wheels, double fuelconsuption) {
        super(enginepower, maxspeed, weight, brand);
        this.wheels=wheels;
        this.fuelconsuption=fuelconsuption;
    }

    public int getWheels() {
        return wheels;
    }

    public double getFuelconsuption() {
        return fuelconsuption;
    }
}
