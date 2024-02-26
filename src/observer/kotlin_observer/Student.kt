package observer.kotlin_observer

class Student : Observer {
    private var teacherMessage: String? = null
    override fun message(message: String) {
        teacherMessage = message
    }

    override fun toString(): String {
        return teacherMessage ?: "Hali message kelmagan"
    }
}