package com.teste.faculdadeexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.teste.faculdadeexemplo.model.Produto;
import com.teste.faculdadeexemplo.model.exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository {


  private List<Produto> produtos = new ArrayList<Produto>();
  private Integer ultimoId = 0;

  /**
   * Método para retorna uma lista de produtos
   * @return Lista de produtos
   */
  public List<Produto> obterTodos(){
    return produtos;

  }
/**
 * Metodo que retorna o produto encontrado pelo seu Id.
 * @param id do produto que será localizado
 * @return Retorna um produto que tenha sido encontrado.
 */
  public Optional<Produto> obterPorId(Integer id){
    return produtos
          .stream()
          .filter(produto -> produto.getId()== id)
          .findFirst();
  }

  /**
   * Metodo para adicionar o produto na lista.
   * @param produto que será adicionado.
   * @return Retorna o produto que foi adicionado na lista.
   */
  public Produto adicionar(Produto produto){
    ultimoId++;
    produto.setId(ultimoId);
    produtos.add(produto);
    return produto;
  }
/**
 * Metodo para deletar um produto por id
 * @param id do produto a ser deletado
 */
  public void deletar(Integer id){
    produtos.removeIf(produto -> produto.getId() == id);
  }


  /**
   * Metodo para atualizar o produto na lista
   * @param produto que será atualizado
   * @return retorna o produto após  atualizar a lista
   */
  public Produto atualizar(Produto produto){
    Optional<Produto> produtoEncontrado = obterPorId(produto.getId());


    if(produtoEncontrado.isEmpty()){
      throw new ResourceNotFoundException("Produto não pode ser atualizado pois não existe");
    }

    deletar(produto.getId());

    // depois de deleter, o Produto é atualizado na lista com o novo
    produtos.add(produto);

    return produto;
  }

}
