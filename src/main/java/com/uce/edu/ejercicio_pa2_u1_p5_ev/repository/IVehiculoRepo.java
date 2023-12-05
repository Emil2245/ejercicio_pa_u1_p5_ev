package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IVehiculoRepo {
    Vehiculo seleccionar(String placa);

    void eliminar(String placa);

    void insertar(Vehiculo matricula);

    void actualizar(Vehiculo matricula);
    List<Vehiculo> listar();

}
