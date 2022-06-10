package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class News implements INews {

	public static final int size = 3;
	
	private int id;
	private String title;
	private String publicDate;
	private String author;
	private String content;
	private float averageRate;
	
	int[] rateList = new int[size];

	static ArrayList<News> arrList = new ArrayList<>();
	
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
		System.out.println("Title: " + title);
		System.out.println("Publish date: " + publicDate);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
		System.out.println("AverageRate: " + averageRate);
	}
	
	public float caculate(int[] rateList) {
		int sum = 0;
		for(int i=0; i<size; i++){
			sum += rateList[i]; 
		}
		return averageRate = sum / 3;
	}

	public void showMenu() {
		System.out.println("1 - Insert news \n 2 - View list news \n 3 - Average rate \n 4 - Exit");
	}
	
	public ArrayList insertNews() {
		Scanner scanner = new Scanner(System.in);
		
		News news = new News();
		System.out.println("title: ");
		news.title = scanner.nextLine();
		System.out.println("Publish date: ");
		news.publicDate = scanner.nextLine();
		System.out.println("Author: ");
		news.author = scanner.nextLine();
		System.out.println("Content: ");
		news.content = scanner.nextLine();
		System.out.println("Rate list: ");
		for(int i=0; i<ize; i++) {
			rateList[i] = scanner.nextInt();
		}
		arrList.add(news);
		return arrList;
	}
	
	public void viewListNews() {
		for(News n : arrList) {
			n.display;
		}
	}	
	
	public static void main(String[] agrs) {
		News news1 = new News();
		news1.display
		Scanner scanner = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("chon 1 chuc nang: ");
			int menuId = scanner.nextInt();
			switch(menuId) {
			case 1:
				news1.insertNews();
				break;
			case 2:
				news1.viewListNews();
				break;
			case 3:
				news1.caculate(news1.rateList);
				news1.viewListNews();
				break;
			case 4:
				System.out.println("Good bye!");
				cont = false;
				break;
			}
		}while(cont);		
		
	}
	
}
