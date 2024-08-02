package org.example4;

public class RealDocument implements Document {
    private final String filename;

    public RealDocument(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Cargando documento: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Mostrando documento: " + filename);
    }
}
