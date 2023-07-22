//Gerente herda tudo o que um funcionario tem
public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonficacao do DESIGNER");
        return 200;
    }


}
