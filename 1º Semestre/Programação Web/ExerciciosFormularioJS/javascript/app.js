function area () {
    let base = Number(document.getElementById('base').value);
    let altura = Number(document.getElementById('altura').value);
    let area = base * altura;
    document.getElementById('resultado').value = area;    
}

function parImpar() {
    let n = Number(document.getElementById('num').value);
    if (n % 2 == 0) {
        document.getElementById('resultado').value = "É par!"
    } else {
        document.getElementById('resultado').value = "É impar!"
    }
}

function numMaior() {
    let n1 = document.getElementById('num1').value;
    let n2 = document.getElementById('num2').value;
    if (n1 > n2) {
        document.getElementById('resultado').value = "O primeiro número é maior!"
    } else if (n1 == n2) {
        document.getElementById('resultado').value = "Os números são iguais!"
    } else {
        document.getElementById('resultado').value = "O segundo número é maior!"
    }   
}

function calcularIMC() {
    let peso = parseFloat(document.getElementById('peso').value);
    let sexo = document.getElementById('sexo').value.toUpperCase();
    let altura = parseFloat(document.getElementById('altura').value);
    let imc = peso / (altura * altura);

    document.getElementById('resultado').innerHTML = (`Seu IMC é igual a ${imc}`);

    if (sexo == 'F'){
        if (imc < 19.1) {
            alert('Está abaixo do peso!')
        }
        else if (19.1 <= imc && imc < 25.8) {
            alert('Está no peso normal!')
        }
        else if (25.8 <= imc && imc < 27.3) {
            alert('Está marginalmente acima do peso!')
        }
        else if (27.3 <= imc && imc < 32.3) {
            alert('Está acima do peso ideal!')
        }
        else {
            alert('Está em obesidade!')
        }
    }
    else if (sexo == 'M') {
        if (imc < 20.7) {
            alert('Está abaixo do peso!')
        }
        else if (20.7 <= imc && imc < 26.4) {
            alert('Está no peso normal!')
        }
        else if (26.4 <= imc && imc < 27.8) {
            alert('Está marginalmente acima do peso!')
        }
        else if (27.8 <= imc && imc < 31.1) {
            alert('Está acima do peso ideal!')
        }
        else {
            alert('Está em obesidade!')
        }
    }
    else{
        alert('Valor definido para sexo inválido. Favor, digitar F para Feminino ou M para masculino');
    }
}