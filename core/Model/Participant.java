package core.Model;

import core.Utils.Date;

public class Participant  extends Users{
	
	public Participant(String name, String email, String password, Date dateOfBirth) {
		super(name, email, email, dateOfBirth);
	}
}
