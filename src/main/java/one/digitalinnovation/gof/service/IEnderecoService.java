package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

public interface IEnderecoService {

    Iterable<Endereco> buscarTodos();

    Endereco buscarPorId(Long id);

    void inserir(Endereco endereco);

    void atualizar(Long id, Endereco endereco);

    void deletar(Endereco endereco);
}
