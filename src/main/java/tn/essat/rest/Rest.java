package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.essat.dao.IPfeDao;
import tn.essat.dao.ITypeDao;
import tn.essat.model.Pfe;
import tn.essat.model.TypePfes;

public class Rest {
	
	@Autowired
	IPfeDao daop;
	@Autowired
	ITypeDao daot;
	
	
	@GetMapping("/pfes")
	public List<Pfe> get1(){
		return daop.findAll();		
	}

	
	@GetMapping("/search/{search}")
	public List<Pfe> search(@PathVariable("search") String s){
		return daop.search(s);		
	}
	
	@GetMapping("/listpfe/{id}")
	public List<Pfe> get3(@PathVariable("id") int id){
		return daop.getAllPfeByTypePfe(id);
	}
	
	
	@GetMapping("/listetype")
	public List<TypePfes> meth2(){
		return daot.findAll();
	}
	 
	@PostMapping("/add")
	public void get3(@RequestBody Pfe pfe ){
	 daop.save(pfe);		
	}
	
	@DeleteMapping("/delete/{id}")
	public void get4(@PathVariable("id") int id){
		daop.deleteById(id);
	}

}
