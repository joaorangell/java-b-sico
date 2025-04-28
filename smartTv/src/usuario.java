public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        /* Teste incial= OK

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        */

        /*Teste de parâmetros de ligar/desligar= ok

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        */

        smartTv.aumentarVol();
        System.out.println("Qual o volume?" + smartTv.volume);
        


    }
}
