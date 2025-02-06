# Transferências Financeiras - Backend

Este é o backend do sistema de agendamento de transferências financeiras, desenvolvido com Spring Boot.

## Tecnologias Utilizadas

- Java 11
- Spring Boot 2.7.x
- Spring Data JPA
- H2 Database (banco de dados em memória)

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/transferencias-backend.git
   ```
2. **Navegue até a pasta do projeto**:
   ```bash
   cd transferencias-backend
   ```
3. **Compile e execute o projeto**:
   ```bash
   mvn spring-boot:run
   ```
4. **Acesse a API**:  
   A API estará disponível em [http://localhost:8080](http://localhost:8080).

## Endpoints da API

### Criar uma nova transferência

**POST** `/transferencias`

#### Exemplo de corpo da requisição:

```json
{
  "contaOrigem": "1234567890",
  "contaDestino": "0987654321",
  "valor": 1000.00,
  "dataTransferencia": "2023-10-15"
}
```

### Listar todas as transferências agendadas

**GET** `/transferencias`

#### Exemplo de resposta:

```json
[
  {
    "id": 1,
    "contaOrigem": "1234567890",
    "contaDestino": "0987654321",
    "valor": 1000.00,
    "taxa": 82.00,
    "dataTransferencia": "2023-10-15",
    "dataAgendamento": "2023-10-01"
  }
]
```

## Banco de Dados

O projeto utiliza o banco de dados H2 em memória. Para acessar o console do H2:

1. Acesse [http://localhost:8080/h2-console](http://localhost:8080/h2-console).
2. Use as seguintes credenciais:
   - **JDBC URL**: `jdbc:h2:mem:transferenciasdb`
   - **Username**: `sa`
   - **Password**: `password`
