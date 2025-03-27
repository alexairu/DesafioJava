1️⃣ snake_case
🔹 Descrição: Todas as palavras são minúsculas e separadas por underscores (_).
🔹 Usado em: Python, Banco de Dados (SQL), URLs, Django, Ruby.

✅ Exemplos:

user_name

get_user_data()

total_sales_amount

📌 Onde é mais usado?

Python: Nomes de funções e variáveis (get_user_info())

Django: URLs (user_profile/<int:user_id>/)

SQL: Nome de colunas (first_name, order_date)

2️⃣ camelCase
🔹 Descrição: A primeira palavra é minúscula, as demais começam com letra maiúscula, sem espaços ou underscores.
🔹 Usado em: JavaScript, Java, C#, PHP (Laravel), APIs REST.

✅ Exemplos:

userName

getUserData()

calculateTotalAmount

📌 Onde é mais usado?

JavaScript: Variáveis e funções (let userAge = 25;)

Java & Spring Boot: Métodos (getUserProfile())

.NET (C#): Parâmetros (public void updateUser(string firstName))

Laravel (PHP): Métodos e atributos (public function getUserProfile())

3️⃣ PascalCase
🔹 Descrição: Cada palavra começa com letra maiúscula, incluindo a primeira.
🔹 Usado em: Nomes de classes, namespaces, estruturas e enums.

✅ Exemplos:

UserProfile

GetUserData()

TotalAmountCalculator

📌 Onde é mais usado?

C# & .NET: Classes (public class UserManager {})

Java: Classes e arquivos (public class OrderService {})

TypeScript: Nomes de componentes (export class UserDetails {})

4️⃣ kebab-case
🔹 Descrição: Todas as palavras são minúsculas e separadas por hífens (-).
🔹 Usado em: URLs, nomes de arquivos HTML/CSS/JS, frameworks frontend (Vue, Angular).

✅ Exemplos:

user-profile

get-user-data

total-sales-amount

📌 Onde é mais usado?

URLs: (/user-profile/123)

Nomes de arquivos JS/CSS: (main-style.css, app-component.vue)

Frameworks frontend: Vue.js e Angular usam esse padrão para nomes de componentes (<user-profile />)

5️⃣ UPPER_CASE (SCREAMING_SNAKE_CASE)
🔹 Descrição: Todas as palavras são maiúsculas e separadas por underscores (_).
🔹 Usado em: Constantes e variáveis imutáveis.

✅ Exemplos:

MAX_USERS = 1000

API_KEY = "abc123"

DEFAULT_TIMEOUT = 30

📌 Onde é mais usado?

Python: Constantes (DEFAULT_PORT = 8080)

C & C++: Macros (#define BUFFER_SIZE 1024)

JavaScript: Variáveis imutáveis (const MAX_RETRIES = 5;)

📌 Resumo e Comparação
    Tipo	        Exemplo	Uso Comum
snake_case => get_user_data	Python, Django, SQL
camelCase => getUserData	JavaScript, Java, C#
PascalCase => GetUserData	Classes em Java, C#
kebab-case => user-profile	URLs, arquivos JS/CSS
UPPER_CASE => MAX_USERS	Constantes, variáveis globais