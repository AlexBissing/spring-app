package ru.bissing.springpractice;

public class CountryMusic implements Music {
    private CountryMusic() {}

    public static CountryMusic getCountryMusic() {
        return new CountryMusic();
    }

    public void doInitMethod() {
        System.out.println("Initialization");
    }

    public void doDestroyMethod() {
        System.out.println("Destroy");
    }
    @Override
    public String getSong() {
        return "Black Creek";
    }

}
