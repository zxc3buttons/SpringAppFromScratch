package ru.tokarev.springcourse;

import org.springframework.stereotype.Component;

@Component("rapMusicBean")
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
