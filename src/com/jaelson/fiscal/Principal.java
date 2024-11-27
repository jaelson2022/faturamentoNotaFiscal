package com.jaelson.fiscal;
import com.jaelson.fiscal.NotaFiscalProduto;
import com.jaelson.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        System.out.println(nfBolaFutebol.calcularImposto());
        System.out.println(nfReparoMotor.calcularImposto());

    }
}
