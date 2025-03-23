# 🌟 GabSpringApp

## 📝 Descrição
Este projeto é um exemplo de uso do framework GabSpring. Ele demonstra como utilizar as funcionalidades básicas do GabSpring, como injeção de dependências e mapeamento de rotas.

## 🚀 Tecnologias Utilizadas
- **Java**
- **Maven**
- **GabSpring**

## 📂 Estrutura do Projeto
- `src/main/java/br/gabspringapp/`: Contém a aplicação de exemplo que utiliza o framework GabSpring.
    - `controller/`: Controladores que lidam com as requisições HTTP.
    - `service/`: Serviços que contêm a lógica de negócios.
    - `model/`: Modelos de dados utilizados na aplicação.

## 📦 Funcionalidades
- **Injeção de Dependências**: Utiliza anotações do GabSpring para injetar dependências automaticamente.
- **Mapeamento de Rotas**: Mapeia métodos de controladores para rotas HTTP usando anotações do GabSpring.

## 🛠️ Como Funciona
1. **Anotações**: Utilize anotações como `@GabController`, `@GabService`, `@GabGetMethod`, `@GabPostMethod` e `@GabInjected` para definir controladores, serviços, métodos de requisição e injeção de dependências.
2. **Controladores**: Defina métodos nos controladores para lidar com as requisições HTTP.

## 📚 Exemplo de Uso
### Controlador
```java
@GabController
public class TestController {
    @GabInjected
    private IServiceExample serviceExample;

    @GabGetMethod(path = "/test")
    public String test() {
        return "Hello, World!";
    }

    @GabGetMethod(path = "/produto")
    public Produto exibirProduto() {
        return new Produto(1L, "Produto 1", "Descrição do Produto 1");
    }

    @GabPostMethod(path = "/produto")
    public String cadastrarProduto(@GabBody Produto produto) {
        System.out.println(produto);
        return "Produto cadastrado!";
    }

    @GabGetMethod(path = "/service")
    public String getServiceMessage() {
        return serviceExample.getMessage();
    }
}