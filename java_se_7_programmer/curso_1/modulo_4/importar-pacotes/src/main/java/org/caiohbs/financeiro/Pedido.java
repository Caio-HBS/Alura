package org.caiohbs.financeiro;

// Uma vez que Pessoa é uma classe que está em outro pacote, somos obrigados
// a importá-la para podermos utilizá-la:
import org.caiohbs.modelo.Endereco;
import org.caiohbs.modelo.Pessoa;

// De forma alternativa, se precisamos importar múltiplas classes do mesmo pacote,
// podemos usar um import de *: "import org.caiohbs.modelo.*"

// Imports de mesmo nome dão "name-clash", mas podemos evitá-los da seguinte forma,
// e, ao utilizarmos cada um, devemos explicitar para o Java qual queremos:
import java.util.*;
import java.sql.Date;

public class Pedido {

    Pessoa cliente;
    // De forma alternativa, também poderíamos utilizar:
    // "org.caiohbs.modelo.Pessoa cliente", muito mais inconveniente, claro.
    Endereco endereco;
    Date dataDeCriacao;
    java.util.Date dataDeFinalizacao;

}
