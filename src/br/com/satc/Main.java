/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
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
        List<Professor> prof = new ArrayList<>();
        List<Aluno> alun = new ArrayList<>();
        int esc = 0;
        do {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: "
                    + "\n 1. Cadastro de Disciplina"
                    + "\n 2. Cadastro de Professor"
                    + "\n 3. Cadastro de Aluno"
                    + "\n 4. Consulta de Disciplina"
                    + "\n 5. Consulta de Professor"
                    + "\n 6. Consulta de Aluno"
                    + "\n 7. Sair"));
            switch (esc) {
                case 1: {

                    do {
                        String nome;
                        String departamento;
                        char status;

                        nome = JOptionPane.showInputDialog("Informe o Nome da Disciplina: ");
                        departamento = JOptionPane.showInputDialog("Qual o Departamento? ");
                        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo").charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));

                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }
                case 2: {
                    do {
                        int cargaHoraria;
                        float valorHora;
                        float salario = 0;
                        String nome;
                        String rg;
                        String cpf;
                        int idade = 0;
                        Date dataNascimento;
                        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");

                        nome = JOptionPane.showInputDialog("Informe seu Nome: ");
                        rg = JOptionPane.showInputDialog("Informe seu RG: ");
                        cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
                        dataNascimento = conversor.parse(JOptionPane.showInputDialog("Informe a Data de Nascimento: "));
                        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a Carga Horaria: "));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor da Hora: "));

                        prof.add(new Professor(cargaHoraria, valorHora, salario, nome, rg, cpf, idade, dataNascimento));

                        if (JOptionPane.showConfirmDialog(null, "Professor já trabalha em alguma Disciplina?") == 0) {
                            do {
                                String disciplinasExistentes = "";
                                for (Disciplina materia : materias) {
                                    disciplinasExistentes += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                }
                                int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe qual a Disciplina: \n " + disciplinasExistentes));
                                prof.get(prof.size() - 1).getDisciplinas().add(materias.get(escolhaDisciplina));
                            } while ((JOptionPane.showConfirmDialog(null, "Professor possui outra disciplina? ")) == 0);

                        }
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }
                case 3: {
                    do {
                        int matricula;
                        Date dataMatricula;
                        String nome;
                        String rg;
                        String cpf;
                        Date dataNascimento;
                        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
                        nome = JOptionPane.showInputDialog("Informe seu Nome: ");
                        rg = JOptionPane.showInputDialog("Informe seu RG: ");
                        cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
                        dataNascimento = conversor.parse(JOptionPane.showInputDialog("Informe a Data de Nascimento: "));
                        matricula = (int) Float.parseFloat(JOptionPane.showInputDialog("Informe seu Número de Matricula: "));
                        dataMatricula = conversor.parse(JOptionPane.showInputDialog("Informe a Data de Matricula: "));

                        alun.add(new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento));

                        if (JOptionPane.showConfirmDialog(null, "Aluno já cadastrado em outra Disciplina? ") == 0) {
                            do {
                                String disciplinasExistentes = "";
                                for (Disciplina materia : materias) {
                                    disciplinasExistentes += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                }
                                int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe qual a Disciplina: \n " + disciplinasExistentes));
                                alun.get(alun.size() - 1).getDisciplinas().add(materias.get(escolhaDisciplina));
                            } while ((JOptionPane.showConfirmDialog(null, "Aluno possui outra disciplina? ")) == 0);

                        }

                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar? ")) == 0);
                    break;
                }
                case 4: {
                    
                    for (Disciplina x : materias) {
                       JOptionPane.showMessageDialog(null, "Disciplina: " + x.getNome() + "\n" + "Departamento: " + x.getDepartamento() + "\n" + "Status: " + x.getStatus());

                    }
                    break;
                }
                case 5: {
                    
                    for (int i = 0; i < prof.size(); i++) {
                       JOptionPane.showMessageDialog(null, prof);
                    }

                   // for (Professor x : prof) {
                    //    JOptionPane.showMessageDialog(null,"Professor: " + x.getNome() + "\n" + "RG: " + x.getRg() + "\n" + "CPF: " + x.getCpf() + "\n" + "Data de Nascimento: " + x.getDataNascimento()
                    //     + "\n" + "Disciplina: " + x.getDisciplinas());
                   // }
                }
                case 6: {
                    
                    for (int i = 0; i < alun.size(); i++) {
                        JOptionPane.showMessageDialog(null, alun);
                    }
                    
                   // for (Aluno x : alun){
                      //  JOptionPane.showMessageDialog(null,"Aluno: " + x.getNome() + "\n" + "RG: " + x.getRg() + "\n" + "CPF: " + x.getCpf() + "\n" + "Data de Nascimento: " + x.getDataNascimento()
                       //  + "\n" + "Número de Matricula: " + x.getMatricula() + "\n" + "Data de Matricula: " + x.getDataMatricula() + "\n" + "Disciplina: " + x.getDisciplinas());
                   // }
                }

            }

        } while (esc != 7);

    }

}
