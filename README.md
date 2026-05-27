# Aula: Introdução à programação funcional

Este repositório contém exemplos de programação funcional e concorrente em Java, incluindo demonstrações de funções de primeira classe, funções de ordem superior e abordagens imperativa/funcional para concorrência.

## Estrutura do Projeto

```text
src/
  FirstClassFunctions.java
  HigherOrderFunctions.java
  account/
    FunctionalConcurrency.java
    ImperativeConcurrency.java
```

## Conteúdo

- **FirstClassFunctions.java**: Demonstra funções de primeira classe com interfaces funcionais customizadas (`UnaryFunction`, `BinaryFunction`, `TernaryFunction`) e interfaces padrão do Java (`Function`, `BiFunction`).
- **HigherOrderFunctions.java**: Exemplos de funções de ordem superior com implementação de `map` e geração dinâmica de operações aritméticas via `genOperation`.
- **account/ImperativeConcurrency.java**: Exemplo de concorrência imperativa com estado compartilhado (`balance`), `ExecutorService` e método `deposit` sincronizado para evitar condição de corrida.
- **account/FunctionalConcurrency.java**: Exemplo funcional de processamento concorrente com `parallelStream` e `reduce`, evitando mutação compartilhada explícita.

## Como Executar

1. Compile todos os arquivos Java, direcionando os arquivos `.class` para um diretório de saída (por exemplo, `bin`):
   ```bash
   javac -d bin src/*.java src/account/*.java
   ```
2. Execute o exemplo desejado:
   ```bash
   java -cp bin FirstClassFunctions
   java -cp bin HigherOrderFunctions
   java -cp bin account.ImperativeConcurrency
   java -cp bin account.FunctionalConcurrency
   ```
3. Alternativamente, utilize o modo de execução presente no VS Code ou outra IDE de sua preferência.

## Requisitos
- Java 11 ou superior

## Dev Containers e Codespaces

Este projeto está preparado para ser utilizado em ambientes de desenvolvimento baseados em containers, como o [GitHub Codespaces](https://github.com/features/codespaces) e o [Visual Studio Code Dev Containers](https://code.visualstudio.com/docs/devcontainers/containers).

- Basta abrir o repositório no Codespaces ou em um ambiente com suporte a Dev Containers para ter uma configuração pronta para desenvolvimento em Java.
- O ambiente já inclui o Java, extensões recomendadas e configurações para facilitar a execução e depuração dos exemplos.
- Para usar no Codespaces, abra a página do repositório no GitHub e clique em "Code" > "Codespaces" > "New codespace".
- Para usar no VS Code com Dev Containers, instale a extensão "Dev Containers" e abra o repositório em um container de desenvolvimento. Assume-se que você já tenha o Docker instalado e configurado em sua máquina local.

Assim, você pode começar a programar imediatamente, sem necessidade de configurar o ambiente manualmente.