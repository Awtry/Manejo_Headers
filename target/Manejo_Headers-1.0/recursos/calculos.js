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
