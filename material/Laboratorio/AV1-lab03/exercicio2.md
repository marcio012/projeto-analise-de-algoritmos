## N584 – Projeto e Análise de Algoritmos
### Prof. Napoleão Nepomuceno
#### AV1 - Lab03
##### Data do Laboratório: 21/08/2019
##### Márcio Heleno **Matrícula: 1814038**

---

> Entrega do trabalho:
Data da Entrega: 25/08/2019 (enviar arquivos .odt e .ods)

### Exercício 2

- **Passo 1**: Realizar a análise de complexidade para o método abaixo. (20%)

```java
static void metodo1 (int n) {                          tempo    *vezes
  System.out.println("inicio");                           c1       1
  for (int i = 1; i <= n*n; i++) {                        c2    (n * n) + 1 = (n^2) + 1 = \Thetra(n^2)
	  for (int j = 1; j <= i; j++) {                        c3    (n^2 + 1) + (nˆ2 + 1) + ... = n^2 (n^2) + 1 = \Thetra(n^4)
		  System.out.println(j);                              c4    (n^2 + n^2 + ...) = n^2 * n^2 = \Thetra(n^4)
	  }
  }
  System.out.println("fim");                              c5        1
}
```

> O algoritmo tem a complexidade de

$\Theta(n^4)$

**Passo 2**: Monte a equação de recorrência do método abaixo. (15%)

```java
static void metodo2 (int n) {
  if (n > 1) {
  	System.out.println(n);
  	metodo2(n/2);
  	metodo2(n/2);
  	metodo2(n/2);
  	metodo2(n/2);
  } else {
  	System.out.println(n);
  }
}
```

$$T(n) = 4 * T(\frac{n}{2}) + c$$

**Passo 3**: Resolva a equação de recorrência por uma árvore de recursão. (15%)

[voltar](../../../README.md)
