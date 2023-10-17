# Santander Bootcamp 2023
Java RESTful API criada para o Santander Bootcamp Fullstack Angular + Java 2023

## Diagrama de classes
```mermaid
classDiagram
  class User {
    - name: string
    - account: Account
    - features[]F eature
    - card: Card
    - news[] News
  }

  class Account {
    - number: string
    - agency: string
    - balance: float
    - limit: float
  }

  class Feature {
    - icon: string
    - description: string
  }

  class Card {
    - number: string
    - limit: float
  }

  class News {
    - newsIcon: string
    - newsDescription: string
  }

  User "1" *-- "1" Account : has
  User "1" *-- "N" Feature : has
  User "1" *-- "1" Card : has
  User "1" *-- "N" News : has
```
