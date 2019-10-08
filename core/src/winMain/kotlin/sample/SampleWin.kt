package sample

actual class Sample {
    actual fun checkMe() = 88
}

actual object Platform {
    actual val name: String = "Win"
}