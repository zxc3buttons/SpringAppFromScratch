package ru.tokarev.springcourse;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody instance";
    }

    @Override
    public String getName() {
        return "Hungarian Rhapsody";
    }
}
