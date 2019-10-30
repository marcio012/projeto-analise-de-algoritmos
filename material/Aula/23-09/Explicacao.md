## Explicação da Aula 5

##### Segunda-Feira 23/09/2019

> Heap-Sort:

- Algoritmo de ordenação, seu tempo de ordenação é $O(n \lg n)$
- Ordena no local
- Usa a estrutura de dados _heap_

> _Estrutura de dados heap_ é tipo específico de uma árvore binária. Uma estrutura de prioridades, na forma de **_árvore binaria completa_**, que representa uma ordem parcial entre os elementos do conjunto.

Um arranjo A que representa um heap é um objeto com dois atributos:

- _A.tamanho-do-heap_ $\to$ que representa quantos elemento no heap estão armazenados dentro do arranjo `A[1.. A.comprimento]` possa conter números, só os elementos em `A[A.tamanho-do-heap]`, onde `A.tamanho-do-heap <= A.comprimento`, são elementos válidos no heap.

Podemos calcular em um indice _i_ de um nó, seu índice pai, do filho da esquerda e do filho à direita:

```
Parent(i)
return [i/2]

Left(i)
return 2i

Right(i)
return 2i + 1
```

**Obs:** e uso no algoritmos com arranjos iniciados com 1:

```
Parent(i)
return [i/2]

Left(i)
return (2 * i) + 1

Right(i)
return (2 * i) + 2
```

**Obs:** e uso no algoritmos com arranjos iniciados com 0:

> Caracteristicas:

1. A árvore está completamente preenchida em todos os níveis exceto talvez o mais baixo;
2. Nível mais baixo preenchido a partir da esquerda

Tipos:

- Heap Máximo:
  ![Heap Máximo](https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Max-Heap.svg/480px-Max-Heap.svg.png)

$\implies$ Para todo nó o **pai é maior ou igual** aos filhos ou seja `A[Parent(i)] >= A[i]`:

```
A[i] >=FILHO_ESQ(i)
A[i] >=FILHO_DIR(i)
```

$\implies$ O maior elemento de heap máximo está armazenado na raíz

$\implies$ O heap máximo é usado em algoritmos de classificação como o **HEAP-SORT**

- Heap Mínimo:
  ![Heap Mínimo](https://camo.githubusercontent.com/16e4220b69a866f97cc20d934c4b16fe5b9147de/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f362f36392f4d696e2d686561702e706e67)

$\implies$ para heap minimo é processada de forma oposta ao heap máximo: `A[Parent(i)] <= A[i]`

$\implies$ O menor elemento de heap mínimo está armazenado na raíz

```
A[i] <=FILHO_ESQ(i)
A[i] <=FILHO_DIR(i)
```

> Curiosidade:

- um heap que armazena n keys tem altura $O(\log n)$
  $n = t_n$

- o numero total de nós em $(t_n)$ em uma árvore binária cheia de altura h é:
  $t_n = (2^h -1)$

- formula, numa arvore binária completa, a altura _h_ de uma árvore é dada por:
  $h = \log_2(t_n + 1)$

> MAX-HEAPIFY

- Pseudo-codigo

```
Max-Heapify(A, i)
1. l = Left(i)
2. r = Right(i)
3. if l <= A.tamanho_do_heap e A[i] > A[i]
4.    maior = l
5. else maior = i
6. if <= A.tamanho_do_heap e A[r] > A[maior
7. maior = r
8. if maior != i
9.    troca A[i] com A[maior]
10.   Max-Heapify(A, maior)

```

- Java

```java
1. static void maxheapfy (int[] V, int i) {
2.   int l = left(i);
3.   int r = right(i);
4.   int maior = 0;

5.   if (l <= V.length && V[l] > V[i]) {
6.     maior = l;
7.   } else {
8.     maior = i;
9.   }

20.  if (r <= V.length && V[r] > V[maior]) {
21.    maior = r;
22.  }

23.  if (maior != i) {
24.    int trocar = V[i];
25.    V[i] = V[maior];
26.    V[maior] = trocar;
27.    maxheapfy(V, i);
28.   }
29. }
```

O tempo de execução de _Max-Heapfy_ em uma subárvore de tamanho _n_ com raiz em um dado nó _i_ é o tempo $\Theta(1)$ para corrigir as relações entre os elementos `A[i]`, `A[Left(i)]` e `A[Right(i)]`, mais o tempo para executar _Max-Heapfy_ em uma subárvore com raiz em um dos filhos do nó _i_ (considerando que a chamada recursiva ocorre). Cada uma das subárvores dos filhos tem, no máximo, tamanho igual a $(\frac{2n}{3})$ - o pior caso ocorre quando a última linha da árvore está exatamente metade cheia, e portanto, podemos descrever o tempo de execução de _Max-Heapfy_ pela recorencia

$$T(n) <= T(\frac{2n}{3}) + \Theta(1)$$

A solução para essa recorrência, de acordo com o caso 2 do teorema mestre, é $T(n) = O(\lg n)$. Como alternativa podemos caracterizar o tempo de execurção de _Max-Heapfy_ em um nó de altura _h_ como $O(h)$.
