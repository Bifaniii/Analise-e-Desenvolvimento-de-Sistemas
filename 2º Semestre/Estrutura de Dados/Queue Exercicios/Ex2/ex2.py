from collections import deque

class Compra:
    def __init__(self, nomeComprador, nomeProduto, valorProduto):
        self.nomeComprador = nomeComprador
        self.nomeProduto = nomeProduto
        self.valorProduto = valorProduto

    def __str__(self):
        return f"Comprador: {self.nomeComprador}, Produto: {self.nomeProduto}, Valor: R${self.valorProduto:.2f}"

class AppCompras:
    def __init__(self):
        self.pilha = []
        self.fila = deque()

    def guardar(self, compra):
        self.pilha.append(compra)

    def cancelar(self):
        if self.pilha:
            compra = self.pilha.pop()
            print("Cancelada:", compra)
            return compra
        else:
            print("Nenhuma compra para cancelar.")
            return None

    def transferir(self):
        aux = []
        while self.pilha:
            aux.append(self.pilha.pop())
        while aux:
            self.fila.append(aux.pop())
        print("Transferência concluída.")

    def atender(self):
        if self.fila:
            compra = self.fila.popleft()
            print("Atendida:", compra)
            return compra
        else:
            print("Nenhuma compra para atender.")
            return None

app = AppCompras()

app.guardar(Compra("Guilherme", "Notebook", 3500))
app.guardar(Compra("Maria", "Celular", 2500))
app.guardar(Compra("João", "Fone de ouvido", 300))

app.cancelar()

app.transferir()

app.atender()
