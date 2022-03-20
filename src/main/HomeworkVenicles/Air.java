package main.HomeworkVenicles;

class Air extends Venicles{
    private int wingspan;
    private int minrunway;
    protected Air(int enginepower, int maxspeed, double weight, String brand, int wingspan, int minrunway) {
        super(enginepower, maxspeed, weight, brand);
        this.wingspan = wingspan;
        this.minrunway = minrunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinrunway() {
        return minrunway;
    }
}
