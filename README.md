Criar contas em um banco, as quais devem conter:
- (-) Nome do clinte;
- (#) Tipo da conta (cc/cp);
- (+) Número da conta;
- (-) Saldo;
- (-) Status (aberta/fechada).

Deve ser possível executar as seguintes ações:
- Abrir conta; OK
- Fechar conta; OK 
- Depositar; OK
- Sacar; OK
- Pagar mensalidade. OK

Regras:
- Se for aberta conta tipo CC, ganha-se 50 reais; OK
- Se for aberta conta tipo CP, ganha-se 150 reais; OK
- Para fechar a conta:
    1. não pode ter saldo; OK
    2. não pode ter débitos. OK
- Para depositar, a conta não pode estar fechada;
- Para sacar:
    1. a conta não pode estar fechada;
    2. precisa ter algum saldo;
    3. o saque deve ser menor ou igual ao saldo da conta;
- Para pagar a mensalidade, debita-se do cliente da CC 12 reais, e do cliente da CP 20 reais.

Todos os métodos são públicos, e devem ser também criados os métodos getter/setter de cada atributo.

_____________________________________________________________________________________________

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

_________________________________________________________________________________________
