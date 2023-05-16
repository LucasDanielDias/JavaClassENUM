package Encapsulamento.CasaB;

import Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcesso() {
        //System.out.println(esposa.segredo); não funciona por ser privado
        //System.out.println(mae.facoDentroDeeCAsa);
        System.out.println(formaDeFalar);//não pode usar o mae. pois ele recebe o atributo via herança não por instancia
        System.out.println(mae.TodosSabem);
    }
}