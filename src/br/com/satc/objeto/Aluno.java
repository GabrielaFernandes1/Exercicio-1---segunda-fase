/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author gabriela.154717
 */
public class Aluno extends Pessoa {
   private int matricula;
   private Date dataMatricula;
   private List<Disciplina>Disciplinas;

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", Disciplinas=" + Disciplinas + '}';
    }

    public Aluno(int matricula, Date dataMatricula, String nome, String rg, String cpf, int idade, Date dataNascimento) {
        super(nome, rg, cpf, idade, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
     

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<Disciplina> Disciplinas) {
        this.Disciplinas = Disciplinas;
    }
   
   
   
}
