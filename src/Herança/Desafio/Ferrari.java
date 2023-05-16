package Herança.Desafio;

public class Ferrari extends Carro{
    public int acelerar(){
        velA += 30;
        return velA;
    }
    public int frear(){
        velA-=30;
        return velA;
    }


}
