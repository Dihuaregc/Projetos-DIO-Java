public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        int controle = 1;

        if (controle == 1) {
            smartTv.ligar();
            smartTv.mudarCanal(11);
            smartTv.mudarVolume(57);

        }
        else {
            smartTv.desligar();
        }
        System.out.println ("Tv Ligada: " + smartTv.ligada);
        System.out.println ("Tv Canal: " + smartTv.canal);
        System.out.println ("Tv Volume: " + smartTv.volume);
    }
}
