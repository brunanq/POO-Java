public class Banco {
    public static void main(String[] args) {
        Conta bruna = new Conta("Bruna", "CP", 01);
        bruna.status();
        
        Conta ernesto = new Conta("Ernesto", "CC", 02);
        ernesto.status();
    }   

}