package br.com.ocean.projecto.view;

import br.com.ocean.projecto.model.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Instânciando Investimento e Duvida para começarem vazios e serem preenchido todas as vezes que for desejado pelo cliente.
        Duvida duvida = new Duvida();
        Investimento investimento = new Investimento();

        //Instânciando o Drone com seus possíveis dados.
        Drone drone = new Drone("G4F5F4", "Dronex44", "vontMax", "2021");

        //Instânciando Dados Brasil e Dados Estados Unidos com as informações pegas.
        DadosBrasil dadosBrasil = new DadosBrasil("DSF564", "500", "6.8", "15%", "25", "Moderado", "28°C");
        DadosEstadosUnidos dadosEstadosUnidos = new DadosEstadosUnidos("D4F68G4DF","1.5","7.2","10%","35","Moderado","25°C");

        //SENHA PARA O ACESSO A "ÁREA ADMIN"
        String senha = "444";

        //Criando um caminho para a imagem e pegando seu endereço.
        String caminhoImagem = "br/com/ocean/projecto/img/imagem.png";

        // Carrega a imagem
        ImageIcon iconeOriginal = new ImageIcon(Main.class.getClassLoader().getResource(caminhoImagem));

        // Redimensiona a imagem para um tamanho desejado
        int larguraNova = 40;
        int alturaNova = 40;
        Image imagemRedimensionada = iconeOriginal.getImage().getScaledInstance(larguraNova, alturaNova, Image.SCALE_SMOOTH);

        // Cria um novo ImageIcon com a imagem redimensionada
        ImageIcon iconeRedimensionado = new ImageIcon(imagemRedimensionada);

        // Exibe a mensagem de Bem-Vindo e a imagem.
        JOptionPane.showMessageDialog(null, "Bem-vindo à plataforma ProjectO.", "ProjectO", JOptionPane.INFORMATION_MESSAGE, iconeRedimensionado);


        //Começando o while já TRUE.
        boolean rodar = true;

        //Código para funcionamento.
        while (rodar) {
            String opcoes = JOptionPane.showInputDialog(null, "Escolha sua opção de preferência \n 1 - Dados e Informações sobre oceanos e regiões \n 2 - Realizar investimento \n 3 - Registrar uma duvida \n 4 - Área admin \n 5 - Sair");
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
                            JTextField nomeInvestirField = new JTextField();
                            JTextField emailInvestirField = new JTextField();
                            JTextField cpfCnpjField = new JTextField();
                            JTextField valorField = new JTextField();

                            Object[] investidorComum = {
                                    "Digite seu nome:", nomeInvestirField,
                                    "Digite seu email:", emailInvestirField,
                                    "Digite seu CPF/CNPJ:", cpfCnpjField,
                                    "Digite o valor do investimento:", valorField,
                            };

                            int registroInvestimento = JOptionPane.showConfirmDialog(null, investidorComum, "ProjectO - Investimento", JOptionPane.OK_CANCEL_OPTION);

                            if (registroInvestimento == JOptionPane.OK_OPTION) {
                                String nome = nomeInvestirField.getText();
                                String email = emailInvestirField.getText();
                                String cpfCnpj = cpfCnpjField.getText();
                                String valorInvestimentoString = valorField.getText();

                                if (nome.isEmpty() || email.isEmpty() || cpfCnpj.isEmpty() || valorInvestimentoString.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                                } else {

                                    // Converta o valor para double
                                    double valorInvestimento = Double.parseDouble(valorInvestimentoString);

                                    // Registrar investimento
                                    investimento.registrarInvestimento(nome, email, cpfCnpj, valorInvestimento);

                                    JOptionPane.showMessageDialog(null, nome.toUpperCase() + " seu investimento foi realizado com sucesso.");
                                }
                            }
                            break;

                        case "2":
                            JTextField valorAnonimoField = new JTextField();

                            Object[] investidorAnonimo = {
                                    "Digite o valor do investimento:", valorAnonimoField
                            };

                            int registroInvestimentoAnonimo = JOptionPane.showConfirmDialog(null, investidorAnonimo, "ProjectO - Investimento", JOptionPane.OK_CANCEL_OPTION);

                            if (registroInvestimentoAnonimo == JOptionPane.OK_OPTION) {
                                String valorInvestimentoString = valorAnonimoField.getText();

                                if (valorInvestimentoString.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                                } else {

                                    // Converta o valor para double
                                    double valorInvestimento = Double.parseDouble(valorInvestimentoString);

                                    // Registrar investimento
                                    investimento.registrarInvestimento(valorInvestimento);

                                    JOptionPane.showMessageDialog(null, "Seu investimento foi realizado com sucesso.");

                                }
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

                        if(nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || comentario.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");

                        }else {

                            duvida.registrarDuvida(nome, email, telefone, comentario);
                            JOptionPane.showMessageDialog(null, nome.toUpperCase() + " sua dúvida foi registrada com sucesso.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma dúvida registrada.");
                    }
                    break;
                case "4":
                    String acesso = JOptionPane.showInputDialog(null, "Digite a senha para ter acesso à área do usuário.");
                    if (acesso.equals(senha)) {
                        String opcoesUser = JOptionPane.showInputDialog(null, "Digite uma das opções de sua escolha \n 1 - Registro de Dúvidas \n 2 - Registro de Investimentos");
                        switch (opcoesUser) {
                            case "1":
                                JOptionPane.showMessageDialog(null, duvida.exibirDuvidas(), "ProjectO - Dúvidas Registradas", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "2":

                                JOptionPane.showMessageDialog(null, investimento.exibirInvestimentos(), "ProjectO - Investimentos Comuns", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha Incorreta.");
                    }
                    break;
                case "5":
                    rodar = false;
                    JOptionPane.showMessageDialog(null, "A plataforma ProjectO agradece pela sua interação.", "ProjectO", JOptionPane.INFORMATION_MESSAGE, iconeRedimensionado);
            }
        }
    }
}
