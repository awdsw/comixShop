package com.company;
import java.util.Scanner;

public class Comics {
    private String title;
    private String author;
    private String editor;
    private String pages;
    private String type;
    private String date;
    private String cost;
    private String sale;
    private String series;
    private  boolean isNew;

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    public Comics(String title, String author, String editor, String pages, String type, String date, String cost, String sale, String series) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pages = pages;
        this.type = type;
        this.date = date;
        this.cost = cost;
        this.sale = sale;
        this.series = series;
    }

    public Comics() {

    }

   Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        if (isNew){
            return getTitle() + " " + getAuthor() + " " + getEditor()
                    + " " + getPages() + " " + getType() + " " + getDate() + " " + getCost() +
                    " " + getSale() + " " + getSeries() + " NEW!!!";
        }else{
            return getTitle() + " " + getAuthor() + " " + getEditor()
                    + " " + getPages() + " " + getType() + " " + getDate() + " " + getCost() +
                    " " + getSale() + " " + getSeries();
        }

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

  public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }


    public void FillComics(){
        scanner = new Scanner(System.in);
        System.out.println("Новый комикс?\n1 - Да\n2 - Нет");
        int num = scanner.nextInt();
        if (num==1){
            isNew=true;
        }else{
            isNew=false;
        }

        System.out.println("Введите название: ");
        title=scanner.next();
        System.out.println("Введите автора: ");
        author=scanner.next();
        System.out.println("Введите название издательства: ");
        editor=scanner.next();
        System.out.println("Введите количество страниц: ");
        pages=scanner.next();
        System.out.println("Введите жанр: ");
        type=scanner.next();
        System.out.println("Введите год издания: ");
        date=scanner.next();
        System.out.println("Введите себестоимость: ");
        cost=scanner.next();
        System.out.println("Введите цену для продажи: ");
        sale=scanner.next();
        System.out.println("Является ли комикс продолжением другого комикса: ");
        series=scanner.next();
    }
}