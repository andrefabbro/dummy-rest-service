package com.liferay.symposium;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;

public class AplicacaoPrincipal {

    public static void main(final String[] args) throws Exception {
        Server server = new Server(9090);

        ServletHolder servletHolder = new ServletHolder(new ServletContainer());
        servletHolder.setInitParameter(ServerProperties.PROVIDER_PACKAGES,
                "com.liferay.symposium.api");
        servletHolder.setInitOrder(1);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        context.addServlet(servletHolder, "/*");

        server.setHandler(context);
        server.start();
        server.join();
    }

}
