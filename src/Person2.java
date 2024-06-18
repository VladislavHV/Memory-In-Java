public class Person2 {
    /*
    Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
    чтобы он возвращал строку из name и surname. Объявите метод changePerson, который принимает параметр типа
    Person под названием person. Внутри метода запишите в поле name строку “Ilya”, а в строку surname — “Lagutenko”.
     */

    private String name;
    private String surname;

    public Person2(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public static void changePerson2(Person2 person2){
        person2.setName("Ilya");
        person2.setSurname("Lagutenko");
    }
}
