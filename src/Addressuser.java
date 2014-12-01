import java.util.Scanner;

/**
 * Created by student on 01.12.2014.
 */

public class Addressuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addressbook adrBook = new Addressbook();
        list();
        int com, ind;
        String name, phone, email;

        name = "Максим";
        phone = "89036478722";
        email = "Max66@mail.com";
        Address adr = new Address(name, phone, email);
        adrBook.add(adr);
        name = "Олег";
        phone = "89108876523";
        email = "Oleg32@mail.com";
        adr = new Address(name, phone, email);
        adrBook.add(adr);
        name = "Алексей";
        phone = "89264678799";
        email = "Alex21@mail.com";
        adr = new Address(name, phone, email);
        adrBook.add(adr);

        while (true) {
            com = sc.nextInt();
            switch (com) {
                case 1:
                    System.out.print("Введите имя: ");
                    name = sc.next();
                    System.out.print("Введите номер телефона: ");
                    phone = sc.next();
                    System.out.print("Введите E-mail: ");
                    email = sc.next();
                    adr = new Address(name, phone, email);
                    adrBook.add(adr);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    name = sc.next();
                    int[] find = adrBook.find(name);
                    for (int i = 0; i < find.length; i++) {adrBook.print();}
                    System.out.println();
                    break;
                case 3:
                    adrBook.print();
                    break;
                case 4:
                    System.out.print("Введите индекс удаляемой записи: ");
                    ind = sc.nextInt();
                    adrBook.delete(ind);
                    break;
                case 5:
                    System.out.print("Введите индекс изменяемой записи: ");
                    ind = sc.nextInt();
                    System.out.print("Введите новое имя: ");
                    name = sc.next();
                    System.out.print("Введите новый номер телеона: ");
                    phone = sc.next();
                    System.out.print("Введите новый Email: ");
                    email = sc.next();
                    adrBook.change(ind, name, phone, email);
                    break;
                case 6:
                    System.out.print("Введите индекс записи: ");
                    ind = sc.nextInt();
                    adrBook.get(ind);
                    break;
                case 7:
                    System.out.println("Количество записей в книге: " + adrBook.getCount());
                    break;
                case 8:
                    list();
                    break;
                case 9:
                    return;
                default:
                    System.out.print("Введите корректную команду: ");
            }
        }
    }
    public static void list(){
        System.out.println("Введите номер команды: \n" +
                "1.Добавить запись\n" +
                "2.Поиск записей\n" +
                "3.Вывод всех записей\n" +
                "4.Удаление записи\n" +
                "5.Изменение записи\n" +
                "6.Вывести запись по индексу\n" +
                "7.Вывести количество записей в книге\n" +
                "8.Вывести меню пользователя\n" +
                "9.Выход из программы\n");
    }
}