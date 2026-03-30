package br.eti.beatriz.OrdemServico.api.controller;

import br.eti.beatriz.OrdemServico.domain.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */
@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager manager;
    
    public List<Cliente> listaClientes;

    @GetMapping("/clientes")
    public List<Cliente> listas(){
        
      // Linguagem JPQL (tipo SQL so que do jakarta)
      return manager.createQuery("from Cliente", Cliente.class).getResultList();
 

    }
    {
        
            
        
       

            
        }
    }
