public class Person {
    /*
    Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
    чтобы он возвращал строку из name и surname. Объявите метод changePerson, который принимает параметр
    типа Person под названием person. Внутри метода с помощью оператора присваивания запишите в параметр новый
    объект типа Person. Присвойте строке name значение Ilya, строке surname— значение Lagutenko.
     */

    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }

    public static void changePerson(Person person){
        person = new Person("Ilya", "Lagutenko");
    }
}
