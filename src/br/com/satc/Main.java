/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriela.154717
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        List<Disciplina> materias = new ArrayList<>();

        do {
            String nome;
            String departamento;
            char status;

            nome = JOptionPane.showInputDialog("Informe o Nome da Disciplina: ");
            departamento = JOptionPane.showInputDialog("Qual o Departamento? ");
            status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo").charAt(0);
            materias.add(new Disciplina(nome, departamento, status));

        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
        String disciplinasDisponiveis = "";
        for (Disciplina materia : materias) {
            disciplinasDisponiveis += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
        }

        List<Pessoa> pessoas = new ArrayList<>();
        do {
            String nome, rg, cpf;
            Date dataNascimento;
            SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");

            nome = JOptionPane.showInputDialog("Informe seu Nome: ");
            rg = JOptionPane.showInputDialog("Informe seu RG: ");
            cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
            dataNascimento = conversor.parse(JOptionPane.showInputDialog("informe a Data de Nascimento: "));
            pessoas.add(new Pessoa(nome, rg, cpf, dataNascimento) {
            });

        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
        String pessoasCadastradas = "";
        for (Pessoa cadastro : pessoas) {
            pessoasCadastradas += "\n" + pessoas.lastIndexOf(cadastro) + " "
                    + "\n" + cadastro.getNome() + " "
                    + "\n" + cadastro.getRg() + " "
                    + "\n" + cadastro.getCpf() + " "
                    + "\n" + cadastro.getIdade() + " Anos";
        }

        JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
        JOptionPane.showMessageDialog(null, pessoasCadastradas);
    }

}
