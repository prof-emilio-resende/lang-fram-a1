package fit.oo;

interface Thinker {
    String think();
}

class Person implements Thinker {
    private String name;
    private String cpf;

    public Person() {
        super();
    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Person( name=[{%s}] cpf=[{%s}])", this.name, this.cpf);
    }

    @Override
    public String think() {
        return "I'm hungry...";
    }

    // BELOW THIS POINT, JUST GETTERS AND SETTERS

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Philosopher extends Person {
    public Philosopher() {
        super();
    }

    public Philosopher(String name, String cpf) {
        super(name, cpf);
    }

    @Override
    public String think() {
        return "Very smart, eh?";
    }
}

public class Objects {
    public static void playOO() {
        var someone = new Person("Anybody", "333");
        someone.setCpf("333");
        System.out.println(someone.think());
        System.out.println(someone);

        var socrates = new Philosopher("Socrates", "444");
        socrates.setCpf("999");
        System.out.println(socrates.think());
        System.out.println(socrates);
    }
}
