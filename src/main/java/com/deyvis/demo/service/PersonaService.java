package com.deyvis.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deyvis.demo.interfaces.IPersona;
import com.deyvis.demo.interfacesService.IpersonaService;
import com.deyvis.demo.modelo.Persona;

@Service
public class PersonaService implements IpersonaService {
	
	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		int res=0;
		Persona persona= data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	
}