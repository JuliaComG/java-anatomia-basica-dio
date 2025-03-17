package edu.giulia.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Giulia";
        String segundoNome = "Armanelli";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Seu nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
