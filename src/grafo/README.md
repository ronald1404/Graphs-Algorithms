###Imagem do grafo utilizado para teste do algoritmo

![grafo]( /src/grafo/img/WUwWkgcdDNwvgCMp.png)

### Matriz de Adjacência 
![grafo]( /src/grafo/img/matriz.png)

### Resultado da busca

```java
d[0] = 1
cor[0] = cinza

d[1] = 2
cor[1] = cinza

d[2] = 3
cor[2] = cinza

d[3] = 4
cor[3] = cinza

d[4] = 5
cor[4] = cinza

d[5] = 6
cor[5] = cinza

f[5] = 7
cor[5] = preto
pi[5] = 4

d[6] = 8
cor[6] = cinza

d[7] = 9
cor[7] = cinza

f[7] = 10
cor[7] = preto
pi[7] = 6

d[8] = 11
cor[8] = cinza

f[8] = 12
cor[8] = preto
pi[8] = 6

f[6] = 13
cor[6] = preto
pi[6] = 4

f[4] = 14
cor[4] = preto
pi[4] = 3

f[3] = 15
cor[3] = preto
pi[3] = 2

f[2] = 16
cor[2] = preto
pi[2] = 1

f[1] = 17
cor[1] = preto
pi[1] = 0

f[0] = 18
cor[0] = preto
pi[0] = 0
```

### Resultado da busca


```java
d[0] = 0
pi[0] = -1
cor[0] = Cinza

cor[0] = Preto

d[1] = 1
pi[1] = 0
cor[1] = Cinza

cor[1] = Preto

d[2] = 2
pi[2] = 1
cor[2] = Cinza

cor[2] = Preto

d[4] = 2
pi[4] = 1
cor[4] = Cinza

cor[4] = Preto

d[3] = 3
pi[3] = 2
cor[3] = Cinza

cor[3] = Preto

d[5] = 3
pi[5] = 4
cor[5] = Cinza

cor[5] = Preto

d[6] = 3
pi[6] = 4
cor[6] = Cinza

cor[6] = Preto

d[7] = 4
pi[7] = 6
cor[7] = Cinza

cor[7] = Preto

d[8] = 4
pi[8] = 6
cor[8] = Cinza

cor[8] = Preto
```