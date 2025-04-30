package com.tecniscan.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class OperacionAritmeticaFactory {




    @Autowired
    private OperacionAritmetica sumar;
    @Autowired
    private OperacionAritmetica dividir;

    @Autowired
    private OperacionAritmetica restar;

    @Autowired
    private OperacionAritmetica multiplicar;

    public OperacionAritmetica getOperacion(Operacion operacion) {

        return switch ( operacion){

            case SUM ->  sumar;
            case DIVIDE ->  dividir;
            case SUBTRACT -> restar;
            case MULTIPLY -> multiplicar;
        };
    }
}


