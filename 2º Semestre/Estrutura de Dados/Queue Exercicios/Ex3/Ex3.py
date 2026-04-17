from collections import deque

class Filme:
    def __init__(self, titulo, diretor, genero, pais, ano):
        self.titulo = titulo
        self.diretor = diretor
        self.genero = genero
        self.pais = pais
        self.ano = ano

    def __str__(self):
        return f"{self.titulo} ({self.ano}) - {self.genero}, Dir: {self.diretor}, País: {self.pais}"

class FilaFilmes:
    def __init__(self):
        self.fila = deque()

    def inserir(self, filme):
        self.fila.append(filme)

    def eliminar_ate_acao(self):
        while self.fila:
            filme = self.fila[0]  # olha o primeiro
            if filme.genero.lower() == "ação":
                print("Primeiro filme de ação encontrado:", filme)
                return filme
            else:
                removido = self.fila.popleft()
                print("Removido:", removido)
        print("Fila vazia, nenhum filme de ação encontrado.")
        return None
    
fila = FilaFilmes()

fila.inserir(Filme("Matrix", "Wachowski", "Ação", "EUA", 1999))
fila.inserir(Filme("Titanic", "James Cameron", "Romance", "EUA", 1997))
fila.inserir(Filme("Vingadores", "Joss Whedon", "Ação", "EUA", 2012))
fila.inserir(Filme("Parasita", "Bong Joon-ho", "Drama", "Coreia do Sul", 2019))
fila.inserir(Filme("Mad Max: Fury Road", "George Miller", "Ação", "Austrália", 2015))

fila.eliminar_ate_acao()
