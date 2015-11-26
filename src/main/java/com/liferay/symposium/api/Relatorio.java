package com.liferay.symposium.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("relatorio")
public class Relatorio {

    @GET
    @Produces({"text/plain"})
    @Path("/process/{id}")
    public String process(@PathParam("id") int reportId) {

        int sleepTime = 5000;

        try {

            System.out.println(Thread.currentThread().getId()
                    + ": Processando relatorio id " + reportId);

            Thread.currentThread();
            Thread.sleep(sleepTime);

        } catch (Exception e) {
            return "-1";
        }

        return "1";
    }

    @GET
    @Produces({"text/plain"})
    @Path("/process/{id}/section/{section}")
    public String processSection(@PathParam("id") int reportId,
                                 @PathParam("section") String section) {

        int sleepTime = 5000;

        try {
            System.out.println(Thread.currentThread().getId()
                    + ": Processing relatorio id " + reportId + " sessao "
                    + section);

            Thread.currentThread();
            Thread.sleep(sleepTime);

        } catch (Exception e) {
            return "-1";
        }

        return "1";
    }
}