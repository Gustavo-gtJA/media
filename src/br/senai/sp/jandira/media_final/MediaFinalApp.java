package br.senai.sp.jandira.media_final;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MediaFinalApp extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        // Determinando o tamanho do stage
        stage.setWidth(600);
        stage.setHeight(500);

        //determinar o tipo do stage
        stage.setTitle("Média Final");

        // Painel raiz (root)
        BorderPane root = new BorderPane();

        Label labelTitulo = new Label();
        labelTitulo.setText("\"Escola Prof. Vicente Amato\"");

        //Formatação do texto da label
        labelTitulo.setStyle("-fx-text-fill: #0051ff; -fx-font-size: 32; -fx-font-weight: bold;");
        labelTitulo.setPadding(new Insets(10, 0, 10, 10));

        // Painel de resultados - baixo
        VBox painelResultado = new VBox();
        painelResultado.setPadding(new Insets(0,0,10,10));
        Label labelAluno = new Label("Nome do aluno");
        Label labelMediaFinal = new Label("Média Final");
        Label labelSituacao = new Label("Situação");
        painelResultado.getChildren().addAll(labelAluno, labelMediaFinal, labelSituacao);

        // Painel de butões
        VBox painelDeButoes = new VBox();
        painelDeButoes.setPadding(new Insets(40,10,10,0));
        painelDeButoes.setSpacing(10);
        Button buttonCalcularMedia = new Button("Calcular média");
        buttonCalcularMedia.setPrefHeight(30);
        buttonCalcularMedia.setPrefWidth(120);
        Button buttonLimpar = new Button("Limpar");
        buttonLimpar.setPrefWidth(120);
        buttonLimpar.setPrefHeight(30);
        Button buttonSair = new Button("Sair");
        buttonSair.setPrefWidth(120);
        buttonSair.setPrefHeight(30);

        painelDeButoes.getChildren().addAll(buttonCalcularMedia, buttonLimpar, buttonSair);

        //Painel de formulário

        VBox formulario = new VBox();
        formulario.setPadding(new Insets(0, 0, 10, 10));
        Label labelnomeDoAluno = new Label("Nome do aluno");
        Label labelNota1 = new Label("Nota1");
        Label labelNota2 = new Label("Nota2");
        Label labelNota3 = new Label("Nota3");
        Label labelNota4 = new Label("Nota4");
        TextField textFieldNome = new TextField();
        TextField textFieldNota1 = new TextField();
        TextField textFieldNota2 = new TextField();
        TextField textFieldNota3 = new TextField();
        TextField textFieldNota4 = new TextField();
        formulario.getChildren().addAll(
                labelnomeDoAluno,textFieldNome,
                labelNota1,textFieldNota1,
                labelNota2,textFieldNota2,
                labelNota3,textFieldNota3,
                labelNota4,textFieldNota4
        );



        root.setTop(labelTitulo);
        root.setBottom(painelResultado);
        root.setRight(painelDeButoes);
        root.setLeft(formulario);


        Scene scene = new Scene(root);

        stage.setScene(scene);




        //mostrar o stage
        stage.show();

        // eventos de clique dos botões
        buttonCalcularMedia.addEventHandler();
    }
}

