package ru.tokarev.springcourse;

public class ClassicalMusic implements Music {

    public void doInitMethod() {
        System.out.println("Initialisation!");
    }

    public void doDestroyMethod() {
        System.out.println("Destruction!");
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
