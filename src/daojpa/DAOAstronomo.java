/**IFPB - Curso SI - Disciplina de POB
 * @author Prof Fausto Ayres
 */
package daojpa;


import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Astronomo;

public class DAOAstronomo  extends DAO<Astronomo>{
	public Astronomo read (Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select a from Astronomo a where a.nome= '" + nome +"'");
			return (Astronomo) q.getSingleResult();

		}catch(NoResultException e){
			return null;
		}
	}

}
