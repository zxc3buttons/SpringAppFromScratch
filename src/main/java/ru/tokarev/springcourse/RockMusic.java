package ru.tokarev.springcourse;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary instance";
    }

    @Override
    public String getName() {
        return "Wind cries Mary";
    }
}
