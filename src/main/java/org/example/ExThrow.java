package org.example;

import java.security.PrivilegedActionException;

public class ExThrow {


    static void ValidarIdade(int idade){
        if (idade <= 18){
            throw new IllegalArgumentException("Idade minima é 18.");

        }
        System.out.println("Acesso liberado.");
    }

    public static void main(String[] args) {
        ValidarIdade(15);



    }
}
