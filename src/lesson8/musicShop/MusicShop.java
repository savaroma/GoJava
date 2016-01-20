package lesson8.musicShop;

import java.util.ArrayList;

public class MusicShop {
    public String name;
    ArrayList<MusicalInstrument> musicalInstrumentsList;

    public MusicShop(String name) {
        this.name = name;
        this.musicalInstrumentsList = new ArrayList<>();
    }

    public void addToShowcase(MusicalInstrument musicalInstrument) {
        musicalInstrumentsList.add(musicalInstrument);
    }

    public void removeFromShowcase(MusicalInstrument musicalInstrument) {
        musicalInstrumentsList
                .stream()
                .filter(instrument -> !musicalInstrument.getClass().getName().equals(instrument.getClass().getName()))
                .forEach(System.out::println);
    }

    public void info(){
        System.out.println("MusicShop \"" + name + "\" sells: ");
        musicalInstrumentsList
                .forEach(System.out::println);
    }
}
