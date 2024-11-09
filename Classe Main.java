package concessionaria.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB 500", 2019, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2022, 25.5);

        System.out.println("Informações do Carro:");
        carro.exibirInfo();

        System.out.println("\nInformações da Moto:");
        moto.exibirInfo();

        System.out.println("\nInformações do Caminhão:");
        caminhao.exibirInfo();
    }
}
