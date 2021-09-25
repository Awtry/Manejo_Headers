function Rutas(forma) {


    var op = forma.opcion;
    var radSeleccionado = false;
    for (var i = 0; i < op.length; i++) {
        if (op[i].checked) {
            radSeleccionado = true;
        }
    }
    if (!radSeleccionado) {
        alert("Selecciona por lo menos un genero");
        return false;
    }

    alert("Formulario valido, enviando a servidor");
    return true;
}

function calcularGeneral()
{
    var a = parseInt(document.getElementById("val_1").value);
    var b = parseInt(document.getElementById("val_2").value);
    var c = parseInt(document.getElementById("val_3").value);
    var opcion = 1;

    var res1 = document.getElementById("res1");
    var res2 = document.getElementById("res2");

    //var primerNum = 
    var parte1 = -b;
    var parte3 = Math.pow(b, 2);
    var parte4 = 4 * a * c;
    var parteExtra = (parte3 - parte4);
    var parte2 = Math.sqrt(parteExtra);
    var parte5 = 2 * a;

    var solucion1 = (parte1 + parte2) / (parte5);
    var solucion2 = (parte1 - parte2) / (parte5);

    /*alert("Primera: " + parte1);
     alert("Segunda: " + parte2);
     alert("Extra: " + parteExtra);
     alert("Tercera: " + parte3);
     alert("Cuarta: " + parte4);
     alert("Quinta: " + parte5);*/
    res1.value = solucion1.toString();
    res2.value = solucion2.toString();

    alert("Primera solución: " + parseFloat(solucion1));
    alert("Segunda solución: " + parseFloat(solucion2));
    return res1, res2, a, b, c, opcion;

}

function Triangulo() {
    //Determinar tipo de triangulo
    //a=5, b=5, c=5 : Equilatero, Isósceles, Escaleno
    var valorA = parseInt(document.getElementById("val_1").value);
    var valorB = parseInt(document.getElementById("val_2").value);
    var valorC = parseInt(document.getElementById("val_3").value);

    if (valorA === valorB && valorB === valorC && valorC === valorA) {
        alert("Triangulo: Equilatero");
        alert("Realmente si es un equilatero perro.");
        valorA = 0;
        valorB = 0;
        valorC = 0;
    }

    if (valorA === valorB || valorB === valorC || valorA === valorC) {
        alert("Triangulo: Isósceles");
        valorA = 0;
        valorB = 0;
        valorC = 0;
    }

    if (valorA !== valorB && valorB.value !== valorC)
    {
        alert("Triangulo: Escaleno");
        valorA = 0;
        valorB = 0;
        valorC = 0;
    }

}

/*
function primito(num) {

    if (num == 0 || num == 1)
    {
        return false;
    }

    for (var i = 2; i < num / 2; i++) {
        if (num % i === 0) {
            return false;
        }
    }

    return true;
}



function miPrimo() {

    alert("Entro a la funci´ón ")
    var cantidadNum = parseInt(document.getElementById("cantidadNum").value);
    var conta = 0;
    var j = 2;
    var numerosPrimos = [];


    while (conta < cantidadNum) {
        alert("Numeor dado: " + cantidadNum);
        for (; j < cantidadNum; j++) {
            if (primo(cantidadNum)) {
                alert("Entro en condicional: " + conta);
                numerosPrimos.push(cantidadNum);
                alert("Lo del arreglo: " + numerosPrimos);
                conta++;
            }
        }
    }


    alert(numerosPrimos);
    // console.log(numerosPrimos);

   


//--------------------------------------
    //var numerosPrimos = [];
    //var cantidadNum = parseInt(document.getElementById("cantidadNum").value);
    /*var cantidadNum = 5;
     var esOno;
     var numerosPrimos = [];
     
     
     if (cantidadNum !== 1 && cantidadNum !== 0)
     {
     for (var i = 2; i <= cantidadNum; i++)
     {
     if (cantidadNum % i === 0)
     {
     if (cantidadNum === i)
     {
     numerosPrimos[i].push(cantidadNum);
     esOno = true;
     alert("Sí es primo");
     alert(numerosPrimos);
     } else
     {
     esOno = false;
     alert("No es primo");
     return esOno;
     }
     } else
     {
     alert("No debería de ser primo");
     }
     }
     } else
     {
     esOno = false;
     }
     
     alert("No me abre el alert");
     return esOno;
     *

}

 function primo(numero) {
        if (numero !== 1 && numero !== 0) {
            for (var i = 2; i < numero; i++) {
                if (numero % i === 0) {
                    return false;
                }
            }
        }

        return true;
    }


if (saberPrimo) {
    alert("Sí es primo");
} else
{
    alert("No es primo");
}

*/

function miPrimo() {

    alert("Entro a la funci´ón ");
    var cantidadNum = parseInt(document.getElementById("cantidadNum").value);
    var conta = 0;
    var j = 2;
    var numerosPrimos = [];

    while (conta < cantidadNum) {
        if (primo(j)) {
            numerosPrimos.push(j);
            conta++;
        }
        j++;
        
    }
    alert(numerosPrimos);

}

 function primo(numero) {
        if (numero !== 1 && numero !== 0) {
            for (var i = 2; i < numero; i++) {
                if (numero % i === 0) {
                    return false;
                }
            }
        }

        return true;
    }