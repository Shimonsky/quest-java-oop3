import javax.swing.text.Style;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        if(!this.flying && this.altitude == 0) {
            System.out.printf("%s takes off in the sky.%n", this.getName());
            this.flying = true;
        }
    }

    public void ascend(int meters) {
        if(this.flying) {
            this.altitude += meters;
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        }
    }

    public void glide() {
        if(this.flying && this.altitude > 0) {
            System.out.println("Glides into the air.");
        }
    }

    public void descend(int meters) {
        if(this.flying) {
            this.altitude -= meters;
            if (this.altitude > 0) {
                System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude); 
            } else {
                System.out.printf("%s is too high, it can't land.%n", this.getName());
            }
        }
    }

    public void land() {
        if(this.flying && this.altitude <= 1) {
            System.out.printf("%s land on the ground.%n", this.getName());
            this.flying = false;
            this.altitude = 0;
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}
