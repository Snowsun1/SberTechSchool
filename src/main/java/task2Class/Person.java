package task2Class;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man && this.spouse != person) {
            if (this.spouse != null) {
                this.divorce();
            }
            if (person.spouse != null) {
                person.divorce();
            }
            this.spouse = person;
            person.spouse = this;
            return true;

        } else return false;
    }

    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("Имя - " + this.name);
        if (this.man) {
            System.out.println("Пол - женский");
        } else System.out.println("Пол - мужской");
        if (this.spouse != null) {
            System.out.println("В браке с " + this.spouse.name);
        } else System.out.println("Не состоит в браке");
    }

}
