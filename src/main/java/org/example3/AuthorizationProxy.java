package org.example3;

public class AuthorizationProxy implements Document {
    private RealDocument realDocument;
    private final String filename;
    private final String userRole;

    public AuthorizationProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    /*Este ejemplo es un proxy de tipo de carga diferida con un sistema de autorización*/
    @Override
    public void display() {
        if (hasAccess()) {
            if (realDocument == null) {
                realDocument = new RealDocument(filename);
            }
            realDocument.display();
        } else {
            System.out.println("Acceso denegado: No tienes permisos para ver este documento");
        }
    }

    //Simula una verificación de permisos basada en el rol del usuario
    private boolean hasAccess() {
        return "ADMIN".equals(userRole);
    }
}
