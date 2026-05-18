
package br.eti.beatriz.OrdemServico.domain.service;

import br.eti.beatriz.OrdemServico.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digma
 */
@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    
}
