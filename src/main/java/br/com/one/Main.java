package br.com.one;

class Principal {
    public static void main() {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
        System.out.println(novoEndereco);

    }
}