package com.example.desafiopdioo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioPdiOo112022Application {

// Uma empresa de comércio eletrônico necessita desenvolver um sistema para gerenciamento de clientes utilizando linguagem Java. 
// Você está responsável por desenvolver as classes destinadas a permitir o futuro controle das vendas e dos clientes.
// Descrição
// Estas classes deverão permitir o controle das vendas e pagamentos dos clientes, sendo que estes são classificados, 
// pela empresa, como Clientes A, B ou C, cada um com características peculiares.
// Descrição das funcionalidades de cada tipo de cliente:

// 1.    Clientes tipo A, recebem no momento do cadastro R$ 10.000,00 de limite de crédito. A cada R$ 5.000,00 em compras, este limite é acrescido em R$ 500,00. Esse aumento de limite deve ser avisado no momento da compra. Caso realizem compras com valor a partir de R$ 2.000,00, estes clientes recebem um desconto de 10% na compra realizada. O valor do desconto deve ser avisado no momento da compra.

// 2.    Clientes tipo B, recebem R$ 5.000,00 de limite de crédito. Caso realizem compras com valor a partir de R$ 1.000,00, estes clientes recebem um desconto de 5% na compra realizada. O valor do desconto deve ser avisado no momento da compra.

// 3.    Clientes tipo C, recebem R$ 1.000,00 de limite de crédito, e podem comprar e pagar suas compras.

// Baseado nas informações acima, desenvolva as seguintes atividades:

// ·         planeje a modelagem de abstração dos objetos relacionados ao projeto;

// ·         planeje quais as classes que serão implementadas, listando os atributos e métodos de cada uma.

// ·         identifique como os mecanismos de herança e polimorfismo no desenvolvimento das classes;

// ·         Desenvolva o diagrama de classes que modele este planejamento.

// ·         desenvolva as classes utilizando os mecanismos de Orientação a objetos estudados (construtores, modificadores, assessores, herança e polimorfismo, dentre outros).

// ·         crie uma aplicação que faça a simulação de compras e pagamentos de cada um dos clientes, exibindo o limite de crédito e valor devido de cada um.

	public static void main(String[] args) {
		SpringApplication.run(DesafioPdiOo112022Application.class, args);
	}

}
