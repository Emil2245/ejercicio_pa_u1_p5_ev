package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Matricula;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IMatriculaService {
    Matricula buscar(Vehiculo vehiculo);

    void eliminar(Vehiculo vehiculo);

    void guardar(Matricula matricula);

    void actualizar(Matricula matricula);
    List<Matricula> listar();
    void registrar(Propietario propietario, Vehiculo vehiculo);

}
