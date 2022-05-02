package jm.task.core.jdbc.util;

//Вариант с отдельным утилитным классом c использованием XML-конфига. Создан с пометками в самообразовательных целях.
//Создаем утилитный класс для hibernate, в котором инициализируются: фабрика и реестр сервисов.
public class HibernateUtil {

    /*private static SessionFactory sessionFactory; // Создание переменной фабрики сессии (настройка и работа с сессиями)

    //Статический блок, который автоматически проинициализируется при загрузке класса HibernateUtil
    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder() //Создание регистра сервисов
                .configure() //Загрузка настроек из hibernate.cfg.xml (размещен в main/resources (автоматом присутствует в classpath, поэтому указывать путь не нужно)
                .build(); //Получение реестра сервисов.
        try {
            //Инициализируем фабрику, передав ей все нужные параметры:
            sessionFactory = new MetadataSources(registry) //MetadataSources - специальный объект для работы с метаданными маппинга объектов, ему передаем регистр сервисов
                    .buildMetadata() //Создаем этот объект
                    .buildSessionFactory(); //Создаем фабрику, которая полностью настроена.
        } catch (Exception e) {
            //Регистр будет удален фабрикой, но если возникла проблема при создании фабрики, то регистр нужно уничтожить вручную
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    //Статик метод для получения созданной и полностью настроенной фабрики -> получаем инструмент для открытия сессий
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/
}
