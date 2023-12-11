package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ProdutoService {
    private Map<Integer, Produto> produtos = initProdutos();
    private Map<Integer, Produto> initProdutos(){
        HashMap<Integer, Produto> produtoHashMap = new HashMap<>();
        Produto produto1= new Produto(1, "Cafeteira de Expresso", "Delonghi");
        Produto produto2 = new Produto(2, "Ventilador de Teto", "Arno");
        produtoHashMap.put(1,produto1);
        produtoHashMap.put(2,produto2);
        return produtoHashMap;
    }
    public List<Produto> getAll(){
        return this.produtos.values().stream().toList();
    }

}
