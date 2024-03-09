package com.teste.encontro1.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.encontro1.Repository.PessoaRepositorio;
import com.teste.encontro1.model.Pessoa;
@Service
public class PessoaService {
  
    @Autowired
    private PessoaRepositorio pessoaRepositorio; //injeção de dependencia 

    public Pessoa CriarPessoa(Pessoa pessoa){
        //  Optional<Pessoa> pessoa1 = this.pessoaRepositorio.findAll().stream()
        //  .filter(n -> n.getNome().equals(pessoa.getNome())&&n.getEmail().equals(pessoa.getEmail())
        //  &&n.getCpf().equals(pessoa.getCpf())).findFirst();
        //  if (pessoa1 != null) {
        //     throw new RuntimeException("Usuario já existente");
        //  }
         return this.pessoaRepositorio.save(pessoa);
    }
}
