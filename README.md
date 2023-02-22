<h1 align="center"> Algoritmos em java </h1>
<h3 align="center"> Repositório criado para estudar e entender melhor os algoritmos. </h3>
<p align="center">
  <img width="650" height="450" src="https://user-images.githubusercontent.com/80695387/219979188-dc5ac9af-2ac7-4502-af13-ba2633ed743b.png">
</p>


# *Fontes que utilizarei:*
- Algoritmos em java, do Guilherme Silveira. O livro pode ser encontrado aqui: https://www.casadocodigo.com.br/products/livro-algoritmos-java
- Estrutura de dados com java, 2Guarinos - A playlist pode ser encontrada aqui: https://www.youtube.com/playlist?list=PLTLAlheiUm5FRR5BNn4iBFwzYHiNq2Iv2

 # *Principais algoritmos vistos:*
  `Lineares`
- Menor valor: algoritmo simples feito para encontrar o menor valor dentro de um array de valores - se for invertido encontrará o maior. É um algoritmo linear e tem como fórmula O(n). 
</br> *Exemplo de gráfico linear:*
<p align="center">
  <img width="650" height="450" src="https://user-images.githubusercontent.com/80695387/219978765-071a9645-0678-4238-8b00-f688bf663561.jpeg">
</p>

`Quadráticos:`
- Selection Sort: algoritmo de ordenação que compara toda a lista com a posição atual do loop e se encontrar um menor, inverte os valores. É um algoritmos quadrático e tem como fórmula O(2^n)

- Insertion Sort: também responsável por ordenação que compara o valor atual com o seguinte, após conferir os anterios, e se for maior, troca de posição, se não for, copara com o seguinte e se necessário, troca a posição . Também é um algoritmo quadrático, e portanto tem como fórmula O(2^n)

</br> *Exemplo de gráfico quadrático:*
<p align="center">
  <img width="650" height="450" src="https://user-images.githubusercontent.com/80695387/219978889-5865a93c-d8dc-4869-8c14-b2efe1ac5f82.jpeg">
</p>

*Comparação entre entre os dois algoritmos:* 
<p align="center">
  <img width="650" height="450" src="https://user-images.githubusercontent.com/80695387/219978892-516dd104-7c73-4bda-b198-4e451c026b67.jpeg">
</p>

`Logarítimicos:`
- Busca binária: faz um busca rápida e eficaz, sempre divindo o vetor ao meio para ter uma melhor performance. É um algoritmo logarítmico e sua fórmula é: O(log n).
- Merge Sort: algoritmo de ordenação de valores baseado em duas etapas: divisão e intercalação/união. Desemepenho mediano, e bom para ser utilizado com grandes vetores. O java utiliza-o como algoritmo de ordenação em sua classe Collections, como pode ser visto aqui no JavaDoc: https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
- Quick Sort: um dos algoritmos mais rápidos - se não for o mais rápido. Ele também divide o vetor em vetores menores, mas utiliza um pivot para ordenar.

</br> *Exemplo de gráfico logarítmico:*
<p align="center">
  <img width="650" height="450" src="https://user-images.githubusercontent.com/80695387/219978892-516dd104-7c73-4bda-b198-4e451c026b67.jpeg">
</p>

# *Considerações*
 `Lineares`: São algoritmos lentos para grandes vetores, pois possuem um crescimento proporcional e linear ao número de operações;
 `Quadráticos`: Tem seu crescendo em parábola e por isso acabam sendo ruins para vetores onde são necessárias muitas operações, e portanto possuem um péssimo desempenho ao considerarmos o tempo de execução das operações.</br>
 `Logarítimicos`: São ideias para grandes vetores, pois os dividem sempre ao meio e melhoram o seu desempenho. São logarítmicos e muito mais agéis. Todos os citados utilizam a técnica do dividir para conquistar.
