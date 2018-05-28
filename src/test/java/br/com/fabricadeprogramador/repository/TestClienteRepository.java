package br.com.fabricadeprogramador.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fabricadeprogramador.model.Cliente;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestClienteRepository {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Test
	public void testSalvar() {
		Cliente cli = new Cliente("Jão", "jao@htcursos.com");
		Cliente cliSalvo = clienteRepository.save(cli);
		
		Assert.assertNotNull(cliSalvo.getId());
	}
	
}