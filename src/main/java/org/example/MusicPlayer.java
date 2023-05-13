package org.example;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music){
        this.music = music;
    }
}
