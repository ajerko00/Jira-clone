package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Ticket {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name="assignee_id")
  private User user_assignee;

  @ManyToOne
  @JoinColumn(name="reporter_id")
  private User user_reporter;

  @ManyToOne
  @JoinColumn(name="sprint_id")
  private Sprint sprint;

  @ManyToOne
  @JoinColumn(name="tag_id")
  private Tag tag;
  

  private String heading;

  private Character priority;

  private Integer estimate;

  private String description;

  private String status;

  // private date date_created;
  // private date date_last_change;

  // GETTERS & SETTERS 

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public Character getPriority() {
    return priority;
  }

  public void setPriority(Character priority) {
    this.priority = priority;
  }

  public Integer getEstimate() {
    return estimate;
  }

  public void setEstimate(Integer estimate) {
    this.estimate = estimate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

public User getUser_assignee() {
	return user_assignee;
}

public void setUser_assignee(User user_assignee) {
	this.user_assignee = user_assignee;
}

public User getUser_reporter() {
	return user_reporter;
}

public void setUser_reporter(User user_reporter) {
	this.user_reporter = user_reporter;
}

public Sprint getSprint() {
	return sprint;
}

public void setTag(Sprint sprint) {
	this.sprint = sprint;
}

public Tag getTag() {
	return tag;
}

public void setTag(Tag tag) {
	this.tag = tag;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
}