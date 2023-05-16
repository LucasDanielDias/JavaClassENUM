package Herança.Desafio;

public class Carro {
    int velA = 0;

    protected int acelerar() {
        velA += 10;
        return velA;
    }

    protected int frear() {
        if (velA >= 10) {
            velA -= 10;
            return velA;
        } else if (velA > 0 && velA < 10) {
            velA = 0;
            return velA;
        } else
            return velA;

    }
}

