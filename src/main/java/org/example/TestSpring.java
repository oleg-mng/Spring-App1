package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        RapMusic rapMusic = context.getBean("musicBeanRap", RapMusic.class);
        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassical", ClassicalMusic.class);

        List<Music> list = new ArrayList<>();
        list.add(rapMusic);
        list.add(rockMusic);
        list.add(classicalMusic);
        musicPlayer.setMusicList(list);
        musicPlayer.playMusic(list);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
