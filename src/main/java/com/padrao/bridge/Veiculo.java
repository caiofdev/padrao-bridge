package com.padrao.bridge;

public abstract class Veiculo {

    protected Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public String ligar() {
        return descricao() + ": " + motor.ligar();
    }

    public abstract String descricao();
}