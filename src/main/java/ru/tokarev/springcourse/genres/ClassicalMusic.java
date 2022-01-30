package ru.tokarev.springcourse.genres;

public class ClassicalMusic implements Music {

    private final String[] songs = {"Hungarian Rhapsody", "Experience", "Clair de Lune"};

    public void doInitMethod() {
        System.out.println("Initialisation!");
    }

    public void doDestroyMethod() {
        System.out.println("Destruction!");
    }

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody instance";
    }

    @Override
    public String getName() {
        return "Hungarian Rhapsody";
    }
}
