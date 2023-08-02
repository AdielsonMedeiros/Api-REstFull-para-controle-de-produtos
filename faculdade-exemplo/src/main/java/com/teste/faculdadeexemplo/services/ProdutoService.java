package com.teste.faculdadeexemplo.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.faculdadeexemplo.model.Produto;
import com.teste.faculdadeexemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepository produtoRepository;

  /**
   * Metedodo para retornar uma lista de produtos
   * @return Lista de Produtos
   */
  public List<Produto> obterTodos(){
    return produtoRepository.obterTodos();
  }

  /**
 * Metodo que retorna o produto encontrado pelo seu Id.
 * @param id do produto que será localizado
 * @return Retorna um produto que tenha sido encontrado.
 */
  public Optional<Produto> obterPorId(Integer id){
    return produtoRepository.obterPorId(id);
  }

  /**
   * Metodo para adicionar o produto na lista.
   * @param produto que será adicionado.
   * @return Retorna o produto que foi adicionado na lista.
   */
  public Produto adicionar(Produto produto){
    return produtoRepository.adicionar(produto);
  }

  /**
 * Metodo para deletar um produto por id
 * @param id do produto a ser deletado
 */
public void deletar(Integer id){
  produtoRepository.deletar(id);
}

/**
   * Metodo para atualizar o produto na lista
   * @param produto que será atualizado
   * @return retorna o produto após  atualizar a lista
   */
  public Produto atualizar(Integer id, Produto produto){

    produto.setId(id);

    return produtoRepository.atualizar(produto);
}

}
