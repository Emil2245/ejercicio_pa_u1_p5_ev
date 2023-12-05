package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Matricula;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IPropietarioService {
    void eliminar(String id);
    void guardar(Propietario propietario);
    void actualizar(Propietario propietario);
    List<Propietario> listar();

}
