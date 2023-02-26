package com.gitdeveloper2.ERP;

import com.gitdeveloper2.ERP.logutils.MyLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class ErpApplication {


	public static void main(String[] args) {

		Logger logger=new MyLogger().createLogger();
		logger.log(Level.INFO,"Running");
		SpringApplication.run(ErpApplication.class, args);
	}

}
