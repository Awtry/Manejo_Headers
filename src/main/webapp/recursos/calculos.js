function Rutas(forma){
  
    
    var op = forma.opcion;
    var radSeleccionado = false; 
     for (var i = 0; i < op.length ; i++){
        if(op[i].checked){
            radSeleccionado = true; 
        }
    }
    
    alert("Formulario valido, enviando a servidor");
    return true; 
}
