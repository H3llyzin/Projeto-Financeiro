public class ModeloConta {

    private String nome,email,tel,cpf;
    private double saldo,saque,deposito;

    public ModeloConta(String nome,String email, String tel,String cpf){
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.cpf = cpf;
    }

    public ModeloConta(double saldo, double saque, double deposito){
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
    }

    public double exibirSaldo(){
        System.out.println("Valor atual da conta: " + saldo);
        return saldo;
    }

    public double saque(){
        System.out.println("Saque efetuado: " + saque);
        return (saque -= saldo);
    }

    public double deposito(){
        System.out.println("Deposito realizado: " + deposito);
        return (deposito += saldo);
    }

    public String exibirDadosConta(){
        System.out.println("Dados da conta do titular\n");
        System.out.println("Nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("cpf: " + cpf);
        System.out.println("telefone: " + tel);
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}
