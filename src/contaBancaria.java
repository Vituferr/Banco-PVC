public class contaBancaria {
    private String numeroConta; // DEFINIDO O TIPO DO ATRIBUTO NUMEROCONTA
    private double saldo; // DEFINIDO O TIPO DO ATRIBUDO SALDO
    private cliente titular;  // É PRECISO CHAMAR O OBJETO TITULAR DO CONSTRUTOR "CLIENTE" DA CLASSE CLIENTE.

    contaBancaria(String numeroConta, cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println(" Deposito de R$ " + valor + " realizado com sucesso !");
        } else {
            System.out.println("Ocorreu um erro com o seu deposito, verifique os valores novamente.");
        }
    }

    public void sacar(double valor) {
       if(valor > 0){
           saldo -= valor;
           System.out.println("Saque de R$ " + valor + " saiu da conta");
       } else {
           System.out.println("Você não tem dinheiro suficiente ou ocorreu um erro no nosso sistema");
       }
    }

    public double getSaldo() { return saldo; }

    public String getNumeroConta() { return numeroConta; }

    public cliente getTitular() { return titular; }

    public void exibirInfos(){
        System.out.println("Conta: " + numeroConta );
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo );
    }
}

