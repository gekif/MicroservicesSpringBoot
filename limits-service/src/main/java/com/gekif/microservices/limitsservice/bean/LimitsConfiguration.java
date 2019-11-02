package com.gekif.microservices.limitsservice.bean;

public class LimitsConfiguration {

    private int maximum;
    private int minimum;

    public LimitsConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public LimitsConfiguration() {

    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "LimitsConfiguration{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
