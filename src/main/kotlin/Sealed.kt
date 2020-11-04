/*
Sealed класс это по сути абстрактный класс, с той лишь разницей, что все классы наследники являются набором некоторого
множества. Это очень похоже на enum класс, разница состоит в том, что для каждой констансты enumа при компиляции
создается один объект, который потом используется в логике, в то же время наследник sealed класса может иметь сколь
угодно много инстансов, при этом sealed классы могут хранить состояния, а enum класс - нет
 */
// Все наследники sealed класса должны быть объявлены в том же пакете, где и сам sealed класс
// Объявляю sealed класс, так как такой класс по умолчанию абстрактный зашиваю в него абстракные свойство и функцию
// и не абстрактную функцию до кучи, что проверить как работает
sealed class Shape{
    abstract var area:Double?
    abstract fun calculateArea():Double
    fun sayHello()= println("Hello")
}
// Объявляю класс Circle, наследую его от sealed класса, переопределяю свойство и функцию расчета площади
//после того как будет вызвана функция расчета площади, значение площади будет хранится в свойстве класса(хранит состояние)
class Circle (val radius:Int):Shape(){
   override var area:Double?=null
   override fun calculateArea():Double{
        area= 3.14*(radius*radius)
        return area as Double
    }
}
// Тоже самое для квадрата
class Square (val length:Int):Shape(){
    override var area: Double?=null
    override fun calculateArea(): Double {
        area= length.toDouble()*length.toDouble()
        return area as Double
    }
}

// Объявляю класс, через который буду тестировать
class Evaluater (val shape:Shape){
    fun eval(){
        when (shape){
            is Circle-> println("Shape is circle. Area is ${shape.calculateArea()}")
            is Square-> println("Shape is square. Area is ${shape.calculateArea()}")
        }
    }
}