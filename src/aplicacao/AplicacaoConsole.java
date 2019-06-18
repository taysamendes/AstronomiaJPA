package aplicacao;
import fachada.Fachada;
import modelo.Satelite;

/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

public class AplicacaoConsole {

	public AplicacaoConsole(){	
		Fachada.inicializar();
		cadastrar(); 			
		//atualizar();		
//		apagar();			
//		listar();			
//		consultar();
		Fachada.finalizar();
	}


	public void cadastrar(){
		try {			

			Satelite s;
			s = Fachada.cadastrarSatelite("Teste", 1737.10, 27.32, 0001);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/************************/
//	public void atualizar(){
//		try {
//			Fachada.alterarPessoa("joao","joana");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	/************************/
//	public void apagar(){
//		try {
//			Fachada.excluirPessoa("maria");			
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	/************************/
//	public void listar(){
//		try {
//			System.out.println(Fachada.listarPessoas());
//			System.out.println(Fachada.listarAlunos());
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}



	/************************/
//	public void consultar(){
//		try {
//			System.out.println(Fachada.consultarSexo(Sexo.MASCULINO));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
	
	
	//=================================================
	public static void main(String[] args) {
		new AplicacaoConsole();
	}
	//=================================================

}
