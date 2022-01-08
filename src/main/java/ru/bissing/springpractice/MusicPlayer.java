package ru.bissing.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private CountryMusic countryMusic;
    private RockMusic rockMusic;

    public MusicPlayer(CountryMusic countryMusic, RockMusic rockMusic) {
        this.countryMusic = countryMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + countryMusic.getSong();
    }
}
