package com.anahuac.desarrollo.comportamiento.observer;
import java.util.*;

public class StatisticsDisplay implements  Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.removeObserver(this);
    }

    public void update (float temp, float humidity, float preassure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum/numReadings) + "/" + maxTemp + "/" +  minTemp);
    }
}
