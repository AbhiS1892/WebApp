package com.abhi.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.abhi.pojo.LinkShortner;
import com.abhi.service.LinkShortenerService;

@Path("/linkshortener")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LinkShortenerResource {
	LinkShortenerService service = new LinkShortenerService();
	
	@POST
	public String urlFromBody(LinkShortner link){
		String newUrl = service.addingAndConvertingUrl(link);
		String str = "http://localhost:8080/webapp/linkshortener/" + newUrl;
		return str;
	}
	
	@GET
	@Path("/{newUrl}")
	public String getActualUrlResource(@PathParam("newUrl") String url){
		return service.returnActualUrl(url);
	}
	

}
