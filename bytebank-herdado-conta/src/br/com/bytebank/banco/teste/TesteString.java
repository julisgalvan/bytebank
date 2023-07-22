package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; //object literal
        //String outro = new String("Alura");

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }



        String vazio = "      Alura      ";
        String outroVazio = vazio.trim();
        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);

        //String sub = nome.substring(1);
        //System.out.println(sub);

        //int pos = nome.lastIndexOf("ur");
        //System.out.println(pos);

        //char c = nome.charAt(0);
        //System.out.println(c);

        //char C = 'A';
        //char d = 'a';
        //String outra = nome.replace("A", "a");

        //String outra = nome.toUpperCase();

        nome.toLowerCase();

        //System.out.println(nome);
        //System.out.println(outra);
    }

}
