package Fan_Class_Pt2;

/*Colton Stone, February 13, 2026, Module 7.2 Assignment

In this program I will build upon the "Fan" class from the previous assignment and add a collection of fan instances then display the functions of them.
 */

class UseFans {

    private int blade_Num;
    final int BLADE_MIN = 3;
    final int BLADE_MAX = 6;
    private double speed_Adj;
    private boolean fan_State;


    public int getBlades() {
        return blade_Num;
    }

    public void setBlades(int blade_Num) {
        this.blade_Num = blade_Num;
    }

    public void fan_Model() {
        blade_Num = Math.max(BLADE_MIN, Math.min(blade_Num, BLADE_MAX));
        System.out.println();
        System.out.println("\nYou purchased a fan model with an amount of " + blade_Num +
        " blades");
    }

    public double getSpeed_Adj() {
        return speed_Adj;
    }

    public void setSpeed_Adj(double speed_Adj) {
        this.speed_Adj = speed_Adj;
    }

    public void speed_Adjustment() {
       if (speed_Adj == 0) {
           System.out.println("\nThe fan is turned off");
        }

        else if (speed_Adj == 1) {
            System.out.println("\nThe fan is set to a low speed");
        }

       else if (speed_Adj == 2) {
           System.out.println("\nThe fan is set to a medium speed");
       }

       else if (speed_Adj == 3) {
           System.out.println("\nThe fan is set to a high speed");
       }
    }

    public boolean getfan_State() {
        return fan_State;
    }

    public void setfan_State(boolean fan_State) {
        this.fan_State = fan_State;
    }

    public void fan_State() {

        if (fan_State == false) {
            System.out.println("\nThe fan is disabled");
        }

        else if (fan_State == true) {
            System.out.println("\nThe fan is enabled");
        }

    }

    public void UseFans (int blade_Num, double speed_Adj, boolean fan_State) {
        this.blade_Num = blade_Num;
        this.speed_Adj = speed_Adj;
        this.fan_State = fan_State;

        fan_Model();
        speed_Adjustment();
        fan_State();
    }

    public void UseFans () {
        this.blade_Num = 5;
        this.speed_Adj = 0;
        this.fan_State = false;

    }


}

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
        return "\nThis " + color + " fan is currently turned " + fan_State + ", has a radius of " +
        radius + ", and is moving at a speed of " + fan_Speed + ".";

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan(3,true,10,"black");
        System.out.println();
        System.out.println(fan2.toString());

        // The "UseFans" class objects

        UseFans Ufan1 = new UseFans();
        UseFans Ufan2 = new UseFans();


        Ufan1.UseFans(6,3,true);
        Ufan2.fan_Model();
        Ufan2.speed_Adjustment();
        Ufan2.fan_State();



    }


}
