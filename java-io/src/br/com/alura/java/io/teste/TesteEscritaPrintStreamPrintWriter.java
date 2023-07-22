package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo

//        OutputStream fos = new FileOutputStream("textoteste2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        PrintStream ps = new PrintStream(new File("textoteste2.txt"));

        PrintWriter ps = new PrintWriter("Textoteste2.txt", "UTF-8");

        ps.println("gdjgksdjfbkdygfuasfkshdbfjshdhfklsdnfkhsbdjfhsadkfjnsdkfhbsjdhfbjv");
        ps.println();
        ps.println("afafsdfhbsjhgjdkfngkdjfngkdjfngkj");

        ps.close();
    }
}