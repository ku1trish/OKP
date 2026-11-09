package org.example;
public class Main {
    static void main() {
        Teacher[] teachers = {
                new Teacher("Юрий Хованский", 5, "Русский язык и литература",52),
                new Teacher("Андрей Пирокенезис", 2, "Ядерная физика", 42)
        };
        Doctor[] docs={
                new Doctor("Кирилл Освянскин", 40, "венеролог"),
                new Doctor("Мирон Янович", 19, "педиатр"),
                new Doctor("Владислав Калюка", 150, "патологоанатом"),
        };
        System.out.println("Наши учителя: ");
        for(int i=0; i<teachers.length; i++){
            Teacher t = teachers[i];
            t.work();
            t.teach();
            System.out.println("Стаж: "+t.getExperience());
            System.out.println("Учит "+t.getStudents()+" учеников");
        }
        System.out.println("Наши специалисты: ");
        for(int i=0; i<docs.length; i++){
            Doctor d = docs[i];
            d.work();
            System.out.println("Стаж: "+d.getExperience());
        }
    }
}
