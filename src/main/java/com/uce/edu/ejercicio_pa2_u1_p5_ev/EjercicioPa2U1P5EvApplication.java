package com.uce.edu.ejercicio_pa2_u1_p5_ev;

import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Propietario;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.repository.model.Vehiculo;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.service.IMatriculaService;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.service.IPropietarioService;
import com.uce.edu.ejercicio_pa2_u1_p5_ev.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class EjercicioPa2U1P5EvApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioPa2U1P5EvApplication.class, args);
    }

    @Autowired
    public IPropietarioService iPropietarioService;

    @Autowired
    public IVehiculoService iVehiculoService;

    @Autowired
    public IMatriculaService iMatriculaService;

    @Override
    public void run(String... args) throws Exception {
        Propietario propietario = new Propietario();
        propietario.setApellido("Verkade");
        propietario.setCedula("549816516");


        this.iPropietarioService.guardar(propietario);
        propietario.setNombre("Juan");
        propietario.setGenero("M");
        this.iPropietarioService.actualizar(propietario);

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca("88P");
        vehiculo.setTipo("liviano");
        vehiculo.setPrecio(new BigDecimal(800));
        vehiculo.setMarca("Patito");

        this.iVehiculoService.guardar(vehiculo);

        this.iMatriculaService.registrar(propietario,vehiculo);




    }
}
