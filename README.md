# Desafios de Programação Orientada a Objetos

Este projeto contém quatro desafios que exploram conceitos fundamentais da Programação Orientada a Objetos (POO) em
Java, incluindo Polimorfismo, Herança, Encapsulamento e Interfaces.

## 1. Polimorfismo

**Desafio**: Desenvolva um sistema de gerenciamento de pagamento onde diferentes tipos de funcionários (por exemplo,
`Funcionario`, `Gerente`, `Diretor`) possuem métodos próprios para calcular o salário.

### Requisitos

- Cada classe deve implementar seu próprio método de cálculo de salário, utilizando polimorfismo.
- Em uma classe `FolhaPagamento`, crie um método que receba uma lista de funcionários e imprima o salário de cada um,
  chamando o método correto de acordo com o tipo do funcionário.

## 2. Herança

**Desafio**: Crie uma hierarquia de classes para representar veículos em uma concessionária.

### Requisitos

- Comece com uma classe `Veiculo` que contém características básicas, como `marca`, `modelo` e `ano`.
- Crie classes `Carro`, `Moto` e `Caminhao` que herdam de `Veiculo` e possuem propriedades específicas, como
  `quantidadeDePortas` para `Carro` e `capacidadeDeCarga` para `Caminhao`.
- Implemente um método para exibir informações detalhadas de cada veículo, demonstrando o uso da herança.

## 3. Encapsulamento

**Desafio**: Desenvolva uma classe `ContaBancaria` que represente uma conta em um banco.

### Requisitos

- A classe deve ter atributos privados, como `saldo` e `titular`.
- Implemente métodos públicos para `depositar` e `sacar`, garantindo que o saldo não fique negativo (verificação no
  método `sacar`).
- Adicione métodos para visualizar o saldo e alterar o titular, garantindo que os valores sejam acessados e modificados
  de forma segura e controlada.

## 4. Interface (Contrato)

**Desafio**: Crie uma interface `AreaCalculavel` que declare um método `calcularArea()`.

### Requisitos

- Implemente a interface `AreaCalculavel` em classes como `Retangulo`, `Circulo` e `Triangulo`.
- Cada classe deve fornecer sua própria implementação para o cálculo da área.
- Em uma classe principal, crie uma lista de objetos `AreaCalculavel` e calcule a área de cada objeto, mostrando o uso
  do contrato da interface.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para implementação dos desafios.
- **Orientação a Objetos**: Exploração de conceitos fundamentais como Polimorfismo, Herança, Encapsulamento e
  Interfaces.

## Executando o Projeto

Para testar cada desafio, clone este repositório e execute o código-fonte de cada módulo individualmente, conforme as
instruções nos comentários das classes.

---

Explore este repositório para praticar e reforçar seu entendimento sobre os principais pilares da Programação Orientada
a Objetos!
