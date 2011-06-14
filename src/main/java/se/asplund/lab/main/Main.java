/**
 * 
 */
package se.asplund.lab.main;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author anders
 *
 */
public class Main {
	
	private Date date;
	private String greetings;

	@Autowired
	public Main(Date date, String greetings) {
		this.date = date;
		this.greetings = greetings;
		System.out.println("Hello " + this.greetings + "! Today is " + this.date);
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getGreetings() {
		return greetings;
	}
}
