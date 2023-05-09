package Herança;

public class Jogador {
    int vida = 100;
    int x;
    int y;
    Jogador(){
        this(0,0);
    }
    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    Boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y );

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        } else if (deltaY == 0 && deltaX == 1) {
            oponente.vida -= 10;
            return true;
        }else
            return  false;
    }
   Boolean andar(Direcao direcao){
       if(direcao == Direcao.NORTE){
           y++;
       } else if (direcao == Direcao.SUL) {
           y--;
       } else if (direcao == Direcao.LESTE) {
           x++;
       } else if (direcao == Direcao.OESTE) {
           x--;
       }
       return true;
    }
}
