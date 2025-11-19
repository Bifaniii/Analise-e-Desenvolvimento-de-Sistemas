#Exercício 1 
n = int(input("Digite um número: "))
if 0 <= n <= 9:
  print("Valor correto!")
else:
  print("Valor incorreto!")
#-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
# Exercício 2
turno = input("Digite seu turno (m= matutino, v= vespertino, n= noturno): ").lower()
horas = int(input("Digite a quantidade de horas trabalhadas: "))

if turno == 'n':
  salario = horas * 45.00
  print(f'Salário é igual a: R {salario}')
else:
  salario = horas * 37.50
  print(f'Salário é igual a: R {salario}')

#-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
# Exercício 3
compra = float(input("Digite o valor da compra: "))
if compra > 200:
  compra_desconto = compra * 0.8
  print(f"O valor da compra com desconto de 20% é de R$ {compra_desconto}")
else:
  print(f"A compra não possui desconto e o valor total é de R$ {compra}")

#-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
# Exercício 4
water = float(input("Digite o valor da conta de água: "))
light = float(input("Digite o valor da conta de luz: "))
cel = float(input("Digite o valor da conta de celular: "))
salary = float(input("Digite o seu salário: "))
total_bill = water + light + cel

if salary >= total_bill:
  resto = salary - total_bill
  print(f"O valor total em conta que restará ao pagar as contas é de R$ {resto}")
else:
  print("Saldo insuficiente!")