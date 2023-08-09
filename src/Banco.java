public class Banco {
    public static void main(String[] args) {
        Conta bruna = new Conta("Bruna", "CP", 01, 50.00f, false);
        bruna.pagarMensalidade(0);
        bruna.status();
        
        Conta ernesto = new Conta("Ernesto", "CC", 02, 100.00f, false);
        ernesto.pagarMensalidade(0);
        ernesto.status();
    }   

}