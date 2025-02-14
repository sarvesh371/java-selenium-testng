
# Selenium Automation Framework with TestNG
This project is an Automation testing framework built using Selenium and TestNG.

## Prerequisites
- Java JDK 11 or higher
- Maven 3.6.3 or higher

## Project Structure
```bash
src
├── main
│ ├── java
│ │ └── base/ # Base classes
│ │ └── pages/ # Page classes
│ │ └── utils/ # Utility classes
├── test
│ ├── java
│ │ └── tests/ # Test classes
├── pom.xml # Maven project file
└── testng.xml # TestNG configuration file
```

## Dependencies
The framework uses the following main dependencies:
- REST Assured
- TestNG
- Jackson (JSON parsing)
- Lombok
- Log4j2

## Getting Started
1. Clone the repository:
```bash
git clone https://github.com/sarvesh371/java-selenium-testng.git
cd java-selenium-testng
```
2. Install dependencies:
```bash
mvn clean install
```
3. Run the tests:
```bash
mvn clean test
```

## Configuration
- Test suites are defined in `testng.xml`

## Best Practices
1. Follow page object model
2. Maintain test data separately
3. Use appropriate assertions
4. Add meaningful test descriptions
5. Follow proper naming conventions

## Contributing
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License
This project is licensed under the MIT License - see the LICENSE file for details