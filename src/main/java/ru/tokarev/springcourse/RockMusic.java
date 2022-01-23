package ru.tokarev.springcourse;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
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
