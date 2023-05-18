package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//@Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    List<Music> musicList = new ArrayList<>();

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public void playMusic(List<Music> musicList) {
//        for (Music m : musicList) {
//            System.out.println(m.getSong());
//        }
//    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    public MusicPlayer() {
//
//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

}
