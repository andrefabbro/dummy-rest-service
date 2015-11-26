package com.liferay.symposium.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("relatorio")
public class Relatorio {

    @GET
    @Produces({"text/plain"})
    @Path("/processar/{id}/secao/{secao}")
    public String processarSecao(@PathParam("id") int reportId,
                                 @PathParam("secao") String secao) {

        int tempoDeEspera = 5000;

        try {

            long start = System.currentTimeMillis();

            System.out.println(start + " - " + Thread.currentThread().getId()
                    + ": Processando relatorio id " + reportId + " secao "
                    + secao);

            Thread.currentThread();
            Thread.sleep(tempoDeEspera);

        } catch (Exception e) {
            return "-1";
        }

        return "1";
    }
}