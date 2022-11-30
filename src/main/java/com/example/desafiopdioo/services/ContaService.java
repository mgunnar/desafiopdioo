package com.example.desafiopdioo.services;

import com.example.desafiopdioo.models.Conta;

public class ContaService {

    public void cadastraConta(Conta conta) {
        setCadastroInicialLimite(conta);

    }
    // 1.    Clientes tipo A, recebem no momento do cadastro R$ 10.000,00 de limite de crédito.
    // 1.    Clientes tipo B, recebem no momento do cadastro R$ 5.000,00 de limite de crédito.
    // 1.    Clientes tipo A, recebem no momento do cadastro R$ 1000,00 de limite de crédito.


    public void setCadastroInicialLimite(Conta conta) {
        String tipoConta = conta.getTipoConta();
        switch (tipoConta) {
            case "A" -> conta.setLimiteCredito(10000);
            case "B" -> conta.setLimiteCredito(5000);
            case "C" -> conta.setLimiteCredito(1000);
            default -> System.out.println("Tipo de conta inválido. A conta deve ser do tipo A, B ou C.");
        }
    }

    // 1.    Clientes tipo A, a cada R$ 5.000,00 em compras, este limite é acrescido em R$ 500,00.
    // Esse aumento de limite deve ser avisado no momento da compra.
    // Caso realizem compras com valor a partir de R$ 2.000,00,
    // estes clientes recebem um desconto de 10% na compra realizada.
    // O valor do desconto deve ser avisado no momento da compra.
    // 2.    Clientes tipo B, recebem R$ 5.000,00 de limite de crédito. Caso realizem compras com valor a partir de R$ 1.000,00,
    // estes clientes recebem um desconto de 5% na compra realizada.
    // O valor do desconto deve ser avisado no momento da compra.
    // 3.    Clientes tipo C, recebem R$ 1.000,00 de limite de crédito, e podem comprar e pagar suas compras.

    public void atualizaLimite(Conta conta) {
        String tipoConta = conta.getTipoConta();
        double valorCompra = conta.getValorCompra();
        double limiteCredito = conta.getLimiteCredito();
        double valorPagoAcumulado = conta.getValorPagoAcumuladoParaAumentarLimite();
        double valorCompraComDesconto = valorCompra;
        double valorDesconto = 0;
        if (tipoConta == "A") {
            if (valorCompra >= 2000) {
                valorDesconto = valorCompra * 0.1;
                valorCompraComDesconto = valorCompra - valorDesconto;
            }
            if (valorCompra >= 5000 || valorPagoAcumulado >= 5000) {
                limiteCredito += 500;
                conta.setLimiteCredito(limiteCredito);
                System.out.println("Limite de crédito atualizado para R$ " + limiteCredito);
            }
        } else if (tipoConta == "B") {
            if (valorCompra >= 1000) {
                valorDesconto = valorCompra * 0.05;
                valorCompraComDesconto = valorCompra - valorDesconto;
            }
        }

        System.out.println("Valor da compra com desconto: R$ " + valorCompraComDesconto);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
    }


    private void pagarCompra(Conta conta) {
        double valorCompra = conta.getValorCompra();
        double limiteCredito = conta.getLimiteCredito();
        double valorPagoAcumulado = conta.getValorPagoAcumuladoParaAumentarLimite();

        if (valorCompra > limiteCredito) {
            System.out.println("Compra não autorizada");
        } else if (valorCompra <= limiteCredito) {
            atualizaLimite(conta);
            valorPagoAcumulado += valorCompra;
            limiteCredito -= valorCompra;
            System.out.println("Compra autorizada");
        }
    }
}
