package HibernateAssignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int bid;
private String name;
private int price;

public Book() {
	// TODO Auto-generated constructor stub
}

public Book(int bid, String name, int price) {
	super();
	this.bid = bid;
	this.name = name;
	this.price = price;
}

public int getBid() {
	return bid;
}

public void setBid(int bid) {
	this.bid = bid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}




}
