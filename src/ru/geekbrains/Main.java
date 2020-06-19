package ru.geekbrains;


/*1. Разобраться с имеющимся кодом;
        2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
        (т.е. в конструкторе можно сразу всех участников указывать),
        метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
        3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
        метод который будет просить команду пройти всю полосу;
        То есть в итоге должно быть:
public static void main(String[] args) {
        Course c = new Course(...); // Создаем полосу препятствий
        Team team = new Team(...); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
        }*/

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
/*        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Water(5), new Wall(1), new Cross(120)};
        for (Competitor c : competitors)
        {
            for (Obstacle o : course)
            {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors)
        {
            c.info();
        }*/

        Team team = new Team("Юг", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Иван"));
        Course course = new Course(new Cross(80), new Water(5), new Wall(1), new Cross(120));
        course.doIt(team);
    }
}
