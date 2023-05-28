package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);




//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Music music = context.getBean("rockMusic", Music.class);
//        Music classicmusic = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer classicalmusicPlayer = new MusicPlayer(classicmusic);
//
//        musicPlayer.playMusic();
//        classicalmusicPlayer.playMusic();



//        RapMusic rapMusic = context.getBean("musicBeanRap", RapMusic.class);
//        System.out.println(rapMusic.getSong());


//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean right = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(right);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(7);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        musicPlayer.playMusic();

//        RapMusic rapMusic = context.getBean("musicBeanRap", RapMusic.class);
//        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
//        ClassicalMusic classicalMusic = context.getBean("musicBeanClassical", ClassicalMusic.class);
//
//        List<Music> list = new ArrayList<>();
//        list.add(rapMusic);
//        list.add(rockMusic);
//        list.add(classicalMusic);
//        musicPlayer.setMusicList(list);
//        musicPlayer.playMusic(list);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
