function Rutas(forma){
  
    
    var opcion = forma.opcion;
    var radSeleccionado = false; 
     for (var i = 0; i < opcion.length ; i++){
        if(opcion[i].checked){
            radSeleccionado = true; 
        }
    }
    
    alert("Formulario valido, enviando a servidor");
    return true; 
}
