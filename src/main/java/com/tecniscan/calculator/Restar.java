package com.tecniscan.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;

@Component
public class Restar implements OperacionAritmetica{

    @Override
    public BigDecimal operacion(BigInteger operador1, BigInteger operador2) {

        BigDecimal resultado=new BigDecimal(operador1.subtract(operador2));
        return resultado;

    }
}
