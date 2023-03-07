public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Ruiz","Bogota");
        Estudiante estudidante1 = new Estudiante("Esteban","Tocancipa","Ing sistemas",9);
        Profesor profesor1 = new Profesor("Andres","Tocancipa","Programacion","Web");

        System.out.println(estudidante1.toString());
        System.out.println(profesor1.toString());
        System.out.println(persona1.toString());

        Vehiculo vehiculo1 = new Vehiculo("Pollito","Rojo",2,"2021");
        Bicicleta bicicleta1 = new Bicicleta("emove","Blanca",2,"2019","Montaña",50);
        Coche coche1 = new Coche("Logan","Gris",4,"2015",0,4);

        System.out.println(bicicleta1.toString());
        System.out.println(coche1.toString());



    }
}