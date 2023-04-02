public class Contribuinte {
    private String nome;
    protected double rendaBrutaAnual;
    protected double rendaLiquidaAnual;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRendaBrutaAnual(double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    public double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public double getRendaLiquidaAnual() {
        return rendaLiquidaAnual;
    }

    public double calcularRendaLiquida(double abatinento1, double abatinento2) {

        rendaLiquidaAnual = rendaBrutaAnual - (abatinento1 + abatinento2);
        return rendaLiquidaAnual;
    }

}
