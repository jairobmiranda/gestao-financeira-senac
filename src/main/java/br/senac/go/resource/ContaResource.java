package br.senac.go.resource;

import br.senac.go.interfaces.IResource;

import br.senac.go.model.Conta;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j //fazer log das requisições
@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/api/conta")
@Tag(name = "conta", description = "documentação ao resource conta")
/*@Tags({
        @Tag(name = "conta", description = "documentação ao resource conta"),
        @Tag(name = "investimento", description = "documentação para conta de investimento")
})*/
public class ContaResource implements IResource<Conta,Integer> {
    @Override
    @PostMapping
    public Conta create(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.create");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.create | valores: %s",entity.toString()));
        return null;
    }

    @Override
    @GetMapping
    public Conta read(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.read");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.read | valores: %s",entity.toString()));
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public Conta readById(@PathVariable Integer id) {
        log.info("Executado método ContaResource.readById");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.readById | valores: %d",id));
        return null;
    }

    @Override
    @PutMapping
    public Conta update(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.update");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.update | valores: %s",entity.toString()));
        return null;
    }

    @Override
    @PatchMapping("/{id}")
    public Conta updatePart(@PathVariable Integer id, @Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.updatePart");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.updatePart | valores: %d, %s",id, entity.toString()));

        return null;
    }

    @Override
    @PutMapping("/{id}")
    public Conta updateFull(@PathVariable Integer id, @Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.updateFull");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.updateFull | valores: %d, %s",id, entity.toString()));

        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método ContaResource.delete");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.delete | valores: %d",id));
    }

    @Override
    @DeleteMapping
    public void deleteByEntity(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.deleteByEntity");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.deleteByEntity | valores: %s",entity.toString()));

    }
}
