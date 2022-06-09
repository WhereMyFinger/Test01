package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class News implements INews {
	
	private int id;
	private String title;
	private String publicDate;
	private String author;
	private String content;
	private float averageRate;
	
	int[] rateList = new int[3];
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublicDate() {
		return publicDate;
	}
	
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public float getAverageRate() {
		return averageRate;
	}
	
	public int[] getRateList() {
		return rateList;
	}

	public void setRateList(int[] rateList) {
		this.rateList = rateList;
	}


	@Override
	public void display() {
		System.out.println("Title: " + getTitle());
		System.out.println("Publish date: " + getPublicDate());
		System.out.println("Author: " + getAuthor());
		System.out.println("Content: " + getContent());
		System.out.println("AverageRate: " + getAverageRate());
	}
	
	public void caculate(int[] rateList) {
		this.averageRate = (rateList[0] + rateList[1] + rateList[2]) / 3;
	}
	
	public List insertNews() {
		Scanner scanner = new Scanner(System.in);
		
		News news = new News();
		ArrayList<News> arrList = new ArrayList<>();
		System.out.println("title: ");
		news.title = scanner.nextLine();
		news.setTitle(title);
		System.out.println("Publish date: ");
		news.publicDate = scanner.nextLine();
		news.setPublicDate(publicDate);
		System.out.println("Author: ");
		news.author = scanner.nextLine();
		news.setAuthor(author);
		System.out.println("Content: ");
		news.content = scanner.nextLine();
		news.setContent(content);
		System.out.println("Rate list: ");
		for(int i=0; i<3; i++) {
			rateList[i] = scanner.nextInt();
		}
		news.setRateList(rateList);
		arrList.add(news);
		return arrList;
	}
	
	public void viewListNews() {
		System.out.println(insertNews());
	}	
	
	public static void main(String[] agrs) {
		News news = new News();
		System.out.println("1 - Insert news \n 2 - View list news \n 3 - Average rate \n 4 - Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("chon 1 chuc nang: ");
		int menuId = scanner.nextInt();
		boolean cont = true;
		do {
			switch(menuId) {
			case 1:
				news.insertNews();
				break;
			case 2:
				news.viewListNews();
				break;
			case 3:
				news.caculate(news.rateList);
				news.viewListNews();
				break;
			case 4:
				cont = false;
				break;
			}
		}while(cont);		
		
	}
	
}
