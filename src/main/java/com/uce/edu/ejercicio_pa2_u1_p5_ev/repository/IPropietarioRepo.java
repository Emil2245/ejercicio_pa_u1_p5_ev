package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IPropietarioRepo {
    void eliminar(String id);
    void insertar(Propietario propietario);
    void actualizar(Propietario propietario);
    List<Propietario> listar();

}
