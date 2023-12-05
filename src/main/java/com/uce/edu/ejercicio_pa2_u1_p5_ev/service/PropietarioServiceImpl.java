package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.IPropietarioRepo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.service.IPropietarioService;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
    @Autowired
   private IPropietarioRepo iPropietarioRepo;
    @Override
    public void guardar(Propietario propietario) {
        this.iPropietarioRepo.insertar(propietario);
    }

    @Override
    public void actualizar(Propietario propietario) {
        this.iPropietarioRepo.actualizar(propietario);
    }

    @Override
    public void eliminar(String id) {
        this.iPropietarioRepo.eliminar(id);
    }

    @Override
    public List<Propietario> listar() {
        return this.iPropietarioRepo.listar();
    }
}


