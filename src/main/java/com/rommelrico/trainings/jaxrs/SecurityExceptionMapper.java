package com.rommelrico.trainings.jaxrs;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.springframework.security.access.AccessDeniedException;

public class SecurityExceptionMapper implements ExceptionMapper<AccessDeniedException> {

	public Response toResponse(AccessDeniedException exception) {
		return Response.status(Response.Status.FORBIDDEN).build();
	}

}
