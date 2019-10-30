  ## Explicação da Aula
##### Quarta Feira 02/09/2019

### Crescimento da complexidade

> $\Theta(1)$

{1, 10, ...}

> $\Theta(\log n)$

{$\log n$, $3\log n + s$, ...}

> $\Theta(n)$

{$n \lg n$, $n \log n + n$, ...}

> $\Theta(n^2)$

{$n^2$, $n^2 + sn$, ...}

> $\Theta(2^n)$

{$2^n$, $2^n + n^{10}$, ...}

f(n) = O(g(n)) : Se a ordem de crescimento da função f(n) é menor ou igual à ordem de crescimento da função g(n).

**O que significa que ele é menor igual a outro**

f(n) = $\Theta(g(n))$ : Se a ordem de crescimento da função f(n) é igual a ordem de crescimento da função g(n).

**O que significa que ele é igual a outro**

f(n) = $\Omega(g(n))$ : Se a ordem de crescimento da função f(n) é maior ou igual à ordem de crescimento da função g(n)

**O que significa que ele é maior igual a outro**

> Metódo 1 (n):

```algorithmo           custo     #vezes
for i = 1 to n * n        c1      $n^2 + 1$
  for  j = 1 to i         c2
    print(j)              c3
```
<!-- TODO: Estudar a analise de complexidade
material na foto -->

Classe de complexidade:
**$T1(n) = \Theta(n^4)$**

> Metódo 2 (n):

```
for i = 1 to n + n
  for  j = 1 to 1000
    print(j)
```
<!-- TODO: analise do algoritmo esta na foto -->

Classe de complexidade:
**$T2(n) = \Theta(n^2)$**


**Ordem de Crescimento**

$T1(n)$ != $\Theta(T2(n))$ ?

$T1(n)$ != $O(T2(n))$ ?

$T1(n)$ == $\Omega(T2(n))$ ?

Compara-se o nível de complexidade das classes:

Estamos comparando a ordem de crescimento das funções:

Conteudo da prova;
 - Algoritmo por ordenação:
 - Algoritmo por intercalação:
 - Arvore de recursão:
 - Teorema Mestre:
