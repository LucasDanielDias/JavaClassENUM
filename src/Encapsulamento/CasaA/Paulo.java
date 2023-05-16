package Encapsulamento.CasaA;

public class Paulo {
        Ana esposa = new Ana();
    void testeAcessos(){

        //System.out.println(esposa.segredo); não funciona por ser privado
        System.out.println(esposa.facoDentroDeeCAsa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.TodosSabem);
    }
}
