fun main() {
    val car = Car("Toyota", "Corolla", 4)
    car.drive()

    val truck = Truck("Ford", "F-150", 2.3)
    truck.drive()

    val circle = Circle("circle", 5.0)
    circle.printName()

    val rectangle = Rectangle("rectangle", 4.0, 6.0)
    rectangle.printName()

    val student = Student("Deborah",10,50)
    student.speak()

    val teacher = Teacher("Ben",38,"Math")
    teacher.speak()
}
//Create a Vehicle superclass with a brand and model property and a drive() method that
//prints a message indicating that the vehicle is driving.
//Then create two subclasses of Vehicle: Car and Truck.
//The Car subclass should have a numDoors property and the
//Truck subclass should have a cargoCapacity property.
//Override the drive() method in each subclass to print a message
//indicating that the vehicle is driving and its properties.

 open class Vehicle(val brand:String, val model: String){
    open fun drive(){
        println("The $brand $model is driving.")

    }
}
class Car(brand: String,model: String, val numDoors: Int): Vehicle(brand, model){
    override fun drive(){
        println("The $brand $model with $numDoors doors is driving")
    }

}
class Truck(brand: String,model: String,val cargoCapacity:Double) : Vehicle(brand,model){
    override fun drive(){
        println("The $brand $model with $cargoCapacity is driving.")
    }

}
//Create a Shape class with a name property
//and a printName() method that prints the name of the shape.
//Then create two subclasses of Shape: Circle and Rectangle.
//The Circle subclass should have a radius property and
//the Rectangle subclass should have a width and height property.
//Override the printName() method in each subclass to print the
//name of the shape and its properties.
 open class Shape(val name: String){
     open fun printName(){
         println("The shape is a $name.")
     }
 }
class Circle(name: String,val radius:Double) : Shape(name){
    override fun printName(){
        println("The shape is a $name with radius $radius.")
    }

}
class Rectangle(name: String,val width:Double,val height:Double): Shape(name){
    override fun printName(){
        println("The shape is a $name with width $width  and height $height")
    }
}
//Create a Person superclass with a name and age property and
//a speak() method that prints a message indicating that the person is speaking.
//Then create two subclasses of Person: Student and Teacher.
//The Student subclass should have a gradeLevel property and
//the Teacher subclass should have a subject property.
//Override the speak() method in each subclass
 open class Person(val name: String,val age:Int){
    open fun speak(){
        println("$name is speaking.")

    }
}
class Student(name: String,age: Int, val gradeLevel: Int):Person(name,age){
    override fun speak(){
        println("$name is a student in grade $gradeLevel")
    }
}
class Teacher(name: String,age: Int ,val subject:String):Person(name,age){
    override fun speak(){
        println("$name is a teacher of $subject.")
    }
}

