# JAVA
## Projeto para a Disciplina  de  Linguagem de Proramação III
O projeto consiste na criação de um sistema para auxiliar no cálculo de gastos durante o mês por pessoa.
Será possível criar campos de pessoas e associar gastos a cada pessoa. Bem como fazer o controle de gastos de acordo com o orçamento pessoal.

### Esses gastos incluem:
* Compras no cartão de crédito (Parcelado ou não).
* Empréstimos.
* Compras no débito

Os dados serão armazenados em um arquivo .dat que será guardado localmente. Assim sempre que o usuário desejar verificar os dados, eles estarão
disponíveis offline para consulta.

## Decisões de Design
### Definação de Classes -> Arquitetura do projeto
Projeto está estruturado utilizando o padrão MVC.
* **Pacote modelos**  -> Contém as classes que criam os modelos dos objetos que serão utilizados durante a execução do programa.
* **Pacote visoes** -> Contém as classes que interagem com o usuário mostrando opções e exibindo resultados.
*  **Pacote controles** -> Contém as classes que possuem a lógica para realizar tarefas de acordo com as informações fornecidas pelo usuário.

### Sistema em funcionamento

### Qual as principais vantagens de usar esse sistema?

#### 1. Livre de cálculos no final do mês.

     O sistema irá calcular todos os gastos e despesas do usuário durante o mês, retornando o valor 
     total gasto durante o mês.
#### 2. Controle de gastos.
    
     Será possível definir um orçamento para um determinado mês, sempre que necessário o usuário pode
     conferir o quanto ainda pode ser gasto do seu orçamento.
#### 3. Controle no parcelamento de compras no cartão de crédito.
     Comprou parcelado? Não precisa se preocupar caso se perca no número de parcelas. O usuário 
     terá total controle caso tenha comprado parcelado. Informações como: número de parcelas, 
     total de parcelas pagas e valor de cada parcela, serão mostradas para o usuário.
    
