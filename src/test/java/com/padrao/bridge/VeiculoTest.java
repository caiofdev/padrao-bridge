package com.padrao.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    public void carroComMotorAGasolinaDeveLigarCorretamente() {
        Veiculo carro = new Carro(new MotorGasolina());
        assertEquals("Carro: motor a gasolina ligado", carro.ligar());
    }

    @Test
    public void carroComMotorEletricoDeveLigarCorretamente() {
        Veiculo carro = new Carro(new MotorEletrico());
        assertEquals("Carro: motor elétrico ligado", carro.ligar());
    }

    @Test
    public void caminhaoComMotorDieselDeveLigarCorretamente() {
        Veiculo caminhao = new Caminhao(new MotorDiesel());
        assertEquals("Caminhão: motor a diesel ligado", caminhao.ligar());
    }

    @Test
    public void motoComMotorHibridoDeveLigarCorretamente() {
        Veiculo moto = new Moto(new MotorHibrido());
        assertEquals("Moto: motor híbrido ligado", moto.ligar());
    }

    @Test
    public void mesmoVeiculoDeveAceitarMotoresDiferentesEmTempoDeExecucao() {
        // essência do Bridge: a abstração e a implementação variam de forma independente
        Veiculo carro1 = new Carro(new MotorGasolina());
        Veiculo carro2 = new Carro(new MotorEletrico());

        assertNotEquals(carro1.ligar(), carro2.ligar());
    }

    @Test
    public void mesmoMotorDeveFuncionarEmVeiculosDiferentes() {
        Motor motor = new MotorDiesel();
        Veiculo caminhao = new Caminhao(motor);
        Veiculo carro = new Carro(motor);

        assertTrue(caminhao.ligar().contains("motor a diesel ligado"));
        assertTrue(carro.ligar().contains("motor a diesel ligado"));
    }
}