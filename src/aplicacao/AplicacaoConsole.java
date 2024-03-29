package aplicacao;
import fachada.Fachada;
import modelo.Astronomo;
import modelo.Planeta;
import modelo.Satelite;

/**IFPB - Curso SI - Disciplina de PERSISTENCIA DE OBJETOS
 * @author Prof Fausto Ayres
 */

public class AplicacaoConsole {

	public AplicacaoConsole(){	
		Fachada.inicializar();
		//cadastrar(); 			
		atualizar();		
		//apagar();			
		//listar();			
		consultar();
		Fachada.finalizar();
	}


	public void cadastrar(){
		try {			

			   Fachada.cadastrarPlaneta("Terra", 23.56, 29.78, 5.9736e24, 14, 9.78);
			   Fachada.cadastrarPlaneta("Marte", 24.37, 24.077, 6.4174e23, -63, 9.71);
			   Fachada.cadastrarPlaneta("Jupiter", 9.8, 13.07, 1.8986e27, -108, 24.79);
			   Fachada.cadastrarPlaneta("Saturno", 10.34, 9.69, 5.6846e26, -139, 10.44);
			   Fachada.cadastrarPlaneta("Urano", 17.14, 6.81, 8.6810e2, -220, 8.69);
			   Fachada.cadastrarPlaneta("Netuno", 16.6, 5.43, 1.0243e26, -201, 11.15);
			   Fachada.cadastrarPlaneta("Plutao", 153.17, 4.66, 1.305e22, -229, 0.65);
	           
	           Fachada.cadastrarAstronomo("Christy", "Estados Unidos", "14 de julho de 1938");
			   Fachada.cadastrarAstronomo("Sheppard", "Estados Unidos", "1977");
			   Fachada.cadastrarAstronomo("Lassell", "Inglaterra", "18 de junho de 1799");
			   Fachada.cadastrarAstronomo("Herschel", "Alemanha", "15 de novembro de 1738");
			   Fachada.cadastrarAstronomo("Huygens",  "Holanda", "14 de abril de 1629");
			   Fachada.cadastrarAstronomo("Cassini", "Italia", "8 de junho de 1625");
			   Fachada.cadastrarAstronomo("Galileu", "Italia", "15 de fevereiro de 1564");
			   Fachada.cadastrarAstronomo("Hall", "Estados Unidos", "15 de outubro de 1829");
			   Fachada.cadastrarAstronomo("Barnard", "Estados Unidos", "16 de dezembro de 1857");
			   Fachada.cadastrarAstronomo("Synnot", "Estados Unidos", "1946");
			   Fachada.cadastrarAstronomo("Kuiper", "Holanda", "7 de dezembro de 1905");
			   
			   Fachada.cadastrarSatelite("Lua", 1737.10, 27.32, 0001);
	           Fachada.cadastrarSatelite("Fobos", 11.1, 0.319, 1877);
			   Fachada.cadastrarSatelite("Deimos", 6.2, 1.262, 1877);
			   Fachada.cadastrarSatelite("Io", 1818.1, 1.769, 1610);
			   Fachada.cadastrarSatelite("Europa", 1560.7, 3.551, 1619);
			   Fachada.cadastrarSatelite("Ganimedes", 2634.1, 7.155, 1610);
			   Fachada.cadastrarSatelite("Calisto", 2408.4, 16.69, 1610);
			   Fachada.cadastrarSatelite("Amalteia", 83.45, 0.498, 1892);
			   Fachada.cadastrarSatelite("Tebe", 49.3, 0.675, 1979);
			   Fachada.cadastrarSatelite("Mimas", 198.2, 0.942, 1789);
			   Fachada.cadastrarSatelite("Titan", 2575.5, 15.95, 1655);
			   Fachada.cadastrarSatelite("Reia", 764.5, 4.518, 1672);
			   Fachada.cadastrarSatelite("Ariel", 578.9, 2.520, 1851);
			   Fachada.cadastrarSatelite("Umbriel", 584.7, 4.144, 1851);
			   Fachada.cadastrarSatelite("Titania", 788.9, 8.706, 1787);
			   Fachada.cadastrarSatelite("Tritao", 1353.4, 5.8, 1846);
			   Fachada.cadastrarSatelite("Nereida", 170, 360.14, 1949);
			   Fachada.cadastrarSatelite("Caronte", 603.6, 6.387, 1978);

	           Fachada.adicionarSatelitePlaneta("Terra", "Lua");
	           Fachada.adicionarSatelitePlaneta("Marte", "Fobos");
			   Fachada.adicionarSatelitePlaneta("Marte", "Deimos");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Io");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Europa");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Ganimedes");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Calisto");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Amalteia");
			   Fachada.adicionarSatelitePlaneta("Jupiter", "Tebe");
			   Fachada.adicionarSatelitePlaneta("Saturno", "Mimas");
			   Fachada.adicionarSatelitePlaneta("Saturno", "Titan");
			   Fachada.adicionarSatelitePlaneta("Saturno", "Reia");
			   Fachada.adicionarSatelitePlaneta("Urano", "Ariel");
			   Fachada.adicionarSatelitePlaneta("Urano", "Umbriel");
			   Fachada.adicionarSatelitePlaneta("Urano", "Titania");
			   Fachada.adicionarSatelitePlaneta("Netuno", "Tritao");
			   Fachada.adicionarSatelitePlaneta("Netuno", "Nereida");
			   Fachada.adicionarSatelitePlaneta("Plutao", "Caronte");

		
			   Fachada.adicionarSateliteAstronomo("Fobos", "Hall");
			   Fachada.adicionarSateliteAstronomo("Deimos", "Hall");
			   Fachada.adicionarSateliteAstronomo("Io", "Galileu");
			   Fachada.adicionarSateliteAstronomo("Europa", "Galileu");
			   Fachada.adicionarSateliteAstronomo("Ganimedes", "Galileu");
			   Fachada.adicionarSateliteAstronomo("Calisto", "Galileu");
			   Fachada.adicionarSateliteAstronomo("Amalteia", "Barnard");
			   Fachada.adicionarSateliteAstronomo("Tebe", "Synnot");
			   Fachada.adicionarSateliteAstronomo("Mimas", "Herschel");
			   Fachada.adicionarSateliteAstronomo("Titan", "Huygens");
			   Fachada.adicionarSateliteAstronomo("Reia", "Cassini");			
			   Fachada.adicionarSateliteAstronomo("Ariel", "Lassell");
			   Fachada.adicionarSateliteAstronomo("Umbriel", "Lassell");
			   Fachada.adicionarSateliteAstronomo("Titania", "Herschel");
			   Fachada.adicionarSateliteAstronomo("Tritao", "Lassell");
			   Fachada.adicionarSateliteAstronomo("Nereida", "Kuiper");
			   Fachada.adicionarSateliteAstronomo("Caronte", "Christy");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/************************/
	public void atualizar(){
		Planeta p;
		Astronomo a;
		Satelite s;
		
		try {
			p = Fachada.readPlaneta("Marte");
			p.setNome("Planeta Vermelho");
			Fachada.atualizarPlaneta(p);
			
			a = Fachada.readAstronomo("Galileu");
			a.setNome("Galileu Galilei");
			Fachada.atualizarAstronomo(a);

			s = Fachada.readSatelite("Lua");
			s.setNome("Lua da Terra");
			Fachada.atualizarSatelite(s);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//
//	/************************/
	public void apagar(){
		try {
			Fachada.excluirPlaneta("Terra");;			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
//
//	/************************/
	public void listar(){
		try {
			System.out.println(Fachada.listarSatelites());
			System.out.println(Fachada.listarAstronomos());
		} catch (Exception e) {
			System.out.println(e);
		}
	}



	/************************/
	public void consultar(){
		try {
			System.out.println(Fachada.astronomoSatelite("Galileu Galilei"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//=================================================
	public static void main(String[] args) {
		new AplicacaoConsole();
	}
	//=================================================

}
