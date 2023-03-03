public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() { // liga a TV
        ligada = true;
    }

    public void desligar() { // desliga a TV
        ligada = false;
    }

    public void aumentarVolume() { // aumentar o volume em +1 e mostra na tela
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume() { // diminui o volume em -1 e mostra na tela
        volume--;
        System.out.println("Volume diminuido para " + volume);
    }

    public void mudarCanal(int novoCanal) { // muda o canal para o escolhido
        canal = novoCanal;
    }

    public void aumentarCanal() { // muda para o proximo canal
        canal++;
    }

    public void diminuirCanal() { // volta para o canal anterior
        canal--;
    }
}
