package Fan_Class;

/*Colton Stone, February 6, 2026, Module 6.2 Assignment

In this program I will create a "Fan" class and then use various fields and methods to make it capable of performing actions
 */

public class Fan {

    final double STOPPED = 0;
    final double SLOW = 1;
    final double MEDIUM = 2;
    final double FAST = 3;

    private double speed = STOPPED;
    private boolean on = true;
    private double radius = 6;
    String color = "white";


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean geton() {
        return on;
    }

    public void seton() {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }


    public Fan() {

    }

    public Fan(double speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    
    public String toString() {
        String fan_Speed = (speed == 0) ? String.valueOf(STOPPED) :
                (speed == 1) ? String.valueOf(SLOW) :
                (speed == 2) ? String.valueOf(MEDIUM) :
                (speed == 3) ? String.valueOf(FAST) : String.valueOf(STOPPED);

        String fan_State = on ? "on" : "off";
        return "This " + color + " fan is currently turned " + fan_State + ", has a radius of " +
        radius + ", and is moving at a speed of " + fan_Speed + ".";

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan(3,true,10,"black");
        System.out.println();
        System.out.println(fan2.toString());
    }


}
