# University Mailing System 

[![Build Status](https://travis-ci.org/CesarNog/university-mailing-system.svg?branch=master)](https://travis-ci.org/CesarNog/university-mailing-system)

> developed by Cesar Augusto Nogueira [www.cesarnogueira.tech](www.cesarnogueira.tech)

## How-to-run

Before you can build and run this project locally, you must install and configure the following dependencies on your machine:

1. [Node.js - 6.11.3]: Node is being used to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.
2. [Yarn]: Yarn is being used to manage Node dependencies.
   Depending on your system, you can install Yarn either from source or as a pre-packaged bundle.

	After installing Node, you should be able to run the following command to install development tools.
	You will only need to run this command when dependencies change in [package.json](package.json).

		yarn install

Run the following commands in two separate terminals to create a blissful development experience where your browser auto-refreshes when files change on your hard drive.

    ./mvnw
    yarn start

Yarn is also used to manage CSS and JavaScript dependencies used in this application.


## Building for production

To optimize the universitymailing application for production, run:

    ./mvnw -Pprod clean package

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

    java -jar target/*.war

Then navigate to [http://localhost:8080](http://localhost:8080) in your browser.


## Testing

To launch your application's tests, run:

    ./mvnw clean test

### Client tests

Unit tests are run by [Karma][] and written with [Jasmine][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

    yarn test

## APIs

GET​: /api/students/#{cpf}/scores
Response body: 
{
"nome": "Jose da Silva",
"endereco": "Rua Silvio Santos, 55",
"cep": "99999-999",
"mensagem": "Texto referente a mensagem para o aluno"
}

GET​: /api/students
Response body: 
{
"nome": "Jose da Silva",
"endereco": "Rua Silvio Santos, 55",
"cep": "99999-999",
"mensagem": "Texto referente a mensagem para o aluno"
}

POST​: /api/maladireta
Response body: 
{
"nome": "Jose da Silva",
"endereco": "Rua Silvio Santos, 55",
"cep": "99999-999",
"mensagem": "Texto referente a mensagem para o aluno"
}

## Main References Used

   NodeJS: [https://nodejs.org/](https://nodejs.org/)
   Yarn[https://yarnpkg.org/](https://yarnpkg.org/)
   Webpack: [https://webpack.github.io/](https://webpack.github.io/)
   Angular CLI: [https://cli.angular.io/](https://cli.angular.io/)
   BrowserSync: [http://www.browsersync.io/](http://www.browsersync.io/)
   Karma: [http://karma-runner.github.io/](http://karma-runner.github.io/)
   Jasmine: [http://jasmine.github.io/2.0/introduction.html](http://jasmine.github.io/2.0/introduction.html)
   Protractor: [https://angular.github.io/protractor/](https://angular.github.io/protractor/)
   Leaflet: [http://leafletjs.com/](http://leafletjs.com/)
   DefinitelyTyped: [http://definitelytyped.org/](http://definitelytyped.org/)
