💱 Conversor de Moedas com API de Câmbio
Este é um projeto Java que permite ao usuário realizar conversões entre diferentes moedas em tempo real, utilizando a ExchangeRate API. O programa é executado no terminal e possui um menu interativo para facilitar a navegação.

🛠️ Tecnologias utilizadas
Java 17+

Biblioteca Gson para parsing JSON

HttpClient da API nativa do Java

API: ExchangeRate API

📦 Funcionalidades
O usuário pode escolher entre as seguintes conversões de moeda:

Dólar (USD) → Real (BRL)

Real (BRL) → Dólar (USD)

Dólar (USD) → Peso Argentino (ARS)

Real (BRL) → Peso Argentino (ARS)

Peso Argentino (ARS) → Peso Chileno (CLP)

Dólar (USD) → Boliviano (BOB)

Real (BRL) → Peso Colombiano (COP)

As taxas de câmbio são atualizadas automaticamente via API.

🧪 Como executar

Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Abra o projeto em uma IDE Java (como IntelliJ ou Eclipse)

Execute a classe Main.java

O terminal exibirá o menu interativo para seleção da conversão.

🔐 Observações sobre a API

Este projeto utiliza a chave de API gratuita:
https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD
Se quiser usar sua própria chave, você pode se cadastrar gratuitamente em https://www.exchangerate-api.com e substituir a chave no código na classe ApiExangeRate.

📁 Estrutura do projeto

📦 src

 ┣ 📜 Main.java

 ┣ 📜 Metodos.java
 
 ┣ 📜 ApiExangeRate.java
 
 ┣ 📜 Moeda.java (record para JSON)
 
🧠 Aprendizados

✔️ Uso de APIs REST com Java

✔️ Parsing de JSON usando Gson

✔️ Programação orientada a objetos

✔️ Menu interativo no terminal

✔️ Boas práticas com record e separação de responsabilidades


💡 Melhorias futuras

Histórico de conversões

Suporte a mais moedas

Validação de entrada do usuário

🧑‍💻Desenvolvido por [Emerson Ferreira]
[LinkedIn](https://www.linkedin.com/in/emerson-ferreira-sa/) | [GitHub](https://github.com/Emersonefs)
