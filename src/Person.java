public abstract class Person {
    private int person;
    private int energy;
    private int musor;
    private int watter;
    private int comUsluga;

private int number;
    public Person(int person, int energy, int musor, int watter,int comUsluga) {
        this.person = person;
        this.energy = energy;
        this.musor = musor;
        this.watter = watter;
        this.comUsluga=comUsluga;

    }

    public Person(int person, int energy, int musor, int watter) {
        this.person = person;
        this.energy = energy;
        this.musor = musor;
        this.watter = watter;
    }

    public Person(int person,int number) {
        this.person=person;
        this.number=number;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMusor() {
        return musor;
    }

    public void setMusor(int musor) {
        this.musor = musor;
    }

    public int getWatter() {
        return watter;
    }

    public void setWatter(int watter) {
        this.watter = watter;
    }

    @Override
    public String toString() {
        return getClass() +
                "  person=" + person +
                ", energy=" + energy +
                ", musor=" + musor +
                ", watter=" + watter +
                '}';
    }
}
