package org.example;

public class Main {
    static void main() {
        Professional[] prof = new Professional[5];
        prof[0] = new Doctor("Иван Иванов", 10, 95, "Хирург");
        prof[1] = new Doctor("Мария Иванова",  5, 88, "Педиатрия");
        prof[2] = new Doctor("Олег Смирнов",  15, 92, "Хирургия");
        prof[3] = new Engineer("Анна Сидорова", 7, 90, "Умный дом");
        prof[4] = new Engineer("Павел Кузнецов", 12, 85, "Робототехника");

        for(Professional p : prof){
            p.displayInfo();
            p.work();
            if (p instanceof Doctor){
                Doctor doc = (Doctor) p;
                doc.diagnose();}
            else if(p instanceof Engineer){
                Engineer eng = (Engineer) p;
                eng.design();
            }
        }
        }
    }
