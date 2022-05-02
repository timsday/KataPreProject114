package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //Удаление таблицы (добавлено от себя для теста следующего пункта)
        //userService.dropUsersTable();

        //Создание таблицы User(ов)
        userService.createUsersTable();
        //Добавление 4 User(ов) в таблицу с данными на свой выбор.
        //После каждого добавления должен быть вывод в консоль (User с именем – name добавлен в базу данных)
        userService.saveUser("John", "Wick", (byte) 42);
        userService.saveUser("Freddy", "Mercury", (byte) 82);
        userService.saveUser("Bob", "Dylan", (byte) 43);
        userService.saveUser("Curt", "Cobain", (byte) 27);

        //Удаление User из таблицы (добавлено от себя для теста)
        //userService.removeUserById(2);

        //Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        System.out.println(userService.getAllUsers());
        //Очистка таблицы User(ов)
        userService.cleanUsersTable();
        //Удаление таблицы
        userService.dropUsersTable();
    }
}
