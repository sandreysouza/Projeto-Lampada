import java.util.Scanner;

public class LampadaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<");

        System.out.print("Informe a Cor da lâmpada: ");
        String cor = scanner.nextLine();

        System.out.print("Informe a Marca da lâmpada: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o Modelo da lâmpada: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe a Potência Elétrica da lâmpada (Watts): ");
        int voltagem = scanner.nextInt();

        System.out.print("Informe o Tipo da lâmpada: ");
        scanner.nextLine(); 
        String tipo = scanner.nextLine();

        System.out.print("Informe a Garantia da lâmpada (em meses): ");
        String garantia = scanner.nextLine();

        System.out.print("Informe o Preço da lâmpada – R$: ");
        double preco = scanner.nextDouble();

        
        Lampada lampada = new Lampada(marca, voltagem, tipo, modelo, cor, preco, garantia);

        // Exibição das informações
        System.out.println("\n### INFORMAÇÕES ###");
        System.out.println("COR: " + lampada.getCor());
        System.out.println("MARCA: " + lampada.getMarca());
        System.out.println("MODELO: " + lampada.getModelo());
        System.out.println("WATTS: " + lampada.getPotencia());
        System.out.println("TIPO: " + lampada.getTipo());
        System.out.println("GARANTIA: " + lampada.getGarantia());
        System.out.printf("PREÇO – R$: %.2f%n", lampada.getPreco());
        lampada.mostrarStatus();

        // Loop para ligar e desligar a lâmpada
        int opcao;
        do {
            System.out.print("\nLigar/Desligar lâmpada? 0 – Sair / 1 – Sim / 2 – Não: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                lampada.mudarStatus();
                lampada.mostrarStatus();
            } else if (opcao != 0 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        System.out.println("* Você encerrou o software. *");

        scanner.close();
    }
}