public class Main {
    /*
    Напишите метод, который изменяет значение переменной типа int. Объявите метод changeValue, который
    принимает параметр типа int под названием value. Внутри метода с помощью оператора присваивания запишите
    в параметр значение 22.
     */

    public static int changeValue(int value){
        value = 22;
        return value;
    }

    /*
    Напишите метод, который изменяет значение переменной типа Integer. Объявите метод changeValue,
    который принимает параметр типа Integer под названием value. Внутри метода с помощью оператора присваивания
    запишите в параметр значение 22.
     */

    public static Integer changeValue(Integer value2){
        value2 = 22;
        return value2;
    }

    /*
    Напишите метод, который изменяет значение массива типа Integer. Объявите метод changeValue,
    который принимает параметр массива типа Integer под названием value. Внутри метода с помощью оператора
    присваивания запишите в параметр новый массив {1,2}.
     */

    public static Integer[] changeValue(Integer[] value3){
        value3 = new Integer[]{1, 2};
        return value3;
    }

    /*
    Напишите метод, который изменяет значение массива типа Integer. Объявите метод changeValue,
    который принимает параметр массива типа Integer под названием value. Внутри метода с помощью оператора
    присваивания запишите в первую ячейку параметра цифру 99.
     */

    public static Integer[] changeValue2(Integer[] value4){
        value4[0] = 99;
        return value4;
    }

    /*
    В методе main объявите переменную типа int под названием value и запишите туда значение 33.
    В следующей строке вызовите метод changeValue и передайте в него эту переменную.
     */

    public static void main(String[] args){
        int value = 33;
        changeValue(value);
        System.out.println(value);

        /*
    В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
    В следующей строке вызовите метод changeValue и передайте в него эту переменную.
     */

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        /*
    В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
    В следующей строке вызовите метод changeValue и передайте в него этот массив.
     */

        Integer[] value3 = {3, 4};
        changeValue(value3);
        for (int x = 0; x < value3.length; x++){
            System.out.print(value3[x]);
        }

        System.out.println("");
        /*
        В методе main объявите массив типа Integer под названием value и запишите туда значение
        {3,4}. В следующей строке вызовите метод changeValue и передайте в него этот массив.
         */

        Integer[] value4 = {3, 4};
        changeValue2(value4);
        for (int x = 0; x < value4.length; x++){
            System.out.print(value4[x]);
        }

        System.out.println("");
        /*
        В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
        В следующей строке вызовите метод changePerson и передайте в него эту переменную.
         */

        Person person = new Person("Lyapis", "Trubetskoy");
        Person.changePerson(person);
        System.out.println(person);

        /*
        В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        Присвойте значение имени Lyapis, фамилии — Trubetskoy.
        В следующей строке вызовите метод changePerson и передайте в него эту переменную.
         */

        Person2 person2 = new Person2("Lyapis", "Trubetskoy");
        Person2.changePerson2(person2);
        System.out.println(person2);
    }
}