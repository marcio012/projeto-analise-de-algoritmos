## Explicação da Aula 2 
##### Quarta Feira 07/08/2019

---

> Eficiencia e performace: 

- Mémoria : 
- Banda Pasante: 
- Tempo de Processamento: 

> Influenciam: 

- Linguagem:
- Máquina: 
- Complexidade do Algoritmo:
- Tamanho da Instância:

**Obs:** Tudo que for polinominal e d'veras bom.


> Algoritmo de Soma: 

Somatório de 1 até n:
```
soma1(n)            Tempo   #vezes                    
  soma= 0           c1      1
  for i=1 to n      c2      n + 1
    soma += i       c3      n
  return soma       c4      1
```  
T

```
soma2(n) ==> n é tamanho da instancia
  return (n+1) * n /2  => tempo c1 unidade de tempo == constante || #vezes == 1
```
**T(n) => tempo de excução para uma instância de tamanho "n"**

