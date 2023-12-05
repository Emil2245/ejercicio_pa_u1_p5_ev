package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {
    private static List<Vehiculo> bd = new ArrayList<>();

    @Override
    public Vehiculo seleccionar(String placa) {
        for (Vehiculo m : bd) {
            if (m.getPlaca().equals(placa)) {
                Vehiculo mat = new Vehiculo();
                mat.setMarca(m.getMarca());
                mat.setTipo(m.getTipo());
                mat.setPrecio(m.getPrecio());
                mat.setPlaca(m.getPlaca());
                return mat;
            }
        }
        return null;
    }

    public Vehiculo seleccionarEliminar(String placa) {
        for (Vehiculo m : bd) {
            if (m.getPlaca().equals(placa)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void insertar(Vehiculo matricula) {
        bd.add(matricula);
        System.out.println("Se ha insertado: " + matricula);
    }

    @Override
    public void actualizar(Vehiculo matricula) {
        this.eliminar(matricula.getPlaca());
        this.insertar(matricula);
        System.out.println("Se ha actualizado: " +
                matricula);
    }

    @Override
    public void eliminar(String placa) {
        Vehiculo m = this.seleccionarEliminar(placa);
        bd.remove(m);
        System.out.println("Se ha borrado: " + placa);

    }

    @Override
    public List<Vehiculo> listar() {
        return bd;
    }
}


