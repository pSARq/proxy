package org.example1;

/*Esta es la clase que se encarga de aplicar el patrón de diseño*/
public class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /*Aquí se aplica el caso de Carga diferida*/
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
