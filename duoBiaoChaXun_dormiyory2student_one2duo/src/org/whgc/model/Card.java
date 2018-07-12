package org.whgc.model;

public class Card {
	private  String cardid;
	private String cardtype;
	private int money;
	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	private Student s;
	
	public Card() {
		super();
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}


	

}


//select * from card 
//select a.x from card a inner join student b on a.stuid=b.stuid where a.cardid='000001'