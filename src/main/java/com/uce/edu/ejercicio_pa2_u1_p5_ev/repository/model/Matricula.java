package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class Matricula {

    private Vehiculo vehiculo;
    private Propietario propietario;
    private BigDecimal valorMatricula;
    private LocalDate fechaMatricula;

    @Override
    public String toString() {
        return "Matricula{" +
                "vehiculo=" + vehiculo +
                ", propietario=" + propietario +
                ", valorMatricula=" + valorMatricula +
                ", fechaMatricula=" + fechaMatricula +
                '}';
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public BigDecimal getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(BigDecimal valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
}
