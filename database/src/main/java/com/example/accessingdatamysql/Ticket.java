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
  @JoinColumn(name="board_id")
  private Board board;

  /*
  @ManyToOne
  @JoinColumn(name="tag_id")
  private Tag tag;
  */
  
  // private String name;

  private String heading;

  private Character priority;

  private Integer estimate;

  // private String tags;

  private String comment;

  private String status;

  // GETTERS & SETTERS 

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  /*
  public String getName() {
    return name;
  }

  public void setName() {
    this.name = "Jira-" + this.getId();
  }
  */
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }
  /*
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
  */
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
  /*
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }
  */
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}