# Shape Area And Perimeter Calculator

This RESTful API application calculates area and perimeter of geometric shapes.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Building](#building)
  - [Running](#running)
- [Usage](#usage)
  - [Request examples](#request-examples)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later
- Apache Maven (for building)

## Getting Started

### Building

To build the application, follow these steps:

1. Clone the repository:

   ```sh
   git clone https://github.com/osinelnikov/wami.git
   ```

2. Navigate to the project directory:

   ```sh
   cd task
   ```

3. Build the project using Maven:

   ```sh
   mvn clean install
   ```

This will compile the source code and generate a JAR file in the `target` directory.

### Running

To run the application, use the following command:

```sh
java -jar target/shape-calculator-1.0.jar
```

## Usage

Once the application is running, open your web browser and visit [http://localhost:8080](http://localhost:8080). You should see the application's homepage.

### Request examples

curl --location 'http://localhost:8080/calculate' --header 'Content-Type: application/json' --data '{"type": "square","length": 5}'

curl --location 'http://localhost:8080/calculate' --header 'Content-Type: application/json' --data '{"type": "circle","radius": 5}'

curl --location 'http://localhost:8080/calculate' --header 'Content-Type: application/json' --data '{"type": "rectangle","length": 5,"width":5}'

curl --location 'http://localhost:8080/calculate' --header 'Content-Type: application/json' --data '{"type": "triangle","sideA": 5,"sideB":5,"sideC":5}'



## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Submit a pull request.

## License

This project is licensed (see [LICENSE](license.txt) file for details).
```

This example `README.md` file provides information about prerequisites, building and running the application, usage instructions, how to contribute, and licensing details. You can customize it to fit your specific project's needs.