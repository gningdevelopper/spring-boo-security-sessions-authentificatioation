package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data  @AllArgsConstructor @NoArgsConstructor
public class Task {
	@Id @GeneratedValue
	private long id;
	private String taskName;
	public Task( String taskName) {
		
		this.taskName = taskName;
	}
	//public Task() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + "]";
	}
	
	
	
}
