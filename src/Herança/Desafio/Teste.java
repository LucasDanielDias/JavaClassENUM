package Herança.Desafio;

public class Teste {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        Ferrari c2 = new Ferrari();
        c1.acelerar();
        System.out.println("Civic "+c1.velA);
        c1.acelerar();
        System.out.println("CIVIC "+c1.velA);
        c1.acelerar();
        System.out.println("civic "+c1.velA);
        c2.acelerar();
        c2.acelerar();
        System.out.println("Ferrari "+c2.velA);
        c2.frear();
        System.out.println("Ferrari "+c2.velA);
    }
}
