package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

//    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//    @Autowired
//
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
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

//    private String name;
//    private int volume;

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
