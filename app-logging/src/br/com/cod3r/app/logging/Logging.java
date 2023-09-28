package br.com.cod3r.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logging {

	public static void info(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aa HH:mm:ss");
		System.out.println("[INFO] " + sdf.format(new Date())
				+ " - " + msg);
	}
	
}
