package com.example.desafiopdioo.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode


public class Clientes {
    private String idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoResidencialCliente;
    private String celularResidencialCliente;
    private String emailCliente;
    private String tipoConta; 
}
