package oving1;

import java.util.Arrays;

public class StopWatch {
    boolean started = false;
    boolean hasStopped = false;
    int Ticks;
    int[] Rundetider = { 0 };
    int uavhengigTid = 0;

    public static void main(String[] args) {
        /*
        StopWatch SW = new StopWatch();
        SW.start();
        System.out.println(SW.getTime());
        System.out.println(SW.getLapTime());
        SW.lap();
        SW.tick(750);
        SW.lap();
        
        System.out.println(SW.Rundetider[0]);
        System.out.println(SW.Rundetider[1]);
        System.out.println(SW.Ticks);
        SW.tick(250);
        System.out.println(SW.getTicks());
        */

    }

    public void tick(int ticks) {
        if (this.started && this.hasStopped == false) {
            this.Ticks += ticks;
        } else {
            uavhengigTid += ticks;
        }
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.lap();
        this.hasStopped = true;
    }

    public boolean isStarted() {
        return this.started;
    }

    public boolean isStopped() {
        return this.hasStopped;
    }

    public void lap() {
        if (this.started) {
            if (this.Rundetider[0] == 0) {
                this.Rundetider[0] = this.Ticks;
            } else {
                this.Rundetider = Arrays.copyOf(this.Rundetider, this.Rundetider.length + 1);
                this.Rundetider[this.Rundetider.length - 1] = this.Ticks;
            }
            this.Ticks = 0;
        } else {
            System.err.println("Cannot take a lap if the clock is not running!");
        }
    }

    // getters
    public int getTicks() {
        int returnVal = this.Ticks;
        for (int i : this.Rundetider) {
            returnVal += i;
        }
        return returnVal + uavhengigTid;
    }

    public int getTime() {
        if (this.started == false) {
            return -1;
        } else {
            int returnVal = this.Ticks;
            for (int i : this.Rundetider) {
                returnVal += i;
            }
            return returnVal;
        }
    }

    public int getLapTime() {
        System.out.println("this.started: "+ this.started + " this.hasStopped: " + this.hasStopped);
        if (this.started && this.hasStopped == false) {
            return this.Ticks;
        } else if (this.hasStopped == true) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getLastLapTime() {
        if (this.started && this.Rundetider[0] != 0) {
            return this.Rundetider[this.Rundetider.length - 1];
        } else {
            return -1;
        }
    }
}
