public class smartTv {
    boolean ligada= false;
    int canal= 1;
    int volume= 25;

    //func ligar/ desligar
    public void ligar(){
        ligada= true;
    }
    public void desligar(){
        ligada= false;
    }

    //func volume aumentar/ diminuir
    public void aumentarVol(){
        volume++;
    }
    public void diminuirVol(){
        volume--;
    }

    //func aumentar ou diminuir canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal= novoCanal;
    }
}

