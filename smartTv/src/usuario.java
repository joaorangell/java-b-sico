public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        /* Teste incial= OK

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        */

        /*Teste de ligar/desligar= ok

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        */

        /* Teste de aumentar/ diminuir canal= ok
        smartTv.aumentarVol();
        System.out.println("Qual o volume?" + smartTv.volume);

        smartTv.diminuirVol();
        System.out.println("Qual o volume?" + smartTv.volume);
        */

        smartTv.aumentarCanal();
        System.out.println("Qual o canal?" + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Qual o canal?" + smartTv.canal);

        smartTv.mudarCanal(14);
        System.out.println("Qual o canal? "+ smartTv.canal);


    }
}
