package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {
	//����һ��ȫ�ֵļ�¼����ͨ��LoggerFactory��ȡ
	private static final Logger logger = LoggerFactory.getLogger(LogDemo.class); 
   
	public static void main(String[] args) {
		logger.trace("trace �ɹ���");
		logger.debug("debug �ɹ���");
		logger.info("logback �ɹ���");
		logger.warn("warn �ɹ���");
		logger.error("logback �ɹ���");
	}
}
