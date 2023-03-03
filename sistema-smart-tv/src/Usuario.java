import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        
        //criando o objeto smartTv
        SmartTv smartTv = new SmartTv();
        // classe para solcitar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // mostrando o estado antes das alterações
        System.out.println("a TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // ligando a tv
        smartTv.ligar();
        
        //solicitando ao usuario que digite o canal
        System.out.println("Digite o canal desejado ");
        int canalDesejado = scanner.nextInt();
        
        // fazendo algumas mudanças através dos métodos
        smartTv.mudarCanal(canalDesejado);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        // mostrando o estado depois das alterações
        System.out.println("a TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        scanner.close();
    }
}
