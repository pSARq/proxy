package org.example4;

public class MonitoringProxy implements Document {
    private RealDocument realDocument;
    private final String filename;

    public MonitoringProxy(String filename) {
        this.filename = filename;
    }

    /*Este ejemplo es un proxy de tipo de carga diferida con un sistema de monitoreo*/
    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(filename);
        }
        realDocument.display();
        logAccessTime(System.currentTimeMillis());
    }

    /*Simula un monitoreo de consulta*/
    private void logAccessTime(long currentTimeMillis) {
        System.out.println("Documento consultado a las " + currentTimeMillis + " milisegundos");
    }
}
