package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Matricula;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;

import java.util.List;

public interface IMatriculaRepo {
    Matricula seleccionar(Vehiculo vehiculo);

    void eliminar(Vehiculo vehiculo);

    void insertar(Matricula matricula);

    void actualizar(Matricula matricula);
    List<Matricula> listar();

}
