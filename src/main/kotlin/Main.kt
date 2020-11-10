fun main() {
    //Получение свойства (проперти) enum класса
    println("National language of ${Languages.ENGLISH.country} is ${Languages.ENGLISH}")
    // или так через переменную
    val russianNationalLanguage = Languages.RUSSIAN
    println("National language of ${russianNationalLanguage.country} is $russianNationalLanguage")

    /* также можно получить данные константы через имя константы или через порядковый номер константы в списке enum
    класса
*/
    // получение порядкового номера константы в списке enum класса через ordinal
    println(
        "${Languages.ITALIAN.ordinal} is int representing ordinal number of ITALIAN constant in emum class list " +
            "returned from enum class instance"
    )
    //получение константы по порядковому номеру через функцию values()[int]
    println("${Languages.values()[2]} is enum instance created from int 2 that is it's ordinal number")
    // получение константы по строке с ее именем через функцию valueOf()
    println("${Languages.valueOf("RUSSIAN")} is enum instance created from string with it's name.")
    // получение строки с именем константы по самой константе через name
    println(
        "${Languages.RUSSIAN.name} is a string representing name of RUSSIAN constant returned from enum class " +
            "instance "
    )

    /*
    Теперь перепишем пример приведенный выше, чтобы выводить не текстовое представление инстанса enum класса, а строго
    текст. Так как теперь выводится тип String, можно его правильно отформатировать
     */
    val english = Languages.ENGLISH.name.toLowerCase()
    println("National language of ${Languages.ENGLISH.country} is ${english[0].toUpperCase() + english.substring(1)}")

    /*
    Ниже пример иллюстрирующий работу переопределенных функций Enum класса имплементирующего интерфейсы
     */

    LanguagesImpl.ENGLISH.sayHello()
    LanguagesImpl.ENGLISH.sayBye()
    LanguagesImpl.ITALIAN.sayHello()
    LanguagesImpl.ITALIAN.sayBye()
    LanguagesImpl.RUSSIAN.sayHello()
    LanguagesImpl.RUSSIAN.sayBye()

    /*
    Ниже пример иллюстрирующий работу переопределенных функций Enum класса, где константы созданы как анонимный класс
     */

    LanguagesAsAnonymousClasses.ENGLISH.sayHello()
    LanguagesAsAnonymousClasses.ENGLISH.sayBye()
    LanguagesAsAnonymousClasses.ITALIAN.sayHello()
    LanguagesAsAnonymousClasses.ITALIAN.sayBye()
    LanguagesAsAnonymousClasses.RUSSIAN.sayHello()
    LanguagesAsAnonymousClasses.RUSSIAN.sayBye()

/*
Можно прогонять все константы Enum класса в цикле, через функцию values()
 */

    for (i in Languages.values()) {
        val language = i.name.toLowerCase()
        println("National language of ${i.country} is ${language[0].toUpperCase() + language.substring(1)}")
    }

    /*
Тестим вызова статичной функции Enum класса
     */
    println(LanguagesWithCompanionObject.getCountryByLanguage("russian"))

    val shapeCircle = Circle(5)
    val evaluater = Evaluater(shapeCircle)
    evaluater.eval()
    println(shapeCircle.area)
    shapeCircle.sayHello()

}