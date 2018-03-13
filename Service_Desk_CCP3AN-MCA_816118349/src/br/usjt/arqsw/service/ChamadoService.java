package br.usjt.arqsw.service;

import java.io.IOException;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;

public class ChamadoService {
	
	private ChamadoDAO dao;
	
	public ChamadoService() {
		this.dao = new ChamadoDAO();
	}
	
	public int criarChamado(Chamado chamado) throws IOException {
		chamado.setStatus(Chamado.ABERTO);
		chamado.setStatus(Chamado.FECHADO);
		chamado.setNumero(1);
		chamado.setNome("Chamado1");
		chamado.setDataAbertura(null);
		
		return dao.criarChamado(chamado);
	}
}
//Date dataAbertura = new Date(chamado.getDataAbertura().getTime());