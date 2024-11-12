public class Lampada {
    private String marca;
    private int potencia;
    private String tipo;
    private String modelo;
    private String cor;
    private double preco;
    private String garantia;
    private boolean ligada;

    
    public Lampada(String marca, int potencia, String tipo, String modelo, 
                   String cor, double preco, String garantia) {
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garantia = garantia;
        this.ligada = false;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void mostrarStatus() {
        if (ligada) {
            System.out.println("# Lâmpada Ligada #");
        } else {
            System.out.println("# Lâmpada Desligada #");
        }
    }

    public void mudarStatus() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}