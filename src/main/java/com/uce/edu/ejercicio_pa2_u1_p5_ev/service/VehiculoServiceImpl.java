package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.IVehiculoRepo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
    @Autowired
   private IVehiculoRepo iVehiculoRepo;
    @Override
    public Vehiculo buscar(String placa) {
        return this.iVehiculoRepo.seleccionar(placa);
    }

    @Override
    public void guardar(Vehiculo vehiculo) {
        this.iVehiculoRepo.insertar(vehiculo);
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        this.iVehiculoRepo.actualizar(vehiculo);
    }

    @Override
    public void eliminar(String placa) {
        this.iVehiculoRepo.eliminar(placa);
    }

    @Override
    public List<Vehiculo> listar() {
        return this.iVehiculoRepo.listar();
    }
}


