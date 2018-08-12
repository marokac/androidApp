package com.cedmaan.shoppigapp;

public class Item {
private String name;
private String imagename;
private String price;
public Item(String name,String imagename,String price){
	this.name=name;
	this.imagename=imagename;
	this.price=price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImagename() {
	return imagename;
}
public void setImagename(String imagename) {
	this.imagename = imagename;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}

}
