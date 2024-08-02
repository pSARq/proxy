package org.example3;

public class Main {
    public static void main(String[] args) {
        /*No permite ver el objeto por falta de permisos*/
        Document document = new AuthorizationProxy("documento.pdf", "USER");
        document.display();

        /*Le permite ver el documento*/
        document = new AuthorizationProxy("documento.pdf", "ADMIN");
        document.display();
    }
}
