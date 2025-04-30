package com.tecniscan.controller;




import com.tecniscan.calculator.Multiplicar;
import com.tecniscan.calculator.OperacionAritmetica;
import com.tecniscan.calculator.OperacionAritmeticaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.tecniscan.calculator.Operacion.*;

@RestController
@RequestMapping("/api/arithmetic")
public class Operacion {

    @Autowired
    private OperacionAritmeticaFactory operaciones;


    @GetMapping("/sum")
    public BigDecimal sum(@RequestParam BigInteger operador1 , @RequestParam BigInteger operador2){
      return operaciones.getOperacion(SUM).operacion(operador1,operador2);

    }

    @GetMapping("/divide")
    public BigDecimal divide(@RequestParam BigInteger operador1 , @RequestParam BigInteger operador2){
        return operaciones.getOperacion(DIVIDE).operacion(operador1,operador2);

    }

    @GetMapping("/multiply")
    public BigDecimal multiply(@RequestParam BigInteger operador1 , @RequestParam BigInteger operador2) {
        return operaciones.getOperacion(MULTIPLY).operacion(operador1, operador2);
    }

    @GetMapping("/subtract")
    public BigDecimal subtract(@RequestParam BigInteger operador1 , @RequestParam BigInteger operador2) {
        return operaciones.getOperacion(SUBTRACT).operacion(operador1, operador2);
    }
}
