package com.teste.encontro1.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.encontro1.model.Pessoa;
@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa,UUID>{

}
