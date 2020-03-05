package ru.job4j.inheritance;

public class HtmlReport extends ru.job4j.inheritance.TextReport {

    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}
