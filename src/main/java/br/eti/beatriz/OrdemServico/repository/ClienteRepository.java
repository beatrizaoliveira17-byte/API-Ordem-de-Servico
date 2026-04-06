
package br.eti.beatriz.OrdemServico.repository;

import br.eti.beatriz.OrdemServico.domain.model.Cliente;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digma
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
  
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining (String nome);
    
    
        
    
    }

