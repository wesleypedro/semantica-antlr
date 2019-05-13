package br.ufc.quixada.qxd0025.semantica.frontend;

import br.ufc.quixada.qxd0025.semantica.symbol.SymbolTable;
import br.ufc.quixada.qxd0025.semantica.symbol.SymbolType;

import java.util.IdentityHashMap;
import java.util.Map;

public class SemanticaChecker extends SemanticaBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<SemanticaParser.ExpressionContext, SymbolType> expressionType = new IdentityHashMap<>();

    public SymbolTable getSymbolTable() {
        return symbols;
    }
}
