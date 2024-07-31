
package loja.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import loja.online.domain.Cliente;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf); 
	Optional<Cliente> deleteByCpf(Long cpf);
}
