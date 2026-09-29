package com.padrao.bridge;

public class Moto extends Veiculo {

    public Moto(Motor motor) {
        super(motor);
    }

    public String descricao() {
        return "Moto";
    }
}