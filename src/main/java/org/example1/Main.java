package org.example1;

public class Main {
    public static void main(String[] args) {
        /*Este patron se puede usar bajo diferentes contextos.
        En este ejemplo uso el patron para cubrir la creación de un objeto por
        Carga diferida (Suponiendo que RealImage es una clase pesada, entonces solo se crea cuando
        se necesita y no desde cuando arranca la aplicación)*/

        Image image = new ProxyImage("imagen.jpg");
        /*Este primer llamado crea el objeto*/
        image.display();
        /*Este segundo llamado obtiene el mismo objeto que ya se creo con el primer llamado*/
        image.display();
    }
}