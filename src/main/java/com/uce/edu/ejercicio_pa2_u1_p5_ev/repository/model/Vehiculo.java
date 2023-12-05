package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Vehiculo {
    private String marca;
    private String placa;
    private String tipo;
    private BigDecimal precio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        if (!marca.equals(vehiculo.marca)) return false;
        if (!placa.equals(vehiculo.placa)) return false;
        if (!tipo.equals(vehiculo.tipo)) return false;
        return precio.equals(vehiculo.precio);
    }

    @Override
    public int hashCode() {
        int result = marca.hashCode();
        result = 31 * result + placa.hashCode();
        result = 31 * result + tipo.hashCode();
        result = 31 * result + precio.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
