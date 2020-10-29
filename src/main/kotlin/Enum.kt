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
    константы. Можно имплементировать множество интерфесов.
     */

interface helloInterface {
    fun sayHello()
}

interface  byuInterface {
    fun sayBye()
}

// Перепишем Enum класс с имплементацией интерфейсов

enum class LanguagesImpl(val country:String):helloInterface,byuInterface {
    RUSSIAN("Russia"){
        override fun sayHello() {
            println("Привет")
        }

        override fun sayBye() {
            println("Пока")
        }
    },
    ENGLISH("USA,England,Australia") {
        override fun sayHello() {
            println("Hello")
        }

        override fun sayBye() {
            println("Goodbye")
        }
    },
    ITALIAN("Italy"){
        override fun sayHello() {
            println("Ciao")
        }

        override fun sayBye() {
            println("Ciao")
        }
    }
}

//Теперь каждая константа может сказать "Привет" и "Пока" на своем языке

/*
Также специфичное поведение для каждой константы можно задавать определяя ее как анонимный класс.
Для этого в теле Enum класса нужно определить необходимые абстраткные функции и переопределить их с реализацией в
константах. Это очень похоже на имплементацию интерфейсов с той разнице, что все функции зашиты в тело enum класса.
Теперь реализуем аналогичное поведение для каждой константы из предыдущего примера, но без интерфейсов.
Создадим новый enum класс (обрати внимание, что нужно поставить ";" после последней константы)
 */

enum class LanguagesAsAnonymousClasses(val country:String) {
    RUSSIAN("Russia"){
        override fun sayHello() {
            println("Привет")
        }

        override fun sayBye() {
            println("Пока")
        }
    },
    ENGLISH("USA,England,Australia") {
        override fun sayHello() {
            println("Hello")
        }

        override fun sayBye() {
            println("Goodbye")
        }
    },
    ITALIAN("Italy"){
        override fun sayHello() {
            println("Ciao")
        }

        override fun sayBye() {
            println("Ciao")
        }
    };
    abstract fun sayHello()
    abstract fun sayBye()

}