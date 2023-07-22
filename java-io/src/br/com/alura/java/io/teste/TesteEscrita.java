package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo

        OutputStream fos = new FileOutputStream("textoteste2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("A exceção \"java.io.FileNotFoundException: lorem.txt (No such file or directory)\" ocorre quando o programa não consegue encontrar o arquivo especificado. Isso pode ser devido a vários motivos no IntelliJ ou em qualquer outro ambiente de desenvolvimento. Aqui estão algumas possíveis causas e soluções:\n");
        bw.newLine();
        bw.newLine();
        bw.write("afafsdfhbsjhgjdkfngkdjfngkdjfngkj");

        bw.close();
    }
}