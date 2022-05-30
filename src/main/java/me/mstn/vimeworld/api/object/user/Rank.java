package me.mstn.vimeworld.api.object.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Rank {

    PLAYER("Игрок", ""),

    VIP("VIP", "[V]"),
    PREMIUM("Premium", "[P]"),
    HOLY("Holy", "[H]"),
    IMMORTAL("Immortal", "[I]"),

    BUILDER("Билдер", "[Билдер]"),
    SRBUILDER("Проверенный билдер", "[Пр. билдер]"),
    MAPLEAD("Главный билдер", "[Гл. билдер]"),

    YOUTUBE("YouTube", "[YouTube]"),

    DEV("Разработчик", "[Dev]"),

    ORGANIZER("Организатор", "[Организатор]"),

    MODER("Модератор", "[Модер]"),
    WARDEN("Проверенный модератор", "[Модер]"),
    CHIEF("Главный модератор", "[Гл. модер]"),

    ADMIN("Главный администратор", "[Гл. админ]");

    private final String name;
    private final String prefix;

}
