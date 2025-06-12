class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private String modelo;
    private int portas;

    public Carro(String marca, int ano, String modelo, int portas) {
        super(marca, ano);
        this.modelo = modelo;
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPortas() {
        return portas;
    }

    public void exibirDetalhes() {
        exibirDados();
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + portas);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2022, "Corolla", 4);
        carro1.exibirDetalhes();
    }
}

