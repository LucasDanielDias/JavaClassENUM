package Herança.Desafio;

public class Carro {
    int velA = 0;

    public int acelerar() {
        velA += 10;
        return velA;
    }

    public int frear() {
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

