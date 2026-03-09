#include <stdio.h>

int main(int argc, char const *argv[])
{
  float salario;
  printf("Digite seu salário: ");
  scanf("%f", &salario);

  if (salario <= 4863)
  {
    salario = salario + (salario * 0.5);
  }
  else if (salario >= 4863 && salario <= 16210)
  {
    salario = salario + (salario * 0.2);
  }
  else if (salario >= 16210 && salario <= 32420)
  {
    salario = salario + (salario * 0.15);
  }
  else
  {
    salario = salario + (salario * 0.1);
  }

  printf("Seu novo salário é de: R$ %.2f\n", salario);
  return 0;
}
