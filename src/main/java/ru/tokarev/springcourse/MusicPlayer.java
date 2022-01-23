package ru.tokarev.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {

    private Music music;
    private List<Music> musicList;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public Music getMusic(){
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music: musicList)
            System.out.println(
                    "Playing: " +
                    music.getSong() +
                    "\nName: " +
                    music.getName() +
                    "\nVolume: " +
                    this.getVolume() + "\n"
            );
    }
}
