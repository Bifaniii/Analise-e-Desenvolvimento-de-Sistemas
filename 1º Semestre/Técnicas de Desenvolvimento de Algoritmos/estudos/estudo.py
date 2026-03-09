#1
def funcaoum (string):

    vogais = 'aeiou'
    quantidade_de_vogais = sum(1 for letra in string if letra in vogais)
    print('Quantidade de vogais nesta frase:', quantidade_de_vogais)    
    
    frase_reversa = string[::-1]
    print(f'A frase reversa ficaria assim: {frase_reversa}')

    if string == frase_reversa:
        print("É um palíndromo!")
    else:
        print("Não é um palíndromo!")

string = input('Digite algo aí: ').strip().lower()
funcaoum(string)



#2
from random import randint
def exerciciodois():
    lista_numeros_aleatorios = []
    lista_numeros_pares = []
    for i in range(0,20):
        lista_numeros_aleatorios.append(randint(1,100))
    
    print('Lista de números aleatórios gerados:', lista_numeros_aleatorios)

    for numero in lista_numeros_aleatorios:
        if numero % 2 == 0:
            lista_numeros_pares.append(numero)
    print('Lista de números pares da lista aleatória gerada: ', lista_numeros_pares)

    print('Lista de números descrescente: ', sorted(lista_numeros_aleatorios, reverse=True))

exerciciodois()

#5
class Aluno ():
    def __init__(self, nome, notas):
        self.nome = nome
        self.notas = notas
    
    def media(self):
        return sum(self.notas)/len(self.notas)
    
    def situacao(self):
        if self.media() >= 7:
            return 'Aprovado!'
        else:
            return 'Reprovado!'
        
aluno1 = Aluno('Guilherme', [5,5,5])
print(f"Aluno: {aluno1.nome}")
print(f"Média: {aluno1.media():.2f}")
print(f"Situação: {aluno1.situacao()}")