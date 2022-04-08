package fr.univrouen.rss22.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Item;

	
	@RestController
	public class RSSController {
		
	
	@GetMapping("/resume")
	public String getListRSSinXML() {
	return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/guid")
	public String getRSSinXML(
	@RequestParam(value = "guid") String texte) {
	return ("Détail du flux RSS demandé : " + texte);
	}
	
	@GetMapping("/test")
	public String getRSStestXML(
	@RequestParam(value = "nb") int nombre,@RequestParam(value = "search") String texte){
		return ("Test:\n guid \r\n" +nombre+ "titre \r\n" +texte);
		}
	
	
	
	}
