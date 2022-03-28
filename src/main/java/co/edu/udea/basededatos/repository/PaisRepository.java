package co.edu.udea.basededatos.repository;

import co.edu.udea.basededatos.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    Optional<Pais> findByNombre(String nombre);
}

