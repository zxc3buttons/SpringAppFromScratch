package ru.tokarev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.setVolume(20);

        firstMusicPlayer.playMusic(MusicGenre.ROCK);


        context.close();
    }
}
