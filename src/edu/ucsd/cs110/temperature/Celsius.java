package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    //(0°C × 9/5) + 32 = 32°F
    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(((this.getValue()*9)/5)+32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}