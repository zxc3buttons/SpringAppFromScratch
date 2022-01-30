package ru.tokarev.springcourse.genres;

public class RapMusic implements Music {

    private String[] songs = {"Rap God", "No Friends In The Industry", "В темноте"};

    @Override
    public String getSong() {
        return "No Friends In The Industry instance";
    }

    @Override
    public String getName() {
        return "No Friends In The Industry";
    }

    @Override
    public String[] getSongs() {
        return new String[0];
    }
}
