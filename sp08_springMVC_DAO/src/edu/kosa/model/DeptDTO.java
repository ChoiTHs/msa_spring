package edu.kosa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptDTO {  // model  ~VO,  ~DTO,  ~TO
	
	private int deptno;
	private String dname, loc;
}
