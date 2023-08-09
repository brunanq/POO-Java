public class Conta {
    private String nomeCliente;
    protected String tipoConta;
    public int numeroConta;
    private float saldoConta;
    private boolean statusConta;

//------------CONSTRUTOR------------\\

    public Conta(String nome, String tipo, int numero, float saldo, boolean status){
        this.nomeCliente = nome;
        this.tipoConta = tipo;
        this.numeroConta = numero;
        this.saldoConta = saldo;
        this.statusConta = status; 
        this.abrirConta();
    }

//------------GET/SET------------\\

    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public float getSaldoConta() {
        return this.saldoConta;
    }
    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }
    public void setTipoConta(String tipo) {
        this.tipoConta = tipo;
    }
    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }
    public void setSaldoConta(float saldo) {
        this.saldoConta = saldo;
    }
    public void setStatusConta(boolean status) {
        this.statusConta = status;
    }

    //------------METODOS------------\\

    public void abrirConta(){
        setStatusConta(true);
        if (this.tipoConta.equals("CC")){
            this.fazerDeposito(50f);
        } else if (this.tipoConta.equals("CP")){
            this.fazerDeposito(150f);
        }
    }

    public void fecharConta(){
        if ((this.saldoConta != 0f) || (this.saldoConta < 0)) {
            System.out.println("Não foi possível fechar conta.");
        } else {
           this.statusConta = false; 
           System.out.println("Conta fechada :(");
        }
    }

    public float fazerDeposito(float deposito){
        this.saldoConta = (this.saldoConta + deposito);
        return this.saldoConta;
    }

    public float sacarConta(float saque){
        this.saldoConta = (this.saldoConta - saque);
        return this.saldoConta;
    }

    public float pagarMensalidade(int mensalidade){
        if (this.tipoConta.equals("CC")){
            mensalidade = 12;
            this.saldoConta = this.saldoConta - mensalidade;
        } else if (this.tipoConta.equals("CP")){
            mensalidade = 20;
             this.saldoConta = this.saldoConta - mensalidade;
        }
        return this.saldoConta;
        }
    
//------------STATUS------------\\

    public void status(){
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Tipo: " + this.tipoConta);
        System.out.println("Numero: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldoConta);
        System.out.println("Status: " + this.statusConta);
    }

}
