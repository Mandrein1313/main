cmake_minimum_required(VERSION 3.22.1)

project("oniguruma-binding")

set(CMAKE_CXX_STANDARD 17)           # ← เปลี่ยนจาก 20 เป็น 17 (ปลอดภัยกว่า)
set(CMAKE_CXX_FLAGS "-fvisibility=hidden")

# สำคัญ: บังคับให้ใช้ NDK toolchain ถูกต้อง
set(CMAKE_ANDROID_STL_TYPE c++_shared)

set(BUILD_TEST OFF CACHE BOOL "Disable oniguruma tests" FORCE)
add_subdirectory(oniguruma EXCLUDE_FROM_ALL)

add_library("oniguruma-binding" SHARED binding.cpp)

target_link_libraries("oniguruma-binding" PUBLIC onig)
