package ru.tokarev.springcourse.genres;

public class RockMusic implements Music {

    private final String[] songs = {"Wind cries Mary", "Back in Black", "Миокард"};

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String getSong() {
        return "Wind cries Mary instance";
    }

    @Override
    public String getName() {
        return "Wind cries Mary";
    }
}
