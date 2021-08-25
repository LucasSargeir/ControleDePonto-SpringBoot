# API de Controle de Ponto

Projeto construido no bootcamp Satander, disponibilizado pela Digital Innovation One (DIO). O projeto consiste em uma API para controle de ponto, e foi construida utilizando o *framework [Spring Boot](https://spring.io/projects/spring-boot)*.

O modelo de dados utilizado para criação da API pode ser visto na imagem abaixo:

![modelo de dados](https://github.com/LucasSargeir/ControleDePonto-SpringBoot/tree/main/database/modelo.png)



## Banco de Dados

Para o banco de dados foi utilizado o H2, que é um banco de dados relacional escrito em Java. Ele pode ser integrado em aplicativos Java ou executado no modo cliente-servidor.

Todos os modos contam com suporte para bancos de dados persistentes e na memória. Não há limite para o número de bancos de dados abertos simultaneamente ou para o número de conexões abertas.

Através dele podemos utilizar anotações para transformar nossos modelos em entidades relacionais. Para declarar um modelo como uma entidade precisamos seguir 3 passos:

- <u>Definir o modelo como entidade:</u>

  Para isso utilizamos a anotação `@Entity` antes da declaração da classe.

- <u>Definir chave primária:</u>

  Para isso utilizamos a anotação `@id` antes da declaração de um atributo.

  Se a chave for composta é necessário criar uma nova classe que represente essa chave, utilizar o marcador `@Embeddable` nessa classe e utilizar os marcadores `@Id` e `@EmbeddedId` no atributo que representa o objeto da classe criada.

- <u>Definir as chaves estrangeiras (se existir):</u>

  Para definir as chaves estrangeiras declaramos os atributos com o tipo da classe que ele representa e utilizamos marcadores como: `@ManyToOne`, `@ManyToMany`, `@OneToMany`, etc. Para especificar a relação entre eles.



### Auditoria

A auditoria pelo H2 pode ser feita apenas utilizando um marcador `@Audited` na classe modelo.



## Documentação

Para documentação do projeto foi utilizado o módulo *Swagger*. Ele gera uma página onde são apresentadas todas as rotas da API e oferece campos para testar as rotas.



## Variváveis ambiente

As variáveis ambientes do projeto foram armazenadas no arquivo `resources/application.properties`. 

Essas informações são utilizadas para carregar os dados importantes do build. Isso permite criarmos arquivos diferentes para desenvolvimento e produção.



## Build

Para build do projeto foi utilizado o *[graddle](https://docs.gradle.org/current/userguide/userguide.html)*. Que pode ser utilizado pela IDE ou através do comando abaixo, executado a partir da raiz do projeto.

```bash
./gradlew build
```



Se além do *build* você deseje que a aplicação inicie, basta utilizar o comando abaixo:

```python
./gradlew bootRun
```



## Links Úteis

- *[Spring Initializer](https://start.spring.io)*;

  Utilizado para criar esqueletos de projetos com spring boot.

  

- [Pagina de administração do banco](http://localhost:8081/h2/);

  Utilizado para visualizar os dados do banco.

  

- [Documentação da API](http://localhost:8081/swagger-ui.html)

  Documentação da API gerada pelo [*Swagger*](https://swagger.io), pode ser utilizado para testar as rotas.
  
  

- [Página do H2](https://www.h2database.com/html/main.html).

  Página com a documentação do H2. Ele não precisa ser instalado, pois quando for colocado como dependência do projeto ele será baixado de forma local.
