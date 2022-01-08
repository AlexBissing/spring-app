package ru.bissing.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockBean", RockMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("countryBean", CountryMusic.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();
        context.close();
    }
}
