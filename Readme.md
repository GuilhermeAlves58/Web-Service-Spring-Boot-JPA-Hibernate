# 🌐 Web Services com Spring Boot e JPA / Hibernate

Este repositório contém o projeto desenvolvido no módulo de **Web Services com Spring Boot e JPA/Hibernate**, parte do curso **Java COMPLETO** do professor **Dr. Nélio Alves**.

🔗 Curso: [Java COMPLETO - Udemy](https://www.udemy.com/course/java-curso-completo/)  
👨‍🏫 Professor: Dr. Nélio Alves  
📁 Repositório original:  
- [workshop-springboot2-jpa](https://github.com/acenelio/workshop-springboot2-jpa)  
- [workshop-springboot3-jpa](https://github.com/acenelio/workshop-springboot3-jpa)

---

## 🎯 Objetivos

- Criar um projeto com Spring Boot
- Implementar um modelo de domínio completo
- Estruturar as camadas: Controller (Resource), Service e Repository
- Configurar banco de dados de testes com H2
- Popular o banco de dados
- Implementar operações CRUD (Create, Retrieve, Update, Delete)
- Tratar exceções de forma centralizada
- Realizar deploy no Heroku (opcional)

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (ambiente de teste)
- PostgreSQL (produção/dev)
- Maven
- Heroku (deploy opcional)

---

## 🧱 Estrutura Lógica

### 🔹 Camadas do Projeto

- `Resource` (Controller): Ponto de entrada das requisições
- `Service`: Regras de negócio
- `Repository`: Acesso aos dados com Spring Data JPA

---

## 💾 Banco de Dados

### Teste (H2 Database)

- Configuração em `application-test.properties`
- Console: `/h2-console`
- Dialeto: `org.hibernate.dialect.H2Dialect`

### Produção (PostgreSQL)

- Configuração via `application-prod.properties`
- Dependência:
```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
