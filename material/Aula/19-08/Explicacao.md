## Explicação da Aula 4
##### Segunda-Feira 19/08/2019

---

> Divisão e Conquista:

    > Consiste em desmembrar o problema em vários subproblemas que são semelhantes ao problema original, mas de menor tamanho, resolvendo os subproblemas recursivamente e depois combinam essas soluções com o objetivo de criar uma solução para o problema original.

![Foto 01!](img/IMG_3421.JPG "explicação da lousa")

> O Paradigma de divisão e conquista envolve três passos em cada nível da recursão.

* **Divisão:** do problema em determinado número de subproblema, que são as instancias menores do problema original.
* **Conquista:** os subproblemas, resolvendo-os recursivamente. Porém, se os tamanhos dos subproblemas forem pequenos o bastante, basta resolver os subproblemas de maneira direta.
* **Combinação:** as soluções dadas aos subproblemas na solução para o problema original.

O algoritmo de **ordenação por intercalação** a seguir obedece rigorosamente ao paradigma de divião e conquista.

**Modo de Funcionamento :**

> **Divisão**: Divide a sequência de *n* elementos que deve ser ordenada em duas subsequências de \(\frac{n}{2}\) elementos cada uma.
> **Conquista**: Ordena as duas subsequências recursivamente, utilizando a ordenação por intercalação.
> **Combinação**: Intercala as duas subsequências recursivamene, utilizando a ordenação por intercalação.
> A recursão "extingue-se" quando sequências a ser ordenadas tiver comprimento 1.

![Foto 02!](img/IMG_3422.JPG "explicação")

$Q(N) = 2Q (\frac{n}{2}) +1$ > Equação de Recorencia.

Q: quantidade de recortes para se resolver um problema de tamanho $\frac{n}{2}$

* Função:

$Q(4) = 2Q (\frac{4}{2}) +1 = 3$

* Função:

$Q(2) = 2Q (\frac{2}{2}) +1 = 1$

* Função:

$Q(1) = 0$

> Nota:
> Q(N): quantidade de recortes se resolve um problema de tamanho "N".

| Descrição | Quantidade |
| --------- | ---------- |
| Q(1)      | 0          |
| Q(2)      | 1          |
| Q(4)      | 3          |
| Q(8)      | 7          |
| Q(16)     | 15         |

![Foto 03!](img/IMG_3423.JPG "explicação")

* Função Recursiva:

> Em ciência da computação, a recursividade é a definição de uma sub-rotina (função ou método) que pode invocar a si mesma. Um exemplo de aplicação da recursividade pode ser encontrado nos analisadores sintáticos recursivos para linguagens de programação.

* Algoritmo recursivo

```
int soma(V, i, f)
  if(i == f)
    return v[i]
  return v[i] + soma(v, i + 1, f)
```

* Algoritmo iterativo

```
int soma(V, n)
  res = 0
  for i=1 to n
    res = res + v[i]
    return v[i]
  return v[i] + soma(v, i + 1, f)
```

![Foto 03!](img/IMG_3424.JPG "explicação da lousa")

> Algoritmos:

```
INT soma(V, i, f)
  if(i == f)
    return V[i]
  return V[i] + soma(V, i, f)
```
> Aplicação do algoritmo:

Quando um algoritmo contém uma chamada recursiva a sim próprio, seu tempo de execução pode ser descrito frequentemente por uma **equação de recorrencia**.

T(N) => Tempo de constate

\(
  f(n) =
  \begin{cases}
    \Theta(1)                       & \text{se } n \leq \text{ c.}\\
    aT(\frac{n}{b}) + D(n) + C(n)   & \text{caso contrário }
  \end{cases}
\)

\(T(N) = 1 * T(N - 1)\)    => +c || \(\Theta(1)\)

Desmembramos o tempo de execução do modo explicado a seguir.

**Divisão**: etapa de divisão simplemente calcula o ponto médio do subarranjo, o que demora um tempo constante. Portanto \(D(n) = \Theta(1)\)

**Conquista**: Resolvemos recursivamente dois subproblemas, cada um de tamanho \(\frac{n}{2}\), o que contribui com \(2T(\frac{n}{2})\) para tempo de execução.

**Combinação**: Já observamos que o procedimento *MERGE* em um subarranjo de *n* elementos leva o tempo \(\Theta(n)\); assim. \(C(n) = \Theta(n)\)

Quando somamos as funções \(D(n)\) e \(C(n)\) para análise da ordenação por intercalação, estamos somando uma função que é \(\Theta(n)\) a uma função que é \(\Theta(1)\). Essa e uma soma é uma função *linear* de n, ou seja, \(\Theta(n)\). A adição dessa função ao termo \(2T(\frac{n}{2})\) da etapa de *conquista* fornece a recorrência para o tempo de execução do pior caso \(T(n)\) da ordenação por intercalação.

\(
  T(n) =
  \begin{cases}
    \Theta(1)                       & \text{se } n = 1 \\
    2T(\frac{n}{2}) + \Theta(n)     & \text{se } n \geq 1
  \end{cases}
\)

> Obs. No teorema mestre podemos mostrar que \(T(n)\) é \(\Theta(n \lg n)\), onde \(\lg n\) significa \(\log_2 n\). Como a função logarítmica cresce mais lentamente do que qualquer função linear, para entradas suficientemente grandes, o desempenho da ordenação por intercalação, com seu tempo de execução \(\Theta(n \lg n)\), supera o da ordenação por inserção, cujo o tempo de execução é \(\Theta(n^2)\), no pior caso.

\(
  T(n) =
  \begin{cases}
    c                               & \text{se } n = 1 \\
    2T(\frac{n}{2}) + cn     & \text{se } n \geq 1
  \end{cases}
\)

> Nomeando

\(
  T(N) = 2T (\frac{n}{2}) + \Theta(n)
\)

![Foto 03!](img/img_formula.JPG "nomeação do componentes")

> Exemplo:

Soma:

|   7   |   2   |   1   |   6   |
| :---: | :---: | :---: | :---: |

```
  S(1, 4)
    7 + 5(2, 4) = 16

  S(2, 4)
    2 + 5(7, 4) = 9

  S(3, 4)
    1 + 5(4, 7) = 7

  S(1, 4)
    = 6
```

Soma 2 Recursivo:

|   7   |   2   |   1   |   6   |
| :---: | :---: | :---: | :---: |

\(
  T(N) = 2T (\frac{n}{2}) + c
\)

\(T(N) = 2T (\frac{n}{2}) + \Theta(1)\)

---

```
  S(1, 4)
    S(1, 2) + s(3x4) = 16

  S(1, 2)
    S(1, 1) + s(2x2) = 9

  S(7, 1) = 7

  S(1,1) =2

```

[voltar](../../../README.md)
