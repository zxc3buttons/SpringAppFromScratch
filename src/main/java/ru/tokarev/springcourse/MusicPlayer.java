package ru.tokarev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {


    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;
    private int volume;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(MusicGenre musicGenre) {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (musicGenre) {

            case ROCK:
                System.out.println("Now playing rock music: \n");
                System.out.println(rockMusic.getSongs()[randomNumber]);
                break;

            case CLASSICAL:
                System.out.println("Now playing classical music: \n");
                System.out.println(classicalMusic.getSongs()[randomNumber]);
                break;
        }
    }
}
