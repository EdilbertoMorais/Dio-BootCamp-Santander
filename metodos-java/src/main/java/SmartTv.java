public class SmartTv {


    //Variável de Classe
    int volume = 25;
    //Variável de Classe
    boolean ligada = false;
    //Variável de Classe
    int canal = 1;
    //As variáveis de classe acima, podem ser acessadas em toda a Classe SmartTv, por todos os métodos

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarDeCanal(int canalSelecionado) {
        // Variável de método (canalSelecionado)
        canal = canalSelecionado;
        // A variável local de método (canalSelecionado), só pode ser acessada dentro do escopo deste método que esta definido dentro das {}.
    }

}
