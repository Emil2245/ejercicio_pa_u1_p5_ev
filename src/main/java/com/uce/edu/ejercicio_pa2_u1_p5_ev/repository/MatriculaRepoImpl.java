package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Matricula;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {
    private static List<Matricula> bd = new ArrayList<>();

    @Override
    public Matricula seleccionar(Vehiculo vehiculo) {
        for (Matricula m : bd) {
            if (m.getVehiculo().equals(vehiculo)) {
                Matricula mat = new Matricula();
                mat.setVehiculo(m.getVehiculo());
                mat.setPropietario(m.getPropietario());
                mat.setFechaMatricula(m.getFechaMatricula());
                mat.setValorMatricula(m.getValorMatricula());
                return mat;
            }
        }
        return null;
    }

    public Matricula seleccionarEliminar(Vehiculo vehiculo) {
        for (Matricula m : bd) {
            if (m.getVehiculo().equals(vehiculo)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void insertar(Matricula matricula) {
        bd.add(matricula);
        System.out.println("Se ha insertado: " + matricula);

    }

    @Override
    public void actualizar(Matricula matricula) {
        this.eliminar(matricula.getVehiculo());
        this.insertar(matricula);
        System.out.println("Se ha actualizado: " +
                matricula);
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        Matricula m = this.seleccionarEliminar(vehiculo);
        bd.remove(m);
        System.out.println("Se ha borrado: " + vehiculo);

    }

    @Override
    public List<Matricula> listar() {
        return bd;
    }
}


