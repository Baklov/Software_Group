package com.ivo.camel;

import java.sql.ConnectionBuilder;

import org.apache.camel.CamelContext;import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloCamel {
	
	public static void main(String[] args) {
		CamelContext context = new DefaultCamelContext();
		var k =10;
		ConnectionFactory connectionFactory = new ActiveMQConnetcionFactory();
		
		try {
			context.addRoutes(new RouteBuilder() {
				
				@Override
				public void configure() throws Exception {
					// TODO Auto-generated method stub
					System.out.println("Hello Camel");
					from("file:input_box?noop=true").
					to("");
					
				}
			});
			context.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
