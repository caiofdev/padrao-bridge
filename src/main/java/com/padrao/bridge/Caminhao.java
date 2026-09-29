package com.padrao.bridge;

public class Caminhao extends Veiculo {

    public Caminhao(Motor motor) {
        super(motor);
    }

    public String descricao() {
        return "Caminhão";
    }
}