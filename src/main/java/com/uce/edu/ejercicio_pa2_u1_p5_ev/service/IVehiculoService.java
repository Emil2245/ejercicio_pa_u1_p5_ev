package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    Vehiculo buscar(String placa);

    void eliminar(String placa);

    void guardar(Vehiculo matricula);

    void actualizar(Vehiculo matricula);
    List<Vehiculo> listar();

}
