package com.teste.encontro1.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Funcao {
   @Id 
   private UUID cargoid;
   private UUID pessoaid;
   private String codigo;
   private String descricao;

   @ManyToMany(mappedBy = "funcoes",fetch = FetchType.EAGER)
   private List<Cargo> cargos;

   
public Funcao(String codigo, String descricao) {
    this.codigo = codigo;
    this.descricao = descricao;
}
public UUID getCargoid() {
    return cargoid;
}
public void setCargoid(UUID cargoid) {
    this.cargoid = cargoid;
}
public UUID getPessoaid() {
    return pessoaid;
}
public void setPessoaid(UUID pessoaid) {
    this.pessoaid = pessoaid;
}
public String getCodigo() {
    return codigo;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}

}
