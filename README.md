![GitHub all releases](https://img.shields.io/github/downloads/MVSSTON/VimeAPI/total?style=for-the-badge)
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/MVSSTON/VimeAPI.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/MVSSTON/VimeAPI/context:java)
[![Total alerts](https://img.shields.io/lgtm/alerts/g/MVSSTON/VimeAPI.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/MVSSTON/VimeAPI/alerts/)
[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=for-the-badge)](https://github.com/MVSSTON/VimeAPI/blob/main/LICENSE)

# VimeWorld API (Java)
Библиотека для упрощения работы с VimeWorld API.

## Примечание
Библиотека может быть и будет становиться лучше. Автор ждёт ваших вопросов в разделе "Issues".

## Зависимости
Библиотека использует следующие зависимости:
- Gson
- Lombok

## Требования для работы
- Java 8+ версии
- Maven Build Tool

## Быстрый старт
1. Добавляем репозиторий и зависимость в pom.xml файл
```xml
    <repositories>
        <repository>
            <id>Masston's Repository</id>
            <url>https://repo.mstn.me/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>me.mstn.vimeworld.api</groupId>
            <artifactId>VimeAPI</artifactId>
            <version>0.1.0</version>
        </dependency>
    </dependencies>
```
2. Создадим класс для тестов
```java
package mypackage;

import me.mstn.vimeworld.api.method.VimeApiMethods;

public class Test {

    public static void main(String[] args) {
        VimeApiMethods methods = new VimeApiMethods();
        // И работаем с объектом methods
    }
    
}

```
3. Работаем с инстансом класса VimeApiMethods (Примеры в разделе Wiki) 