package com.example.accessingdatamysql;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Sprint {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @OneToMany(mappedBy = "sprint")
  private List<Ticket> tickets;

  @ManyToOne
  @JoinColumn(name="board_id")
  private Board board;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

public List<Ticket> getTickets() {
	return tickets;
}

public void setTickets(List<Ticket> tickets) {
	this.tickets = tickets;
}

public Board getBoard() {
	return board;
}

public void setBoard(Board board) {
	this.board = board;
}
}