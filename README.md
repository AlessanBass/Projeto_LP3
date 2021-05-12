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
### Definação de Classes
* **Gastos:**  -> Classe reponsável por manipular tudo referente aos gastos do usuário. Como por exemplo: Nome do gasto, valor do gasto, quantidade de parcelas(caso tenha sido parcelado), valor de cada parcela e etc.
* **Pessoa:** -> Candidata para ser uma classe abstrata. Nela é feito o molde para a criação do perfil do usuário.
*  **Usuário:** -> Classe que herdará Pessoa, ela será especificada.
*  **Escritor:** -> Classe que vai manipular os arquivos, será a responsável por escrever os dados inseridos pelo usuário em um arquivo .dat. (Atualmente estudando sobre arquivos em Java), muito provável que essa classe sofra alterações para a sua melhor implemantação.
*   **Leitura:** -> Classe que vai ler o arquivo com os dados. Nela será feito os cálculos de gastos totais durante o mês, lendo do arquivo os gastos e somando até obter o gasto total. Pois sempre que for adicionado um novo gasto ou despesa o cálculo deve ser feito novamente para ser mostrado ao usuário.
*   **Menu:** -> Classe que serve como "Interface gráfica", mostrará opções para o usuário e de acordo com a sua escolha executará determinada tarefa.

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
    
