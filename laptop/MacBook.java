package laptop;

import static laptop.Laptop.MAX_VOL;
import static laptop.Laptop.MiN_VOL;

public class MacBook implements Laptop{
    private int volume;
    boolean is_power_on;

    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop Is On");
        System.out.println("MacBook");
    }

    @Override
    public void PowerOff() {
        is_power_on = false;
        System.out.println("Shutdown Is Process ...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume Is Full ");
            } else {
                this.volume += 10;
                System.out.println("Volume Is :" + this.getVolume());
            }
        }
    }
        @Override
        public void volumeDown() {
        if (is_power_on) {
                if (this.volume == MiN_VOL) {
                    System.out.println("Volume Is 0% ");
                } else {
                    this.volume -= 10;
                    System.out.println("Volume Is : " + this.getVolume());
                }
            }
        }
    
    

    public int getVolume() {
        return this.volume;
    }
}
