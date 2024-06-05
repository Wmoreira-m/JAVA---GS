package br.com.ocean.projecto.view;

import br.com.ocean.projecto.model.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Duvida duvida = new Duvida();
        Investimento investimento = new Investimento();
        Drone drone = new Drone("G4F5F4", "Dronex44", "vontMax", "2021");
        DadosBrasil dadosBrasil = new DadosBrasil("DSF564", "500", "6.8", "15%", "25", "Moderado", "28°C");
        DadosEstadosUnidos dadosEstadosUnidos = new DadosEstadosUnidos("D4F68G4DF","1.5","7.2","10%","35","Moderado","25°C");

        String senha = "444";

        String caminhoImagem = "br/com/ocean/projecto/view/imagem.png";

        // Carrega a imagem
        ImageIcon iconeOriginal = new ImageIcon(Main.class.getClassLoader().getResource(caminhoImagem));

        // Redimensiona a imagem para um tamanho desejado
        int larguraNova = 40; // largura desejada
        int alturaNova = 40; // altura desejada
        Image imagemRedimensionada = iconeOriginal.getImage().getScaledInstance(larguraNova, alturaNova, Image.SCALE_SMOOTH);

        // Cria um novo ImageIcon com a imagem redimensionada
        ImageIcon iconeRedimensionado = new ImageIcon(imagemRedimensionada);

        // Exibe a mensagem e a imagem em um JOptionPane
        JOptionPane.showMessageDialog(null, "Bem-vindo à plataforma ProjectO.", "ProjectO", JOptionPane.INFORMATION_MESSAGE, iconeRedimensionado);


        boolean rodar = true;

        while (rodar) {
            String opcoes = JOptionPane.showInputDialog(null, "Escolha sua opção de preferência \n 1 - Dados e Informações sobre oceanos e regiões \n 2 - Realizar investimento \n 3 - Registrar uma duvida \n 4 - Área Usuário");
            switch (opcoes) {
                case "1":
                    String opcoesRegiao = JOptionPane.showInputDialog(null, "Deseja ver os dados de qual região? \n 1 - Brasil \n 2 - Estados Unidos \n 3 - Voltar");
                    switch (opcoesRegiao) {
                        case "1":
                            JOptionPane.showMessageDialog(null, "Rio Amazonas" +
                                    "\n Taxa de Resíduos: " + dadosBrasil.getTaxaResiduo() + " Toneladas" +
                                    "\n Ph da Água: " + dadosBrasil.getPhAgua() + "(Ligeiramente ácido)" +
                                    "\n Taxa de Pesca Ílegal: " + dadosBrasil.getPescaIlegal() +
                                    "\n Quantidade de Lixo: " + dadosBrasil.getRegiaoLixo() + " Toneladas" +
                                    "\n Qualidade do Ar: " + dadosBrasil.getQualidadeAr() +
                                    "\n Temperatura Média da Água: " + dadosBrasil.getTemperaturaAgua());
                            break;
                        case "2":
                            JOptionPane.showMessageDialog(null, "Rio Mississippi" +
                                    "\n Taxa de Resíduos: " + dadosEstadosUnidos.getTaxaResiduo() + " Toneladas" +
                                    "\n Ph da Água: " + dadosEstadosUnidos.getPhAgua() + "(Neutro)" +
                                    "\n Taxa de Pesca Ílegal: " + dadosEstadosUnidos.getPescaIlegal() +
                                    "\n Quantidade de Lixo: " + dadosEstadosUnidos.getRegiaoLixo() + " Toneladas" +
                                    "\n Qualidade do Ar: " + dadosEstadosUnidos.getQualidadeAr() +
                                    "\n Temperatura Média da Água: " + dadosEstadosUnidos.getTemperaturaAgua());
                            break;
                        case "3":
                            break;
                    }
                    break;
                case "2":
                    String opcoesInvestimento = JOptionPane.showInputDialog(null, "Qual a opção de sua preferência para realizar o investimento em nossa plataforma \n 1 - Comum \n 2 - Anônimo \n 3 - Voltar");
                    switch (opcoesInvestimento) {
                        case "1":
                            JTextField nomeField = new JTextField();
                            JTextField emailField = new JTextField();
                            JTextField cpf_cnpjlField = new JTextField();
                            JTextField valorlField = new JTextField();

                            Object[] investidorComum = {
                                    "Digite seu nome:", nomeField,
                                    "Digite seu email:", emailField,
                                    "Digite seu CPF/CNPJ:", cpf_cnpjlField,
                                    "Digite o valor do investimeto:", valorlField,
                            };

                            int registroInvestimento = JOptionPane.showConfirmDialog(null, investidorComum, "ProjectO - Investimento", JOptionPane.OK_CANCEL_OPTION);

                            if (registroInvestimento == JOptionPane.OK_OPTION) {
                                String nome = nomeField.getText();
                                String email = emailField.getText();
                                String cpf_cnpj = cpf_cnpjlField.getText();
                                double valor = Double.parseDouble(valorlField.getText());

                                investimento.registrarInvestimento(nome, email, cpf_cnpj, valor);
                                JOptionPane.showMessageDialog(null, nome.toUpperCase() + " seu investimento foi realizado com sucesso.");
                            } else {
                                JOptionPane.showMessageDialog(null,"Nenhum Investimento realizado.");
                            }
                            break;

                        case "2":
                            JTextField valorAnonimolField = new JTextField();


                                   double valor = JOptionPane.showInputDialog(null,"Digite o valor do investimeto:");


                            int registroInvestimentoAnonimo = JOptionPane.showConfirmDialog(null, investidorComum, "ProjectO - Investimento", JOptionPane.OK_CANCEL_OPTION);

                            if (registroInvestimento == JOptionPane.OK_OPTION) {

                                double valorAnonimo = Double.parseDouble(valorlField.getText());

                                investimento.registrarInvestimentoAnonimo(valorAnonimo);
                                JOptionPane.showMessageDialog(null, "Seu investimento foi realizado com sucesso.");
                            } else {
                                JOptionPane.showMessageDialog(null,"Nenhum Investimento realizado.");
                            }
                            break;
                    }
                    break;
                case "3":
                        JTextField nomeField = new JTextField();
                        JTextField emailField = new JTextField();
                        JTextField telefoneField = new JTextField();
                        JTextField comentarioField = new JTextField();

                        Object[] areaduvida = {
                                "Digite seu nome:", nomeField,
                                "Digite seu email:", emailField,
                                "Digite seu telefone:", telefoneField,
                                "Digite o seu comentário:", comentarioField,
                        };

                        int registroDuvida = JOptionPane.showConfirmDialog(null, areaduvida, "ProjectO - Registrar Dúvida", JOptionPane.OK_CANCEL_OPTION);

                        if (registroDuvida == JOptionPane.OK_OPTION) {
                            String nome = nomeField.getText();
                            String email = emailField.getText();
                            String telefone = telefoneField.getText();
                            String comentario = comentarioField.getText();

                            duvida.registrarDuvida(nome, email, telefone, comentario);
                            JOptionPane.showMessageDialog(null, nome.toUpperCase() + " sua dúvida foi registrada com sucesso.");
                        } else {
                            JOptionPane.showMessageDialog(null,"Nenhuma dúvida registrada.");
                        }
                        break;
                case "4":
                    String acesso = JOptionPane.showInputDialog(null,"Digite a senha para ter acesso à área do usuário.");
                    if(acesso.equals(senha)){
                        String opcoesUser = JOptionPane.showInputDialog(null,"Digite uma das opções de sua escolha \n 1 - Registro de Dúvidas \n 2 - Registro de Investimentos");
                        switch(opcoesUser){
                            case "1":
                                JOptionPane.showMessageDialog(null, duvida.exibirDuvidas(), "ProjectO - Dúvidas Registradas", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, investimento.exibirInvestimentos(), "ProjectO - Dúvidas Registradas", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Senha Incorreta.");
                    }
                    break;
            }
        }
    }
}