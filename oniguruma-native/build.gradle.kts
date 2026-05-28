ndkVersion = "29.0.14206865"

externalNativeBuild {
    cmake {
        path = project.file("src/main/cpp/CMakeLists.txt")
        version = "3.31.5"        // ← เปลี่ยนเป็นเวอร์ชันใหม่
    }
}
