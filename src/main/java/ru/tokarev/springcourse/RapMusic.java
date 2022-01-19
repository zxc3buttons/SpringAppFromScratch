package ru.tokarev.springcourse;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "No Friends In The Industry instance";
    }

    @Override
    public String getName() {
        return "No Friends In The Industry";
    }
}
