package org.example;

class Engineer extends Professional {
    private String project;

    public Engineer(String name, int experience, int rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Проектирует системы.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Проект: " + project);
    }

    public void design() {
        System.out.println("Работает над проектом: " + project);
    }
}
