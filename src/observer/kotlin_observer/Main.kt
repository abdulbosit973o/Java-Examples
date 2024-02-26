package observer.kotlin_observer

fun main() {
    val teacher = Teacher()

    val student1 = Student()
    val student2 = Student()
    val student3 = Student()

    teacher.addObservers(student1, student2, student3)
    teacher.startLesson()

    println(teacher.getStudents())
}