## Explicação da Aula
##### Segunda-Feira 26/08/2019

---

##### Complexidade assintótica

Em ciência da computação e matemática aplicada, particularmente a análise de algoritmos, análise real, e engenharia, análise assintótica é um método
de descrever o comportamento de limites.

Exemplos incluem o desempenho de algoritmos quando aplicados a um volume muito grande de dados de entrada, ou o comportamento de sistemas físicos quando eles são muito grandes.

##### Crescimento Assintótico de Funções

* Escolha do algoritmo não é um problema crítico quando **n** é pequeno.

* O problema é quando **n** cresce.

* Por isso, é usual analisar o comportamento das funções de custo quando **n** é bastante grande:

* Analisa-se o comportamento assintótico das funções de custo;

* Representa o limite do comportamento da função de custo quando **n** cresce.

##### Eficiência assintótica dos algoritmos

* estuda a maneira como o tempo de execução de um algoritmo aumenta com o tamanho da entrada no limite, àmedida que o tamanho da entrada aumenta indefinidamente (sem limitação)

* em geral, um algoritmo que é assintoticamente mais eficiente será a melhor escolha para toda as entradas, exceto as pequenas.

##### Classificação das funções

Quando maior o valor de f(n), maior é o número de instruções que precisam ser executadas para que  o algoritmo apresente a resposta, ou seja, mais tempo o algoritmo demora.

![Gráfigo](img/grafico_de_Big_o.png "Gráfico de f(n) e g(n)")

> Lembrando das complexidades mais comuns:

* $\Theta(1)$ - **constantes**: $\Rightarrow$ {$1, 10, 10^8, ...$}

* $\Theta(\lg n)$ - **logarítimica**: $\Rightarrow$ {$\lg n, 10 \lg n + 10, ...$}

* $\Theta(n)$ - **linear**: $\Rightarrow$ {$ n, 5n + lg n, ...$}

* $\Theta(n)$ - **linearítmica**: $\Rightarrow$ {$ n \lg n, \frac{1}{10} n \lg n + n, ...$}

* $\Theta(n^2)$ - **quadrática**: $\Rightarrow$ {$ n^2, n^2 + 7n + 3, ...$}

* $\Theta(2^n)$ - **exponencial**: $\Rightarrow$ {$ 2^n, 2^n + n^{10}, ...$}

> Lembrando que o crescimento de complexidade:

$\Theta(1) \Rightarrow \Theta(2^n)$:
$\Theta(1) \leftarrow O(n)$:
$\Omega(n) \rightarrow \Theta(n^2)$:

---

Esse gráfico ajuda a perceber o crescimento da função mediante a instancias do problema. [Gráfico](https://www.geogebra.org/m/UubYHCKB)

##### Relacionamento Assintótico

**Definição:**

Quando uma função $f(n)$ é $O(g(n))$, a função $g(n)$ impõe a $f(n)$ um limite assintótico superior. Ou seja, multiplicada por uma constante *c*, a função $g(n)$ limita superiormente a função $f(n)$, a partir de um determinado no.

A expressão $f(n)$ = $O(g(n))$ significa que $f(n)$ não cresce mais que $g(n)$, podendo crescer de forma igual ou inferior.

**Exemplo 01**

Uma função **g(n)** domina ou impõe um limite superior assintoticamente outra função **f(n)** se existir duas constantes positivas **c** e **m** tais que, para $n \geq m$, tem-se $|f(n)| \leq c * |g(n)|$.

$g(n) = n$ e $f(n) = n^2$

Alguém domina alguém?

$|n| \leq |n^2|$, para todo $n \in N$ para c = 1 e m = 0 $\Rightarrow |g(n)| \leq |f(n)|$.

Portanto, f(n) domina assintoticamente g(n).

O valor da constante *m* mostrado é o menor valor possível,mas qualquer valor maior também é válido.

![Gráfigo](img/Grafico.png "Gráfico de f(n) e g(n)")


**Exemplo 02**

$g(n) = (n + 1)^2$ e $f(n) = n^2$

Alguém domina alguém?

![Gráfigo](img/Grafico_2.png "Gráfico de f(n) e g(n)")

$|n| \leq |(n + 1)^2|$, para todo $n \geq 0$ $\Rightarrow$ $g(n)$ domina $f(n)$.


