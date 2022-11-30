package com.example.desafiopdioo.models;

import com.example.desafiopdioo.services.ContaService;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public class Conta {
    private String idConta;
    private String idCliente;
    private double valorCompra;
    private double valorPagoAcumuladoParaAumentarLimite;
    private String status;
    private String tipoConta;
    private double limiteCredito;

}
