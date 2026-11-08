package org.example;

/*Структура каждого задания:
        1. Интерфейсы (2-3 интерфейса) с:
        - 2-3 абстрактными методами
- 1 статическим методом (опционально)
2. Классы-реализации (2-3 класса), которые:
        - реализуют все интерфейсы
- имеют собственные поля
- реализуют все абстрактные методы
3. класс:
        - массив/список интерфейсного типа
- объекты разных классов


18. Профессии
Интерфейсы:
1. “Workable” — методы: “work()”, “getExperience()”
2. “Teachable” — методы: “teach()”, “getStudents()”
Классы:
1. “Doctor” — поля: “name”, “experience”, “specialization”
2. “Teacher” — поля: “name”, “experience”, “subject”
Задание: Создайте 3 доктора и 2 учителя, работайте и учите.*/

public interface Workable {

    public abstract void work();
    public abstract int getExperience();
}
