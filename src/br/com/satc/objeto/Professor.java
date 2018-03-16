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
public class Professor extends Pessoa {
    private List<Disciplina>Disciplinas;
    private int cargaHoraria;
    private float valorHora,salario;

    @Override
    public String toString() {
        return "Professor{" + "Disciplinas=" + Disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

    public Professor(int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, int idade, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = calculaSalario(valorHora, cargaHoraria);;
    }

    public float calculaSalario(float valorHora, float cargaHoraria){
         return valorHora * cargaHoraria;
     }
    
    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<Disciplina> Disciplinas) {
        this.Disciplinas = Disciplinas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
