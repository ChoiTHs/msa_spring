package edu.kosa.team1.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembersVO {
	private String id, passwd, name, jumin1, jumin2;
	private Date reg_date;
}
