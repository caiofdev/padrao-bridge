package com.padrao.bridge;

public class Carro extends Veiculo {

    public Carro(Motor motor) {
        super(motor);
    }

    public String descricao() {
        return "Carro";
    }
}