🚨 Help Veículos – API de Guincho

API Restful desenvolvida em Spring Boot para gerenciar solicitações de guincho da empresa fictícia Help Veículos.
O sistema permite que clientes solicitem guincho informando seus dados e os do veículo, armazenando as informações em um banco de dados MySQL.

📋 Funcionalidades:

- Criar solicitação de guincho
- Listar todas as solicitações
- Buscar solicitação por ID
- Atualizar solicitação existente
- Excluir solicitação

🛠️ Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Postman

🗂️ Estrutura do Projeto
guincho/
 ├── src/
     ├── main/
         ├── java/anapicoli/guincho/
             ├── controller/
             ├── model/
             ├── repository/
             ├── service/
             └── GuinchoApplication
         └── resources/
             ├── application.properties
             ├── static/
             └── templates/
     └── test/java/anapicoli/guincho/
         └── GuinchoApplicationTests
 └── pom.xml

🚀 Executando o Projeto

Clone o repositório:
"git clone https://github.com/anapicoli/guincho.git"

Acesse a pasta do projeto:
"cd guincho"

Compile e execute:
"./mvnw spring-boot:run"

ou, no IntelliJ, rode a classe GuinchoApplication.

O servidor estará disponível em:
"http://localhost:8000"

📌 Autor

Projeto desenvolvido por Ana Picoli
