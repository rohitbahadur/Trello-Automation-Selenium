package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfig {

	public static Properties prop = new Properties();

	static {
		try {
			File file = new File("src\\test\\java\\config\\ProjectConfig.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

		/*
		 * public class URL { public static final String appUrl = "https://trello.com";
		 * }
		 * 
		 * public class AccessDetails { public static final String userName =
		 * "*********@gmail.com"; public static final String passWord =
		 * "******"; }
		 */
	}
}

