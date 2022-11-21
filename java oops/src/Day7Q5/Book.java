package Day7Q5;

public class Book {
String name;
int price;
String author;
int isbn;
String publication;

public Book(String name, int price, String author, int isbn, String publication) {
	super();
	this.name = name;
	this.price = price;
	this.author = author;
	this.isbn = isbn;
	this.publication = publication;

}
public Book() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + ", author=" + author + ", isbn=" + isbn + ", publication="
			+ publication + "]";
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
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
}