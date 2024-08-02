package org.example1;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Cargando " + filename);
    }

    @Override
    public void display() {
        System.out.println("Mostrando " + filename);
    }
}
