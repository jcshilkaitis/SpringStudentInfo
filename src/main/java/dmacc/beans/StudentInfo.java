package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 29, 2022
 */
@Entity
@Data
@NoArgsConstructor
public class StudentInfo {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String beltRank;
	private int age;

	public StudentInfo(String name, String beltRank, int age) {
		super();
		this.name = name;
		this.beltRank = beltRank;
		this.age = age;
	}
	public StudentInfo(long id, String name, String beltRank, int age) {
		super();
		this.id = id;
		this.name = name;
		this.beltRank = beltRank;
		this.age = age;
	}
	
	
}
