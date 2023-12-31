public class Conta {
    private String nomeCliente;
    protected String tipoConta;
    public int numeroConta;
    private float saldoConta;
    private boolean statusConta;

//------------CONSTRUTOR------------\\

    public Conta(String nome, String tipo, int numero){
        this.nomeCliente = nome;
        this.tipoConta = tipo;
        this.numeroConta = numero;
        setSaldoConta(0);
        setStatusConta(false);
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
    public boolean isStatusConta(){
        return this.statusConta;
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
        if (getTipoConta().equals("CC")){
            this.fazerDeposito(50f);
        } else if (getTipoConta().equals("CP")){
            this.fazerDeposito(150f);
        }
    }

    public void fecharConta(){
        if ((getSaldoConta() != 0f) || (getSaldoConta() < 0)) {
            System.out.println("Não foi possível fechar conta.");
        } else {
           setStatusConta(false); 
           System.out.println("Conta fechada :(");
        }
    }

    public void fazerDeposito(float deposito){
        if (isStatusConta()){
            this.saldoConta = (getSaldoConta() + deposito);
        } else {
            System.out.println("Conta fechada. Não foi possível depositar.");
        }

    }

    public void sacarConta(float saque){
        if (!isStatusConta()){ 
            System.out.println("Conta fechada. Não foi possível sacar.");
        } else if ((getSaldoConta() - saque) >= 0){
            this.saldoConta = (getSaldoConta() - saque);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void pagarMensalidade(int mensalidade){
        if (getTipoConta().equals("CC")){
            mensalidade = 12;
            this.saldoConta = getSaldoConta() - mensalidade;
        } else if (getTipoConta().equals("CP")){
            mensalidade = 20;
             this.saldoConta = getSaldoConta() - mensalidade;
        }

        }
    
//------------STATUS------------\\

    public void status(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Tipo: " + getTipoConta());
        System.out.println("Numero: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldoConta());
        System.out.println("Status: " + this.statusConta);
    }

}
