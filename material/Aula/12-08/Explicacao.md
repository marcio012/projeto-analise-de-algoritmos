## Explicação da Aula
##### Segunda Feira 12/08/2019

## Classes de Complexidade
* Constante = {$1, 10^2;, 20^{100}, ...$} = $\Theta(1)$

* Logaritmica = {$\log N, \log N + 10^2, ...$} = $\Theta(\log N)$

* Raíz Quadráda = {$\sqrt{n}, \sqrt{n} + 10, ...$} = $\Theta(\sqrt{n})$

* Linear: {$N, N + \sqrt{n}, N + \log n + 10, ...$} = $\Theta(N)$

* Linerítmica = {$N \log n, N \log n + 10^2; = \Theta(N \log n)$

* Quadrática = {$n^2, n^2; n^2 + 10, ...$} = $\Theta(N^2)$

* Cúbica = {$n^3, n^3 + 10n^3 + \log n, ...$} = $\Theta(N^3)$

* Exponencial = {$2^n, 2^n + n^n, ...$} = $\Theta(2^N)$

* Fatorial = {$n!, n! + 10, ...$} = $\Theta(N!)$

> Eficiencia:

Tempo de execução: -> Complexidade do Algoritmo
                   -> Tamanho da Instância
                   -> Máquina
                   -> Estado da Máquina
                   -> Tecnologia
Memória:
Banda Passante:

> Complexidade:

T(N) -> n => tamanho da instância.
     -> T() => Tempo de execurção do algoritmo para uma
               instância de tempo **n**

Tempo -> c1 e uma instrução constante **"custo associado a cada linha"**.

---

> Metódo 1 (N):

```
Print('Olá')      tempo -> c1  | vezes -> 1
Print(N)          tempo -> c2  | vezes -> 1
Print("tchau")    tempo -> c3  | vezes -> 1
```

Complexidade seria: T(n) = $c1 * 1 + c2 * 1 + c3 * 1$ => constante T(n) = **&Theta;(1)**

---

> Metódo 2 (N):

```
Print("Olá")      tempo -> c1  | vezes -> 1
for i = 1 to 3    tempo -> c2  | vezes -> 3 + 1
  print(n)        tempo -> c3  | vezes -> 3
print("tchau")    tempo -> c4  | vezes -> 1
```

Complexidade seria: T(n) = $c1 + 4c2 + 3c3 + c4$ => constante T(n) = **&Theta;(1)**

---

> Metódo 3 (N):

```
Print("Olá")      tempo -> c1  | vezes -> 1
for i = 1 to n    tempo -> c2  | vezes -> n + 1
  print(n)        tempo -> c3  | vezes -> n
print("tchau")    tempo -> c4  | vezes -> 1
```

Complexidade seria: T(n) = $c1 + c2n + c2 + c3n + c4$ => linar T(n) = **&Theta;(n)**
$c1 + c2n + c2 + c3n + c4$
$(c2 + c3)n + c1 + c2 + c4$

---

> Metódo 4 (N):

```
Print("Olá")        tempo -> c1  | vezes -> 1
for i = 1 to 2      tempo -> c2  | vezes -> 2 + 1
  for j = 1 to 3    tempo -> c3  | vezes -> (3 + 1) + (3 + 1)
    print(n)        tempo -> c4  | vezes -> 3 + 3 = 2 * 3
print("tchau")      tempo -> c5  | vezes -> 1
```

Complexidade seria: T(n) = $c1 + 3c2 + 8c3 + 6c4 + c5$ => constante T(n) = **&Theta;(1)**

> Metódo 5 (N):

```
for i = 1 to 3      tempo -> c1  | vezes -> 3 + 1
  print(i)          tempo -> c2  | vezes -> 3
  for j = 1 to n    tempo -> c3  | vezes -> (n + 1) * 3 = 3n + 3
    print(j)        tempo -> c4  | vezes -> 3n
```

Complexidade seria: T(n) = $4c1 + 3c2 + 3c3n + 3c3 + 3c4n$ => linear T(n) = **&Theta;(n)**

> Metódo 6 (N):

```
for i = 1 to n    tempo -> c1  | vezes -> n + 1
  for j = 1 to i  tempo -> c2  | vezes -> [(2 + (n + 1)) * n] / 2 || n^2 ==> peafinita **&Theta;(n^n)**
    print(j)      tempo -> c3 | vezes -> [(1 + n) * n) / 2]  ==> \Theta(n^n)
```

Complexidade seria: T(n) = $$ => quadratica T(n) = **&Theta;(n&sub2;)**

> Metódo 7 (N):

```                               melhor caso                     pior caso
int busca(a[], key)
  for i = 1 to a.lenght     tempo -> c1  | vezes ->  1        tempo -> c1  | vezes -> n + 1
    if(a[i] == key)         tempo -> c2  | vezes ->  1        tempo -> c2  | vezes -> n
      return 1              tempo -> c3  | vezes ->  1        tempo -> c3  | vezes -> 0
  return -1                 tempo -> c4  | vezes ->  0        tempo -> c4  | vezes -> 1

```

Complexidade seria: Tm(n) = linear **&Theta;(1)**
Complexidade seria: Tp(n) = linear **&Theta;(N)**

**OBS: Melhor e pior caso** quando o comportamento e diferente quando tem o mesmo tamanho da instância;

**Ordenação por inserção**

> insert sort(a, n)
```
  for j = 2 to n                                           -> c1
    key = A[j]                                             -> c2
    // Insert A[j] into the sort sequence A[1..j - 1]      -> c3
    i = j - 1                                              -> c4
    while i > 0 and A[i] > key                             -> c5
      A[i + 1] = A[i]                                      -> c6
      i = i - 1                                            -> c7
    A[i + 1] = key                                         -> c8

```

> Interações Melhor Caso:


| Constantes | repetição |
| :--------- | --------: |
| c1         |   (n + 1) |
| c2         |   (n - 1) |
| c3         |         0 |
| c4         |   (n - 1) |
| c5         |   (n + 1) |
| c6         |         0 |
| c7         |         0 |
| c8         |         n |
