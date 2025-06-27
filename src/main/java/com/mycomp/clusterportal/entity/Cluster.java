package com.mycomp.clusterportal.entity;

import jakarta.persistence.*;

@Entity
public class Cluster {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private int serverCount;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getServerCount() {
	return serverCount;
}
public void setServerCount(int serverCount) {
	this.serverCount = serverCount;
}
}