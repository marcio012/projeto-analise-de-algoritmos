## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Trabalho de Projeto Análises de Algoritmos
##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
Data da Entrega: 11/09/2019

**Questão 1** [2,0 pontos]. Suponha que dois algoritmos, A e B, resolvem um mesmo problema. Assuma ainda que o tamanho das instâncias do problema é dado por um parâmetro n. Para cada item abaixo, assumindo-se n suficientemente grande, indique se A é mais rápido que B, se B é mais rápido que A, ou se não podemos inferir qual dos dois algoritmos é mais rápido. Justifique cada item.

(a) O algoritmo A consome tempo $O(n^2)$ e o B consome tempo $\Theta(n^4)$.

O algoritmo *"A"* e mais rápido pois ele consume $O(n^2)$ no máximo ele e quadratico, enquanto que o *"B"* é um polinomio de 4 Grau.

(b) O algoritmo A consome tempo $\Omega(n)$ e o B consome tempo $\Theta(n^2)$.

O algoritmo *"A"* e mais rápido pois ele consume $\Omega(n)$ no máximo ele e linear, enquanto que o *"B"* é quadratico.

(c) O algoritmo A consome tempo $O(n^2)$ para instâncias de pior caso e o B consome tempo $\Omega(n^3)$ para instâncias de melhor caso.

(d) O algoritmo A consome tempo Ω(n4) para instâncias de pior caso e o B consome O(n3) para instâncias de pior caso.

Não podemos fazer inferir qual dos dois são mais rápidos, pois o que temos de informação é que o algoritmo *"A"* tem no máximo de consumo $O(n^2)$ isso diz que no seu pior caso é de complexidade $O(n^2)$, ou seja tem um limete superio de $O(n^2)$ **quadrático** não menos que isso, já o algoritmo *"B"* não posso afirma pois a notação $\Theta$ define um limete assintotico justo ou seja ele estar entre essa complexidade de comsumo

O mesmo acontece aqui, so que com um diferença, a anotação $\Omega$ define limete assintótico inferior ou seja no máximo sua complexidade será de $n$ ou seja **linear**, ja a anotação $\Theta$, como foi dito acima ela não

**Questão 2** [2,0 pontos]. Aplique o método mestre para resolver as seguintes recorrências.

**(a)** $T(n) = 4T(n/4) + n$

<!-- $T(n) = aT(\frac{n}{b}) + [d(n) + f(n)]$ -->
$T(n) = 4T(\frac{n}{4}) + n$

1. passo identificar:
  a = 4, b = 4 e $f(n) = n$
2. passo calcular valor base
  $n\log_b a = n\log_4 4 = n^1 = n$
3. passo comparar
  $f(n) = a = $\Theta(n)$
4. passo atribuir
  $f(n) = n$ $\Rightarrow$, $\Theta(n \log_b a) = \Theta(n \log_4 4) = \Theta(n \log n) \Rightarrow \Theta(\log n)$
$\Rightarrow$, caso 2
**(b)** $T(n) = 1T(n/3) + n$

1. passo identificar:
  a = 1, b = 3 e $f(n) = n$
2. passo calcular valor base
  $n\log_b a = n\log_3 1 = n^0 = 1$
3. passo comparar
  $f(n) = 1$ || f(n) = c $\Rightarrow$, caso 1
4. passo atribuir
  $f(n) = n$ $\Rightarrow$, $\Theta(n \log_b a) = \Theta(n \log_4 4) = \Theta(n \log n) \Rightarrow \Theta(\log n)$

<!-- $T(n) = aT(\frac{n}{b}) + [d(n) + f(n)]$ -->
$T(n) = 1T(\frac{n}{3}) + cn$
$f(n) = cn$
<!-- $f(n) = O(n \log_b A- \epsilon)$ -->
$f(n) = O(n \log_3 1 - \epsilon)$
$T(n) = \Theta(n^0)$
$T(n) = \Theta(1)$

**(c)** $T(n) = 9T(n/3) + n$

<!-- $T(n) = aT(\frac{n}{b}) + [d(n) + f(n)]$ -->
$T(n) = 6T(\frac{n}{3}) + cn$
$f(n) = cn$
<!-- $f(n) = O(n \log_b A- \epsilon)$ -->
$f(n) = O(n \log_3 9 - \epsilon)$
$T(n) = \Theta(n^0)$
$T(n) = \Theta(1)$

**(d)** $T(n) = 2T(n/2) + n2$

**Questão 3** [2,0 pontos]. Utilize uma árvore de recursão para determinar o limite assintótico estrito (notação Θ) para a equação de recorrência T(n) = 4T(n/2) + n.


