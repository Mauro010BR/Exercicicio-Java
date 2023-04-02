public class Fisico extends Contribuinte {
    private String cpf;
    private double gastosSaude;
    private double gastosEducacao;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public double calcularImpostoDeRenda() {
        double aux = 0;

        if (rendaLiquidaAnual < 10000) {
            aux = 0;
        }
        if (rendaLiquidaAnual >= 10000 && rendaLiquidaAnual <= 20000) {
            aux = rendaLiquidaAnual * 0.1 - 1000;
        }
        if (rendaLiquidaAnual > 20000) {
            aux = rendaLiquidaAnual * 0.25 - 4000;
        }
        return aux;
    }
}
