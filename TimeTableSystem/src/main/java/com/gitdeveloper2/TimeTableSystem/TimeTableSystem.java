package com.gitdeveloper2.TimeTableSystem;

import com.gitdeveloper2.TimeTableSystem.logutils.MyLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class TimeTableSystem {


	public static void main(String[] args) {

		Logger logger=new MyLogger().createLogger();
		logger.log(Level.INFO,"Running");
		SpringApplication.run(TimeTableSystem.class, args);
	}

}
