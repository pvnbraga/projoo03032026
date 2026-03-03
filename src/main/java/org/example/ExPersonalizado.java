package org.example;

public class ExPersonalizado {

    static void sacar(double saldo, double valor)throws
        SaldoInsuficienteExcepition{
            if (valor > saldo){
                throw new SaldoInsuficienteExcepition("Saldo Insuficiente. Saldo:" + saldo);
            }
        }


    public static void main(String[] args) {
        try{
            sacar(100, 500);
        } catch (SaldoInsuficienteExcepition e) {
            System.out.println("Ero: " + e.getMessage());
        }
    }

}
