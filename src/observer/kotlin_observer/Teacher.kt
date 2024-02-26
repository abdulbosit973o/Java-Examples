package observer.kotlin_observer

class Teacher {
    private val list = mutableListOf<Student>()
    fun addObservers(vararg observer: Student) {
        list.addAll(observer)
    }
    fun startLesson() {
        notifyObservers("StartLesson")
    }
    fun finishLesson() {
        notifyObservers("FinishLesson")
    }
    private fun notifyObservers(message: String) {
        list.forEach {
            it.message(message)
        }
    }
    fun getStudents() : String {
        return list.joinToString()
    }
}