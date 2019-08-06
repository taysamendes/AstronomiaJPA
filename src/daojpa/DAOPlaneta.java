/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;


import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Planeta;

public class DAOPlaneta extends DAO<Planeta>{
	public DAOPlaneta(){
		super();
	}

	public Planeta read (Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select p from Planeta p where p.nome= '" + nome +"'");
			return (Planeta) q.getSingleResult();

		}catch(NoResultException e){
			return null;
		}
	}
	
//  //pode-se sobrescrever o metodo readAll da classe DAO para ordenar o resultado 
	public List<Planeta> readAll(){
		Query query = manager.createQuery("select p from Planeta p order by p.id");
		return (List<Planeta>) query.getResultList();
	}
	
}


