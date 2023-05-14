package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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


//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
