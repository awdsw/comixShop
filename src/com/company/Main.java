package com.company;


import java.io.IOException;
import java.util.*;


public class Main {

    static Comics comix;
    static Password pass;

    public static void main(String[] args) throws IOException {
        Comics comics = new Comics();
        Password password = new Password();
        Scanner scanner = new Scanner(System.in);
        int select;
        ArrayList<Comics> db = new ArrayList<>();
        ArrayList<Comics> dbForSell = new ArrayList<>();
        ArrayList<Comics> dbForOffs = new ArrayList<>();
        ArrayList<Comics> dbStocks = new ArrayList<>();
        ArrayList<Comics> dbPerson = new ArrayList<>();

        db.add(new Comics("Darknes","DarkMan","Top Cow","254","mystic","2007","220", "221", "no"));
        db.add(new Comics("Robocop","Robot","Avatar Press","300","cyberpunk","2003","200", "250","no"));
        db.add(new Comics("Archer & Armstrong","AA","Valiant Comics","221","superhero","2012", "200", "240","no"));
        db.add(new Comics("Kick-Ass1","Kick","Icon Comics","230","Comedy","2013", "200", "230","no"));
        db.add(new Comics("Kick-Ass2","Kick","Icon Comics","210","Comedy","2014", "200", "210","yes"));
        db.add(new Comics("Stormwatch","Vol1","Image Comics","211","action","1997", "200", "235","no"));

        pass = new Password();
        pass.logIn();

        do {
            System.out.println("1 - Добавить комикс");
            System.out.println("2 - Удалить комикс");
            System.out.println("3 - Поиск комикса по автору");
            System.out.println("4 - Редактирование комикса");
            System.out.println("5 - Продать комикс"); //add dbSpell
            System.out.println("6 - Списать комикс"); // add dbspisat
            System.out.println("7 - Акции на комиксы");
            System.out.println("8 - Save comix on Person");
            System.out.println("9 - Показать имеющиеся комиксы/Проданные/Списанные/Акционные");

            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Добавьте комикс");
                    comix = new Comics();
                    comix.FillComics();
                    db.add(0, comix);
                    break;
                case 2:
                    System.out.println("Удалите комикс");
                    int count1 = 0;
                    for (Comics element : db) {
                        System.out.println(count1++ + ") " + element.getAuthor());
                    }
                    System.out.print("Введите индекс для удаления: ");
                    int index1 = scanner.nextInt();
                    db.remove(index1);
                    break;
                case 3:
                    System.out.println("Введите автора комикса: ");
                    String s = scanner.next();
                    for (Comics element : db) {
                        if (element.getAuthor().contains(s)) {
                            System.out.println("Автор " + s + " существует : \n" + element);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выберите комикс для редктирования: ");

                    int count2 = 0;
                    for (Comics element : db) {
                        System.out.println(count2++ + ") " + element.getTitle());
                    }
                    System.out.print("Enter index for change : ");
                    int index2 = scanner.nextInt();

                    System.out.println( "  \n -1- Название комикса: "
                            + "\n -2- Автор комикса: "
                            + "\n -3- Издатель комикса: "
                            + "\n -4- Количество страниц: "
                            + "\n -5- Жанр: "
                            + "\n -6- Год издания: "
                            + "\n -7- Себестоимость: "
                            + "\n -8- Цена: "
                            + "\n -9- Продолжение: ");

                    System.out.println("Выберите параметр для редактирования: ");
                    int index = scanner.nextInt();
                           scanner = new Scanner(System.in);
                    switch (index){
                        case 1:
                            System.out.println("Введите новое название: ");
                            db.get(index2).setTitle(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Введите нового атора: ");
                            db.get(index2).setAuthor(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Введите нового издателя: ");
                            db.get(index2).setEditor(scanner.nextLine());
                            break;

                        case 4:
                            System.out.println("Введите новое количетсво страниц: ");
                            db.get(index2).setPages(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("Введите новый жанр: ");
                            db.get(index2).setType(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("Введите новый год издания: ");
                            db.get(index2).setDate(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("Введите новую себестоимость: ");
                            db.get(index2).setCost(scanner.nextLine());
                            break;
                        case 8:
                            System.out.println("Введите новую цену: ");
                            db.get(index2).setSale(scanner.nextLine());
                            break;
                        case 9:
                            System.out.println("Введите является ли комикс продолжением другого комикса: ");
                            db.get(index2).setSeries(scanner.nextLine());
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Выберите комикс для продажи: ");
                    int count3 = 0;
                    for (Comics element : db) {
                        System.out.println(count3++ + ") " + element.getAuthor());
                    }
                    System.out.print("Введите индекс для продажи: ");
                    int index3 = scanner.nextInt();
                    dbForSell.add(db.get((index3)));
                    db.remove(index3);
                    break;
                case 6:
                    System.out.println("Выберите комикс для списания: ");
                    int count4 = 0;
                    for (Comics element : db) {
                        System.out.println(count4++ + ") " + element.getAuthor());
                    }
                    System.out.print("Введите индекс для списания: ");
                    int index4 = scanner.nextInt();
                    dbForOffs.add(db.get((index4)));
                    db.remove(index4);
                    break;
                case 7:
                    System.out.println("Выберите комикс для акции 10% скидка: ");
                    int count5 = 0;
                    for (Comics element : db) {
                        System.out.println(count5++ + ") " + element.getAuthor());
                    }
                    System.out.print("Введите индекс для скидки 10%: ");
                    int index5 = scanner.nextInt();
                    //dbStocks.get(index5).setSale();
                    dbStocks.add(db.get((index5)));
                    db.remove(index5);
                    break;
                case 8:
                    System.out.println("Выберите комикс для того чтобы отложить: ");
                    int count6 = 0;
                    for (Comics element : db) {
                        System.out.println(count6++ + ") " + element.getAuthor());
                    }
                    System.out.print("Введите индекс для того чтобы отложить: ");
                    int index6 = scanner.nextInt();
                    dbPerson.add(db.get((index6)));
                    db.remove(index6);
                    break;
                case 9:
                    System.out.println("Выберите параметр для просмотра: ");
                    System.out.println( "  \n -1- Имеющиеся комиксы: "
                            + "\n -2- Проданные комиксы: "
                            + "\n -3- Списанные комиксы: "
                            + "\n -4- Акционные комиксы: ");
                    int index7 = scanner.nextInt();
                    scanner = new Scanner(System.in);
                    switch (index7) {
                        case 1:
                            System.out.println("Имеющиеся комиксы: ");
                            for (Comics element : db) {
                                System.out.println(element);
                            }
                            break;
                        case 2:
                            System.out.println("Проданные комиксы: " + dbForSell);
                            break;
                        case 3:
                            System.out.println("Списанные комиксы: " + dbForOffs);
                            break;
                        case 4:
                            System.out.println("Акционные комиксы: " + dbStocks);
                            break;
                    }
                    break;
                case 10:
                    System.out.println("Выберите комикс для записи в Файл: ");

                default:
                    System.out.println("You wrong select");
                    break;
            }
        } while (true);
    }
}