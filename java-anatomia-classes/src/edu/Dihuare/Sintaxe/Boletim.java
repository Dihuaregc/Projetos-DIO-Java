package edu.Dihuare.Sintaxe;

public class Boletim {

    public static void main(String[] args) {
        
        double nota1 = 5.5;
        double nota2 = 9.5;
        double media = (nota1 + nota2) / 2;

        System.out.println(media);
        
        if (media > 6)
            System.out.println("APROVADO");
        else if (media == 6)
            System.out.println("RECUPERAÇÃO");
        else
            System.out.println("REPROVADO");
        
        double somaNotas = (nota1 + nota2);
        System.out.println(somaNotas);
        System.out.println(nota1 + nota2);        
        
    }
    
}
