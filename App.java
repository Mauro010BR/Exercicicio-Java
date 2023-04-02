public class App {
    public static void main(String[] args) throws Exception {
        Fisico f = new Fisico();

        f.setNome("Mauro");
        f.setRendaBrutaAnual(25000);
        f.setCpf("111-222-333-44");
        f.setGastosEducacao(3800);
        f.setGastosSaude(4500);

        f.calcularRendaLiquida(f.getGastosEducacao(), f.getGastosSaude());
        double aux = f.calcularImpostoDeRenda();

        System.out.println("Nome do cliente: " + f.getNome());
        System.out.println("CPF do cliente: " + f.getCpf());
        System.out.println("Renda liquida do Cliente: " + f.getRendaLiquidaAnual());
        System.out.println("IRPF....: " + aux);
    }
}
