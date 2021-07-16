# JAVA
## Projeto para a Disciplina  de  Linguagem de Proramação III
O projeto consiste na criação de um sistema para auxiliar no cálculo de gastos durante o mês por pessoa.

### Esses gastos incluem:
* Compras no cartão de crédito (Parcelado ou não).
* Empréstimos.
* Compras no débito

Os dados serão armazenados em um arquivo .txt que será guardado localmente. Assim sempre que o usuário desejar verificar os dados, eles estarão
disponíveis offline para consulta.

## Decisões de Design
### Definação de Classes -> Arquitetura do projeto
Projeto está estruturado utilizando o padrão MVC.
* **Pacote modelos**  -> Contém as classes que criam os modelos dos objetos que serão utilizados durante a execução do programa.
* **Pacote visoes** -> Contém as classes que interagem com o usuário mostrando opções e exibindo resultados.
*  **Pacote controles** -> Contém as classes que possuem a lógica para realizar tarefas de acordo com as informações fornecidas pelo usuário.

### Sistema em funcionamento
* **Página inicial do programa:**

Ao executar o programa o usuário encontrará a seguinte tela:

   ![Imagem de Pagina Inicial](https://github.com/AlessanBass/Projeto_LP3/blob/master/Pagina_Inicial.png)
  
O usuário pode navegar pelo sistema digitando os números correspondentes a opção desejada.

* **Caso o usuário digite a opção 1:**

Ao escolher a opção 1 o programa entra na parte de cadastrar uma despesa. Basta apenas informar os dados pedidos na tela:

   ![Ex_Digito_1](https://github.com/AlessanBass/Projeto_LP3/blob/master/Ex_Digito_1.png)
   
**ATENÇÃO: Ao colocar valores fracionários (Ex: R$ 22.50) utilizar o "." para separar a parte inteira da parte fracionária. Caso utilize "," o programa vai acusar erro, pois o Java reconhece o "." como o operador de números fracionários.**
    
Ao preecher o nome e o valor da despesa o usuário vai se deparar com uma mensagem perguntando se a compra foi parcelada ou não. Caso tenha sido parcelado basta informar o número de parcelas e a quantidade de parcelas pagas (caso alguma parcela já tenha sido paga).

   ![Ex_Compra_Parcelada](https://github.com/AlessanBass/Projeto_LP3/blob/master/Ex_Compra_Parcelada.png)
* **Caso o usuário digite a opção 2:**

Ao escolher a opção 2 será exibida uma lista de todas as compras realizadas e suas demais informações. Logo abaixo é apresentado o valor total das despesas cadastradas.

   ![Ex_Digito_2](https://github.com/AlessanBass/Projeto_LP3/blob/master/Ex_Digito_2.png)
   
* **Caso o usuário digite a opção 3:**

A execução do programa é encerrada. E uma mensagem de agradecimento é exibida para o usuário.

### Como instalar ?
Para fazer o download do arquivo executável basta clicar no link: [Download](https://drive.google.com/file/d/1qt_VRadlUTeKobowNAh-fyNGRIy0urik/view?usp=sharing)

Após fazer o download localizar a pasta onde o arquivo foi baixado.

Pressione a tecla **Windows** e digite **cmd**. O prompt de comando será aberto.

Copie e cole o local onde o arquivo executável está salvo utilizando o gerenciador de arquivos.

No Prompt de Comando digite: *cd 'caminho do arquivo executável'* (sem as aspas) e pressione a tecla **enter**.

   ![Executando_1](https://github.com/AlessanBass/Projeto_LP3/blob/master/Executando.png)
   
Feito isso digite: **java -jar Projeto_LP3.jar** esse comando faz rodar o executável.

   ![Executando_2](https://github.com/AlessanBass/Projeto_LP3/blob/master/Executando_2.png)
   
E pronto! Já pode começar a utilizar o programa. Quando quiser utilizar basta fazer o procedimento.

**ATENÇÃO: Na primeira vez que  for utilizar o programa o arquivo onde serão guardados os dados ainda não foi criado. Portanto, se na primeira vez você escolher a opção 2 o programa vai acusar um erro. Para evitar-lo, na primeira vez prefira inserir primeiro uma despesa optando pela opção 1.**

### Qual as principais vantagens de usar esse sistema?

#### 1. Livre de cálculos no final do mês.

     O sistema irá calcular todos os gastos e despesas do usuário durante o mês, retornando o valor 
     total gasto durante o mês.
     
#### 2. Controle no parcelamento de compras no cartão de crédito.
     Comprou parcelado? Não precisa se preocupar caso se perca no número de parcelas. O usuário 
     terá total controle caso tenha comprado parcelado. Informações como: número de parcelas, 
     total de parcelas pagas e valor de cada parcela, serão mostradas para o usuário.
    
