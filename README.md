# 🎛 Customer REST Service
### Author: **[Duc Dao](https://beacons.ai/ducdmd152)**
--------------------------------------------------
## Table of Contents
- [Description](#description)
- [Endpoints](#endpoints)
- [Technology](#technology)
- [How can get started](#how-can-get-started)
- [License & Copyright](#license--copyright)
--------------------------------------------------

## Description
- A simple REST webservice.
- REST CRUD operations:
    - List the customers.
    - Add new customer.
    - Update customer.
    - Delete customer.
- Authentication & Authorization:

    | Role        | Username | Password |
    |-------------|----------|----------|
    | ADMIN, USER | admin    | admin    |
    | USER        | user     | 123      |

## Endpoints
  ![API Endpoints](https://github.com/ducdmd152/customer-REST-service/blob/main/readme.png)
## Technology
- **Version 2.2: Spring Boot, Spring REST, Spring Security, Spring Data JPA, Spring Data REST.**

- Version 2.1: Spring Boot, Spring REST, Spring Security, Spring Data JPA.

- Version 2.0: Spring Boot, Spring REST, Spring Security.

- Version 1.1: Spring REST, Spring Security.

- Version 1.0: Spring REST.

**Database: MySQL, [DDL script here](https://github.com/ducdmd152/customer-REST-service/tree/3173ccf49a61193b057cab986d3c43ebd903f016/sql-scripts)**

## How can Get Started

- Download the source code.
- Database setup:
    - Create the user & database with [scripts](https://github.com/ducdmd152/customer-REST-service/tree/3173ccf49a61193b057cab986d3c43ebd903f016/sql-scripts).
    - Customize the content in [src/main/resources/application.properties](https://github.com/ducdmd152/customer-REST-service/blob/main/src/main/resources/application.properties) for adapting to your case.
   

## License & Copyright
&copy; 2023 Duc Dao ducdmd152 Licensed under the [MIT LICENSE](https://github.com/ducdmd152/customer-REST-service/blob/main/LICENSE).

> 🤟 Feel free to use my repository and star it if you find something interesting 🤟
