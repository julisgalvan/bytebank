package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta.
 *
 * @author Juliana Galvan
 */
public abstract class Conta {
        protected double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
            Conta.total ++;
            //System.out.println("O total de contas é " + modelo.Conta.total);
            this.agencia = agencia;
            this.numero = numero;
            //this.saldo = 100;
            //System.out.println("estou criando uma conta " + this.numero);

        }

        public abstract void deposita(double valor);


    /**
     * Valor precis ser maior do que o saldo.
     * @param valor
     * @throws SaldoInsuficenteException
     */
    public void saca(double valor) throws SaldoInsuficenteException{
                if (this.saldo < valor) {
                    throw new SaldoInsuficenteException("Saldo: " + this.saldo + ", valor: " + valor);
                }
            this.saldo -= valor;
        }

        public void transfere(double valor, Conta destino) throws SaldoInsuficenteException {
                this.saca(valor);
                        destino.deposita(valor);
        }

               public double getsaldo() {

                return this.saldo;
               }

               public int getNumero() {
                return this.numero;
               }

               public void setNumero(int numero) {
                if(numero <= 0) {
                    System.out.println("não pode valor menor ou igual a 0");
                    return;
                }
                this.numero = numero;

               }

                public int getAgencia() {
                    return agencia;
                }

                public void setAgencia(int agencia) {
                    if(agencia <= 0) {
                        System.out.println("não pode valor menor ou igual a 0");
                        return;
                    }
                    this.agencia = agencia;
                }

                public void setTitular(Cliente titular) {
                    this.titular = titular;
                }

                public Cliente getTitular() {
                    return titular;
                }

                public static int getTotal() {
                    return Conta.total;
                }

                @Override
                public boolean equals (Object ref) {

                    Conta outra = (Conta) ref;

                    if(this.agencia != outra.agencia) {
                        return false;
                    }

                    if(this.numero != outra.numero) {
                        return false;
                    }

                    return true;
                }

                @Override
                public String toString() {
                    return "Número: " + this.numero + ", Agência: " + this.agencia;
                }
}


