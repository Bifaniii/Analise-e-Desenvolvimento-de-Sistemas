function calcularDobro () {
    let n1 = parseInt(prompt('Digite um número para calcular o dobro: '));
    let dobro = n1 * 2;
    alert(`O dobro de ${n1} é igual a ${dobro}.`);
}

function somarDoisNumeros() {
    let n1 = parseInt(prompt('Digite um número inteiro:'));
    let n2 = parseInt(prompt('Digite outro número inteiro:'));
    alert(`A soma dos números informados é igual a ${n1 + n2}.`);
}

function calcularQuadrado() {
    let n1 = parseInt(prompt('Digite um número inteiro:'));
    alert(`O quadrado do número informado é igual a ${n1*n1}.`);
}

function calcularMedia() {
    let n1 = parseFloat(prompt('Digite a primeira nota:'));
    let n2 = parseFloat(prompt('Digite a segunda nota:'));
    let n3 = parseFloat(prompt('Digite a terceira nota:'));
    let media = (n1 + n2 + n3) / 3;
    alert(`A média deste aluno é igual a ${media}.`);
}

function somaTresNumeros() {
    let n1 = parseInt(prompt('Digite um número inteiro:'));
    let n2 = parseInt(prompt('Digite um número inteiro:'));
    let n3 = parseInt(prompt('Digite um número inteiro:'));
    alert(`A soma destes três números é igual a ${n1+n2+n3}.`);
}

function areaTriangulo() {
    let base = parseFloat(prompt('Digite o valor da base do triângulo: '));
    let altura = parseFloat(prompt('Digite o valor da altura do triângulo: '));
    alert(`A área do triângulo informado é igual a ${(base * altura)/2}cm².`);
}

function nomeIdade() {
    let nome = prompt('Digite seu nome:');
    let ano = parseInt(prompt('Digite seu ano de nascimento:'));
    let anoAtual = parseInt(prompt('Digite em que ano estamos:'));
    alert(`Seu nome é ${nome}\nE sua idade é ${anoAtual-ano}.`);
}

function pedreiro() {
    let altura = parseFloat(prompt('Digite a altura do degrau em centímetros:'));
    let escada = parseFloat(prompt('Digite a altura desejada a ser alcançada em centímetros:'));
    alert(`Será necessário que um pedreiro suba ${escada/altura} degraus que possuem ${altura}cm.`);
}