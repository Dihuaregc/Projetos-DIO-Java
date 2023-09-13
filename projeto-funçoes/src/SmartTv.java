public class SmartTv {

    boolean ligada = false;
    int canal = 0;
    int volume = 0;

public void ligar() {
    ligada = true;
    canal = 1;
    volume = 37;
}
public void desligar() {
    ligada = false;
}
public void mudarCanal (int novoCanal) {
    canal = novoCanal;
}
public void mudarVolume (int novoVolume) {
    volume = novoVolume;
}
}