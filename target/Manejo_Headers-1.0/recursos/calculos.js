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
    var parte3 = Math.pow(b,2);
    var parte4 = 4*a*c;
    var parteExtra = (parte3-parte4);
    var parte2 = Math.sqrt(parteExtra);
    var parte5 = 2*a;
    
    var solucion1 = (parte1+parte2)/(parte5);
    var solucion2 = (parte1-parte2)/(parte5); 
    
    /*alert("Primera: " + parte1);
    alert("Segunda: " + parte2);
    alert("Extra: " + parteExtra);
    alert("Tercera: " + parte3);
    alert("Cuarta: " + parte4);
    alert("Quinta: " + parte5);*/
    res1.value=solucion1.toString();
    res2.value=solucion2.toString();
    
    alert("Primera solución: " + parseFloat(solucion1));
    alert("Segunda solución: " + parseFloat(solucion2));
    return res1,res2,a,b,c,opcion;
    
}

/*
function Formula(general) {
    var num1 = general.val_1;
    var num2 = general.val_2;
    var num3 = general.val_3;
    var res = general.resForm;

    if (num1.value === "") {
        alert("Dame el primer valor");
        num1.focus();
        num1.select();
        return false;
    }

    if (num2.value === "") {
        alert("Dame el segundo valor");
        num2.focus();
        num2.select();
        return false;
    }

    if (num3.value === "") {
        alert("Dame el tercer valor");
        num3.focus();
        num3.select();
        return false;
    }
    
    return res = num1 + num2 + num3;

    alert("Formulario valido, enviando a servidor");
    return true;
}
*/