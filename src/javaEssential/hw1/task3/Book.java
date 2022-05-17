package javaEssential.hw1.task3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        Scanner sc = new Scanner(System.in);
        System.out.println("Add the book to your library.");
        System.out.print("Author: " );
        author.setAuthor(sc.nextLine());
        System.out.print("Content: ");
        content.setContent(sc.nextLine());
        System.out.print("Title: ");
        title.setTitle(sc.nextLine());
        author.showAuthor();
        content.showContent();
        title.showTitle();
    }
}
