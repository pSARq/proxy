package org.example4;

public class Main {
    public static void main(String[] args) {
        /*No permite ver el objeto por falta de permisos*/
        Document document = new MonitoringProxy("documento.pdf");
        /*Marcan horas de consulta diferentes*/
        document.display();
        document.display();
    }
}
