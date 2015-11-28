package ru.baccasoft;

/**
 * Created by Vitalik on 29.11.2015.
 */
public class Timing {
    long startTime;
    long endTime;

    public Timing() {
        this.startTime = 0;
        this.endTime = 0;
    }

    @Override
    public String toString() {
        return "Total time = " + (this.endTime-this.startTime) + " milisec";
    }

    public void start() {
        this.startTime =  System.currentTimeMillis();
    }

    public void stop() {
        this.endTime  =  System.currentTimeMillis();
    }
    public long getTime() {
       return this.endTime-this.startTime;
    }
}
