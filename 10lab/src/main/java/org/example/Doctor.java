package org.example;

/*1. “Doctor” — поля: “name”, “experience”, “specialization”*/
public class Doctor implements Workable {
    private String name;
    private int experience;
    private String specialization;

    public Doctor(String name, int experience, String specialization) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void work(){
        System.out.println(name+" работает. Он врач-"+specialization);
    }
    @Override
    public int getExperience(){
        return experience;
    }
}
