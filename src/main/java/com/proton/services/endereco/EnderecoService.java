package com.proton.services.endereco;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proton.models.entities.Endereco;
// import com.proton.models.entities.Municipe;
import com.proton.models.repositories.EnderecoRepository;
// import com.proton.models.repositories.MunicipeRepository;

@Component
public class EnderecoService {

     @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }

    public Endereco findById(Integer id){
        Optional<Endereco> obj = repository.findById(id);
        return obj.get();
    }

    public Endereco insert(Endereco obj) {
		return repository.save(obj);
	}

    public void delete(Integer id) {
		repository.deleteById(id);	
	}

    public Endereco update(Integer id, Endereco obj) {
		Endereco entity = repository.getReferenceById(id); //instancia o usuário sem mexer no banco de dados
		updateData(entity, obj);
			return repository.save(entity);
	}

    private void updateData(Endereco entity, Endereco obj) {
        entity.setNum_cep(obj.getNum_cep());
        entity.setTipo_endereco(obj.getTipo_endereco());
        entity.setLogradouro(obj.getLogradouro());
        entity.setNome_endereco(obj.getNome_endereco());
        entity.setNum_endereco(obj.getNum_endereco());
        entity.setComplemento(obj.getComplemento());
        entity.setBairro(obj.getBairro());
        entity.setCidade(obj.getCidade());
        entity.setEstado(obj.getEstado());
        entity.setPais(obj.getPais());
        
	}
    
}
