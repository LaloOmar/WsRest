package com.javaoems.webservice.service;




import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javaoems.webservice.VO.VOUser;


@Path("/JavaOems")
public class ServiceLoginJR {
	
	@POST
	@Path ("/ValidaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
public VOUser validaVOUsuario(VOUser vo) {
	if (vo.getUsuario().equals("omar") && vo.getPassword().equals("12345678")) {
		vo.setUsuarioValido(true);
	}
	return vo;
}
}
