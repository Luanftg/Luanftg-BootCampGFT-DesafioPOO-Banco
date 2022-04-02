# BootCampGFT-DesafioPOO-Banco
Desafio de Projeto 1/2 do BootCamp GFT - Quality Assurance

#### OBJETIVO Geral
Exercitar conceitos de Programação Orientada a Objetos, implementando uma classe Banco em Java.

#### JUSTIFICATIVA
Por entender que um registro mínimo de cada operação realizada na classe "Conta" se faz necessário em uma aplicação de banco que se pretende confiável, foi íncluída de maneira inicial, um registro dessa informação com a classe LocalDate utilizando método now() e a inserção - dentro das sobrecargas do metodo movimentacoes() - do valor e data em um ArrayList que armazena temporariamente o registro de cada operação realizada em cada conta;

#### METODOLOGIA
Alterações e Implementações:

Junção dos métodos: sacar(); depositar(); e transferir(); para um único método: movimentacoes(); que recebe agora um parametro LocalDate que registra a data da operação e recebe um Double que, sendo positivo, deposita o valor na conta e sendo negativo, saca o valor da conta, com uma sobrecarga para transferencia que recebe um parametro a mais que no caso é uma contadestino;
2.Implementação do método imprimirExtrato(); que formata e exibe o histórico de movimentações na conta.

#### CONCLUSÃO
Foi possivel criar um registro de cada operação realizada no método Main através de um ArrayList que armazena de forma concatenada a data e o valor da movimentação, simulando a responsabilidade de armazenamento de um banco de dados.
