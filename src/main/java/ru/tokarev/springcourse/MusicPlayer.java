package ru.tokarev.springcourse;

import org.springframework.beans.factory.annotation.Value;
import ru.tokarev.springcourse.genres.Music;

import java.util.List;
import java.util.Random;

public class MusicPlayer {


    private final List<Music> musicList;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {

        Random random = new Random();
        int randomNumber = random.nextInt(musicList.size());

        System.out.println(musicList.get(randomNumber).getName() + " with volume " + volume);
    }
}
