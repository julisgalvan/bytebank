//Gerente herda tudo o que um funcionario tem
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonficacao do EDITOR DE VIDEO");
        return 150;
    }


}
