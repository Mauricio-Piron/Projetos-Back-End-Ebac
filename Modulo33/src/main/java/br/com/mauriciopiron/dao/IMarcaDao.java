package br.com.mauriciopiron.dao;

import br.com.mauriciopiron.domain.Marca;
/**
 * @author mauricio.piron
 *
 */
public interface IMarcaDao {
	
	Marca cadastrar(Marca marca);
	
	Marca buscarPorCodigoAcessorio(String codigoAcessorio);
	
	//Matricula buscarPorCurso(Curso curso);
	
	//Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
	
	//Matricula buscarPorCursoCriteria(Curso curso);

}
