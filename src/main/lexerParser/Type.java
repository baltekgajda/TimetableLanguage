package main.lexerParser;

public enum Type {
    INTEGER("Integer"), STRING("String"), TIMETABLE("Timetable"), TIMETABLE_DATA("TimetableData");
    private String name;

    Type(String name) {
        this.name = name;
    }
}