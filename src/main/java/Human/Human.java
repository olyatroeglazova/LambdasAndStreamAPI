package Human;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private Gender gender;

    public Human(){
    }

    public Human(String surname, String name, String patronymic, int age, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
    }

    public Human(Human human) {
        surname = human.surname;
        name = human.name;
        patronymic = human.patronymic;
        age = human.age;
        gender = human.gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public String getFullName(){
        return getSurname()+" "+getName()+" "+getPatronymic();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (patronymic != null ? !patronymic.equals(human.patronymic) : human.patronymic != null) return false;
        return gender == human.gender;
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
