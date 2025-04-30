package com.tecniscan.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;

@Component
public class Dividir implements OperacionAritmetica{

    @Override
    public BigDecimal operacion(BigInteger operador1, BigInteger operador2) {

        BigDecimal operador1Decimal= new BigDecimal(operador1);
        BigDecimal operador2Decimal= new BigDecimal(operador2);

        return operador1Decimal.divide(operador2Decimal);
    }
}
