from collections import deque

F = deque(["livro", "caneta", "borracha"])

ob = F.popleft()
F.append("clip")
F.append(F[0])
F.append(ob)

print("Estado final da fila:", list(F))
