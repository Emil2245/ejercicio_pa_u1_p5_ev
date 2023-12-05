package com.uce.edu.ejercicio_pa2_u1_p5_ev.service;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.IMatriculaRepo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.IPropietarioRepo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.IVehiculoRepo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Matricula;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private IMatriculaRepo iMatriculaRepo;

    @Autowired
    private IVehiculoRepo iVehiculoRepo;

    @Autowired
    private static IPropietarioRepo iPropietarioRepo;

    @Override
    public void guardar(Matricula propietario) {
        this.iMatriculaRepo.insertar(propietario);
    }

    @Override
    public Matricula buscar(Vehiculo vehiculo) {
        return  this.iMatriculaRepo.seleccionar(vehiculo);
    }

    @Override
    public void actualizar(Matricula propietario) {
        this.iMatriculaRepo.actualizar(propietario);
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        this.iMatriculaRepo.eliminar(vehiculo);
    }

    @Override
    public List<Matricula> listar() {
        return this.iMatriculaRepo.listar();
    }

    @Override
    public void registrar(Propietario propietario, Vehiculo vehiculo) {

        Boolean isLiviano = (vehiculo.getTipo().compareToIgnoreCase("liviano") == 0);
        BigDecimal valorMatricula = vehiculo.getPrecio();
        if (isLiviano) {
            valorMatricula.multiply(new BigDecimal(0.2));
        } else {
            valorMatricula.multiply(new BigDecimal(0.25));
        }
        if (valorMatricula.compareTo(new BigDecimal(2200)) >= 1)
            valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.05)));

        Matricula matricula= new Matricula();
        matricula.setValorMatricula(vehiculo.getPrecio());
        matricula.setPropietario(propietario);
        matricula.setVehiculo(vehiculo);
        matricula.setFechaMatricula(LocalDate.now());
        this.iMatriculaRepo.insertar(matricula);
        System.out.println("Registro Exitoso");
    }
}


