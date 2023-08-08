package com.suarez.examenfinalsuarez.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente")
@Data
public class Cliente {

    @Id
    private Long idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String cedula;
    private String correo;

}
