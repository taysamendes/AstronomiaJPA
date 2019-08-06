/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

package daojpa;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Satelite;

public class DAOSatelite extends DAO<Satelite>{
	
	public Satelite read(Object chave){
		try{
			String nome = (String) chave;
			Query q = manager.createQuery("select s from Satelite s where s.nome = '" + nome +"'");
			return (Satelite) q.getSingleResult();
			
		}catch(NoResultException e){
			return null;
		}
	}
	
	public List<Satelite> astronomoSatelite(String nome){
		Query q = manager.createQuery("select s from Satelite s JOIN s.astronomos a where a.nome = '"+nome+ "'");
		return (List<Satelite>) q.getResultList();
	}

}


//Query q = manager.query();
//q.constrain(Satelite.class);
//q.descend("astronomos").descend("satelites").descend("planeta").descend("nome").constrain(nome);
//List<Satelite> result = q.execute(); 
//	return result;