cmake_minimum_required(VERSION 3.7)
project(HelloWorld)

add_custom_target(HelloWorld
        COMMAND /usr/bin/swift build
        WORKING_DIRECTORY ${CMAKE_SOURCE_DIR}
        SOURCES Sources/main.swift)
