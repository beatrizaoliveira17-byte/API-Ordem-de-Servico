
package br.eti.beatriz.OrdemServico.domain.service;

import br.eti.beatriz.OrdemServico.domain.model.OrdemServico;
import br.eti.beatriz.OrdemServico.domain.model.StatusOrdemServico;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */
@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServico criar(OrdemServico ordemServico) {
        
        ordemServico.setStatus(StatusOrdemServico.ABERTA);
        ordemServico.setDataAbertura(LocalDateTime.now());
        
        return ordemServicoRepository.save(ordemServico);
    }
}

