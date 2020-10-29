/*
Enum класс это тип класса для хранения некоторого списка констант представляющих набор типов одного объекта
(например, объект "Цвет" содержит в том числе типы CИНИЙ, КРАСНЫЙ,ЖЕЛТЫЙ)
 */

enum class Сolor{
    DARKBLUE,RED,YELLOW
}

/*
Enum класс может иметь конструктор, поэтому для класса можно задать набор свойств, при этом каждая константа будет
иметь свой набор значений этих свойств, таким образом можно получить доступ к каждому свойству любой констаны enum
класса если это необходимо

 */

enum class Languages(val country:String) {
    RUSSIAN("Russia"),ENGLISH("USA,England,Australia"),ITALIAN("Italy")
}

/*
    В Enum классах можно имплементировать интерфейсы, таким образом можно задавать специфичное поведение для каждой
    константы
     */

interface helloInterface {
    fun sayHello():Unit
}

// Перепишем Enum класс с имплементацией интерфейса

enum class LanguagesImpl(val country:String):helloInterface {
    RUSSIAN("Russia"){
        override fun sayHello() {
            println("Привет")
        }
    },
    ENGLISH("USA,England,Australia") {
        override fun sayHello() {
            println("Hello")
        }
    },
    ITALIAN("Italy"){
        override fun sayHello() {
            println("Ciao")
        }
    }
}

//Теперь каждая константа может сказать "Привет" на своем языке