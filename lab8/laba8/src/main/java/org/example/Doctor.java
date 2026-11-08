package org.example;

class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, int rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Лечит пациентов.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Специализация " + specialization);
    }

    public void diagnose() {
        System.out.println("У пациентa аллергия на пенициллин.");
    }

}
