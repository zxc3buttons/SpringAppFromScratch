package ru.tokarev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        firstMusicPlayer.setVolume(20);

        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusic();

        context.close();
    }
}
