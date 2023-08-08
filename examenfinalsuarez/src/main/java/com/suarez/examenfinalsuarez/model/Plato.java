package com.suarez.examenfinalsuarez.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plato")
@Data
public class Plato {

    @Id
    private Long idPlato;
    private String nombrePlato;
    private String descripcion;
    private double precio;

}
