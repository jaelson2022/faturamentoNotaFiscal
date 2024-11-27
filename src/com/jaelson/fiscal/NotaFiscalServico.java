package com.jaelson.fiscal;

public class NotaFiscalServico extends NotaFiscal{

    private boolean intermunicipal;

    public NotaFiscalServico(String descrcao, double valorTotal, boolean intermunicipal){
        super(descrcao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }
}
