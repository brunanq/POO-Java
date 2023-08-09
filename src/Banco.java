public class Banco {
    public static void main(String[] args) {
        Conta bruna = new Conta("Bruna", "CP", 01, 0, false);
        bruna.status();
        
        Conta ernesto = new Conta("Ernesto", "CC", 02, 0, false);
        ernesto.status();
        ernesto.sacarConta(100f);
        ernesto.fecharConta();
        ernesto.status();
    }   

}