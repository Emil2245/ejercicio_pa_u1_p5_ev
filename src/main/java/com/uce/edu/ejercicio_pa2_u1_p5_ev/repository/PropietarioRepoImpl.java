package com.uce.edu.ejercicio_pa2_u1_p5_ev.repository;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {
    private static List<Propietario> bd = new ArrayList<>();
    public Propietario seleccionarEliminar(String id) {
        for (Propietario m : bd) {
            if (m.getCedula().equals(id)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void insertar(Propietario matricula) {
        bd.add(matricula);
        System.out.println("Se ha insertado: " + matricula);

    }

    @Override
    public void eliminar(String id) {
        Propietario m = this.seleccionarEliminar(id);
        bd.remove(m);
        System.out.println("Se ha borrado: " + id);

    }
    @Override
    public void actualizar(Propietario propietario) {
        this.eliminar(propietario.getCedula());
        this.insertar(propietario);
        System.out.println("Se ha actualizado: " +
                propietario);
    }
    @Override
    public List<Propietario> listar() {
        return bd;
    }
}


