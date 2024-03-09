package com.teste.encontro1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.encontro1.Service.PessoaService;
import com.teste.encontro1.model.Pessoa;

@RestController
public class PrimeiroController {
  
    @Autowired
    private PessoaService pessoaService;


    @GetMapping("/primeiraUrl")
    public ResponseEntity<Object> PrimeiraURL(){
        return ResponseEntity.status(200).body("Hello world");
    }
    
    @PostMapping("/criaruser")
    public ResponseEntity<Pessoa> CriarPessoa(
        @RequestParam("nome") String nome,
        @RequestParam("cpf") String cpf,
        @RequestParam("email") String email  
         ){
            Pessoa pessoa = new Pessoa(nome, cpf, email);
           try {
              return ResponseEntity.status(200).body(this.pessoaService.CriarPessoa(pessoa));
           }
            catch (Exception e) {
            // TODO: handle exception
              return ResponseEntity.status(415).build();  
           }
        }
}
