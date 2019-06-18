/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Satelite;

public class DAOSatelite extends DAO<Satelite>{
	
	public Satelite read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select s from Satelite s where s.nome= '" + nome +"'");
			return (Satelite) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
}

