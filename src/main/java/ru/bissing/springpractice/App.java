package ru.bissing.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music countryMusic = context.getBean("countryBean", Music.class);
        Music rockMusic = context.getBean("rockBean", Music.class);

        MusicPlayer countryMusicPlayer = new MusicPlayer(countryMusic);
        countryMusicPlayer.playMusic();
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        rockMusicPlayer.playMusic();
        context.close();
    }
}
