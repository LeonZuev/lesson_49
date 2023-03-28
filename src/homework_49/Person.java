package homework_49;
/*
Создайте класс Person, которому при создании передавайте
имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
Реализуйте в классе интерфейс Comparable<Person>, в котором
"меньше" будет значить "младше".
Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
Но можно сравнивать даты рождения!
Альтернативная подсказка: если очень хочется вычислять возраст,
то можно это делать в миллисекундах с использованием getTime()!
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
  private String name;
  private Date birthDate;

  public Person(String name, Date birthDate) { // нужно ли парсить дэйт до этого момента?
    this.name = name;
    SimpleDateFormat formatter = new SimpleDateFormat(dd.MM.yyy);
    this.birthDate = formatter.parse(birthDate);
  }
}
