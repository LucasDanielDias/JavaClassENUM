package Encapsulamento.CasaB;

import Encapsulamento.CasaA.Ana;

public class Julia {
    Ana sogra= new Ana();

    void testeAcesso() {
        //System.out.println(esposa.segredo);
        //System.out.println(mae.facoDentroDeeCAsa);
        //System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.TodosSabem);// por está distante ele só pode pegar o a info TodosSabem
    }
}
