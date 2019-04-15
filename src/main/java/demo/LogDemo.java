package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {
	//定义一个全局的记录器，通过LoggerFactory获取
	private static final Logger logger = LoggerFactory.getLogger(LogDemo.class); 
   
	public static void main(String[] args) {
		logger.trace("trace 成功了");
		logger.debug("debug 成功了");
		logger.info("logback 成功了");
		logger.warn("warn 成功了");
		logger.error("logback 成功了");
	}
}
