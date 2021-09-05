package upn.apicalidad.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.ejemplo.UsuarioModel;


@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long>{
    public abstract Optional<UsuarioModel> findByEmail(String email);
    public abstract Optional<UsuarioModel> findByIdusuario(Long idusuario);
    public abstract void deleteById(Long id);
    public abstract void deleteByEmail(String email);
    public abstract boolean existsByEmail(String email);
}