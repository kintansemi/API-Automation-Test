# Faker API Automation Testing

This project is an **API Automation Testing framework** for the [FakerAPI](https://fakerapi.it/) using **Java, Cucumber (BDD), RestAssured, and Maven**.

The purpose of this project is to demonstrate:
- API testing best practices
- BDD-style test scenarios
- Clean and reusable automation framework
- Positive and negative test coverage

---

## 🛠 Tech Stack

- **Java 8**
- **Maven**
- **Cucumber (BDD)**
- **JUnit**
- **RestAssured**
- **Gherkin**

---

## 📂 Project Structure
src
├── test
│ ├── java
│ │ ├── runners
│ │ │ └── TestRunner.java
│ │ ├── stepdefinitions
│ │ │ ├── CommonSteps.java
│ │ │ ├── AddressesSteps.java
│ │ │ ├── BooksSteps.java
│ │ │ ├── CompaniesSteps.java
│ │ │ ├── CreditCardsSteps.java
│ │ │ ├── CustomSteps.java
│ │ │ ├── ImagesSteps.java
│ │ │ ├── PersonsSteps.java
│ │ │ ├── PlacesSteps.java
│ │ │ ├── ProductsSteps.java
│ │ │ ├── TextsSteps.java
│ │ │ └── UsersSteps.java
│ └── resources
│ └── features
│ ├── addresses.feature
│ ├── books.feature
│ ├── companies.feature
│ ├── credit_cards.feature
│ ├── custom.feature
│ ├── images.feature
│ ├── persons.feature
│ ├── places.feature
│ ├── products.feature
│ ├── texts.feature
│ └── users.feature


---

## ▶️ How to Run the Tests

Make sure you have **Java 8+** and **Maven** installed.

```bash
mvn clean test

Tests run: 11
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS

| TC ID | Feature / API    | Scenario Description                          | Endpoint                    | Test Type | Steps (Given / When / Then)                                            | Expected Result                                    |
| ----- | ---------------- | --------------------------------------------- | --------------------------- | --------- | ---------------------------------------------------------------------- | -------------------------------------------------- |
| TC-01 | Addresses API    | Get addresses data successfully               | `/api/v1/addresses`         | Positive  | Given Faker API is ready<br>When I request addresses                   | Status code **200** and response data is not empty |
| TC-02 | Books API        | Get books data successfully                   | `/api/v1/books`             | Positive  | Given Faker API is ready<br>When I request books                       | Status code **200**                                |
| TC-03 | Companies API    | Get companies data successfully               | `/api/v1/companies`         | Positive  | Given Faker API is ready<br>When I request companies                   | Status code **200**                                |
| TC-04 | Credit Cards API | Validate credit cards endpoint error response | `/api/v1/credit_cards`      | Negative  | Given Faker API is ready<br>When I request credit cards                | Status code **400 (Bad Request)**                  |
| TC-05 | Custom API       | Validate custom data quantity                 | `/api/v1/custom?quantity=3` | Positive  | Given Faker API is ready<br>When I request custom data with quantity 3 | Response contains **exactly 3 items**              |
| TC-06 | Images API       | Get images data successfully                  | `/api/v1/images`            | Positive  | Given Faker API is ready<br>When I request images                      | Status code **200**                                |
| TC-07 | Persons API      | Get persons data successfully                 | `/api/v1/persons`           | Positive  | Given Faker API is ready<br>When I request persons                     | Status code **200**                                |
| TC-08 | Places API       | Get places data successfully                  | `/api/v1/places`            | Positive  | Given Faker API is ready<br>When I request places                      | Status code **200**                                |
| TC-09 | Products API     | Get products data successfully                | `/api/v1/products`          | Positive  | Given Faker API is ready<br>When I request products                    | Status code **200**                                |
| TC-10 | Texts API        | Get texts data successfully                   | `/api/v1/texts`             | Positive  | Given Faker API is ready<br>When I request texts                       | Status code **200**                                |
| TC-11 | Users API        | Get users data with non-empty response        | `/api/v1/users`             | Positive  | Given Faker API is ready<br>When I request users                       | Status code **200** and response data is not empty |
