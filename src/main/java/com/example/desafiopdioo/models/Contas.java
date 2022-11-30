package com.example.desafiopdioo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public class Contas {

    private String idConta;
    private String idCliente;
    private double valorCompra;
    private double valorPagoAcumulado;
    private String status;
    private String tipoConta;
    private static double limiteCredito;

    
    public static double cadastroInicialLimite(String tipoConta) {
        if (tipoConta == "A") {
            limiteCredito = 10000;
        } else if (tipoConta == "B") {
            limiteCredito = 5000;
        } else if (tipoConta == "C") {
            limiteCredito = 1000;
        }
        else {
            System.out.println("Tipo de conta inválido");   
        }
        return limiteCredito;
    }

    // 1.    Clientes tipo A, recebem no momento do cadastro R$ 10.000,00 de limite de crédito. 
    // A cada R$ 5.000,00 em compras, este limite é acrescido em R$ 500,00. 
    // Esse aumento de limite deve ser avisado no momento da compra. Caso realizem compras com valor a partir de R$ 2.000,00, 
    // estes clientes recebem um desconto de 10% na compra realizada. 
    // O valor do desconto deve ser avisado no momento da compra.
    private void tipoClienteA(Cliente cliente){
    
    }

    // 2.    Clientes tipo B, recebem R$ 5.000,00 de limite de crédito. Caso realizem compras com valor a partir de R$ 1.000,00, 
    // estes clientes recebem um desconto de 5% na compra realizada. 
    // O valor do desconto deve ser avisado no momento da compra.
        private void tipoClienteB(){
        if (this.tipoConta == "B"){
            this.limiteCredito = 5000;
            if (this.valorCompra >= 1000){
                this.valorCompra = this.valorCompra - (this.valorCompra * 0.05);
            }
        }
    }
    // 3.    Clientes tipo C, recebem R$ 1.000,00 de limite de crédito, e podem comprar e pagar suas compras.

    private void pagarCompra(){
        if (valorCompra > limiteCredito){
            System.out.println("Compra não autorizada");
        } else {
            valorPagoAcumulado += valorCompra;
            limiteCredito -= valorCompra;
            System.out.println("Compra autorizada");
        }
    }
}
