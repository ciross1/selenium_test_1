# selenium_test_1

# Selenium Test Automation – Login Tests mit POM

Dieses Projekt demonstriert automatisierte UI-Tests mit Selenium WebDriver, JUnit 5 und dem Page Object Model (POM) Entwurfsmuster in Java.

## Technologien

- Java 21
- Selenium WebDriver 4.43.0
- JUnit 5
- Maven
- ChromeDriver (wird automatisch von Selenium Manager verwaltet)

## Projektstruktur

```
src/
└── test/
    └── java/
        ├── base/
        │   └── BaseTest.java       # Setup und Teardown für alle Tests
        ├── pages/
        │   └── LoginPage.java      # Page Object für die Login-Seite
        └── tests/
            └── LoginTest.java      # Testfälle für den Login
```

## Demonstrierte Konzepte

**Page Object Model (POM):** Jede Seite der Anwendung wird als eigene Java-Klasse dargestellt. Selektoren und Aktionen sind von der Testlogik getrennt, was den Code wartbarer und lesbarer macht.

**BaseTest:** Setup (`@BeforeEach`) und Teardown (`@AfterEach`) sind in einer gemeinsamen Basisklasse ausgelagert, um Wiederholungen zu vermeiden.

**Explizite Waits:** `WebDriverWait` mit `ExpectedConditions` sorgt für stabile Tests, die nicht von festen Wartezeiten abhängen.

**Positive und negative Testfälle:** Es wird sowohl der Erfolgsfall (gültige Anmeldedaten) als auch der Fehlerfall (ungültige Anmeldedaten) getestet.

## Voraussetzungen

- Java 21 
- Maven
- Google Chrome (aktuellste Version)

## Ausführen der Tests

Alle Tests über Maven ausführen:

```bash
mvn test
```

Einen einzelnen Test ausführen:

```bash
mvn test -Dtest=LoginTest
```

## Getestete Anwendung

Als Zielanwendung wird die öffentlich zugängliche Demo-Umgebung von nopCommerce verwendet:
`https://admin-demo.nopcommerce.com`

## Autor

Ciro Santamarina – [github.com/ciross1](https://github.com/ciross1)