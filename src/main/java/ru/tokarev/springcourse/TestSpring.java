package ru.tokarev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.tokarev.springcourse.config.SpringConfig;

import java.util.Arrays;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.setVolume(20);

        firstMusicPlayer.playMusic();

        context.close();
    }
}
