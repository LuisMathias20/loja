package loja;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.loja.Produto;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("Teste", BigDecimal.TEN);
		
		Assert.assertEquals("Teste", p.getNome());
		Assert.assertEquals(BigDecimal.TEN, p.getPreco());
		
		p.setNome("Teste 2");
		p.setPreco(BigDecimal.ONE);
		
		Assert.assertEquals("Teste 2", p.getNome());
		Assert.assertEquals(BigDecimal.ONE, p.getPreco());
	}

}
