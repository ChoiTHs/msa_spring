package edu.kosa.team1.model;

import java.util.Date;

public interface MemberDAO {
	public boolean isMember(String id, String passwd);
	public void regester(String id, String passwd, String name, String jumin1, String jumin2);
	
}
