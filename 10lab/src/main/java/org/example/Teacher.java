package org.example;

/*2. “Teacher” — поля: “name”, “experience”, “subject”*/
public class Teacher implements Teachable, Workable {
    private String name;
    private int experience;
    private String subject;
    private int students;

    public Teacher(String name, int experience, String subject, int students) {
        this.name = name;
        this.experience = experience;
        this.subject = subject;
        this.students=students;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSubject(String subject) {
        this.subject=subject;
    }

    @Override
    public void teach(){
        System.out.println("Учитель " + name + " учит студентов предмету " + subject);
        students += 1;
    }
    @Override
    public int getExperience(){
        return experience;
    }
    @Override
    public void work(){System.out.println("Я работаю!");}

    @Override
    public int getStudents(){return students;}

}
