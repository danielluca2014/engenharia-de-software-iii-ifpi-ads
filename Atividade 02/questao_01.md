
### 1\. Faça uma pesquisa nos seus primeiros repositórios e aponte trechos de código que você hoje melhoraria e/ou não escreveria mais da mesma forma e proponha uma melhoria.

Nos códigos a seguir, há alguns pontos que podem ser melhorados com práticas que deixam o código mais fluido e legível, utilizando alguns princípios como o encapsulamento e validações definidas na própria classe.

##### jogador.ts

```typescript
class Jogador {
    forca: number;
    nivel: number;
    pontosAtuais: number;

    constructor(forca: number, nivel: number, pontosAtuais: number) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    calcularAtaque(): number {
        return this.forca * this.nivel;
    }

    atacar(atacado: Jogador): void {
        atacado.pontosAtuais -= this.calcularAtaque();
    }

    toString(): string {
        return `\nForça: ${this.forca} \nNível: ${this.nivel} \nPontos: ${this.pontosAtuais}\n`;
    }
}
```
##### jogo.ts
```typescript
function main() {
    let jogador1: Jogador = new Jogador(10, 5, 200);
    let jogador2: Jogador = new Jogador(20, 10, 200);

    if (jogador2.pontosAtuais > 0) {
        jogador1.atacar(jogador2); 

    } else {
        console.log("Não é possível atacar!");
    }
    console.log(jogador2.toString());
}

main();
