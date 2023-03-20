public class Horse {
    public Horse(String name) {                                     // 2 constructions
        this.name = name;
    }

    public Horse(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String name;
    double speed = 3;
    double distance = 0;
    public int number;


    public void move() {
        distance += speed * Math.random();
    }                           // randomize speed

    public void print() {                                               /// sout distance
        System.out.println("");
        for (int i = 0; i < Math.floor(distance); i++) {
            System.out.print(".");
        }
        System.out.print(number + "\uD800\uDC83");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
