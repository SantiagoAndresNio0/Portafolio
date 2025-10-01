//Declaramos variables
var operandoa;
var operandob;
var operacion;
function init(){
    //variables
    var resultado = document.getElementById('resultado');
    var reset = document.getElementById('reset');
    var suma = document.getElementById('suma');
    var resta = document.getElementById('resta');
    var multiplicacion = document.getElementById('multiplicacion');
    var division = document.getElementById('division');
    var igual = document.getElementById('igual');
    var uno = document.getElementById('uno');
    var dos = document.getElementById('dos');
    var tres = document.getElementById('tres');
    var cuatro = document.getElementById('cuatro');
    var cinco = document.getElementById('cinco');
    var seis = document.getElementById('seis');
    var siete = document.getElementById('siete');
    var ocho = document.getElementById('ocho');
    var nueve = document.getElementById('nueve');
    var cero = document.getElementById('cero');
    var siete = document.getElementById('cuadrado');
    var ocho = document.getElementById('raiz');
    var nueve = document.getElementById('seno');
    var cero = document.getElementById('coseno');
  }
  //Eventos de click
  uno.onclick = function(){
    resultado.textContent = resultado.textContent  + "1";
}
dos.onclick = function(){
    resultado.textContent = resultado.textContent  + "2";
}
tres.onclick = function(){
    resultado.textContent = resultado.textContent  + "3";
}
cuatro.onclick = function(){
    resultado.textContent = resultado.textContent  + "4";
}
cinco.onclick = function(){
    resultado.textContent = resultado.textContent  + "5";
}
seis.onclick = function(){
    resultado.textContent = resultado.textContent  + "6";
}
siete.onclick = function(){
    resultado.textContent = resultado.textContent  + "7";
}
ocho.onclick = function(){
    resultado.textContent = resultado.textContent  + "8";
}
nueve.onclick = function(){
    resultado.textContent = resultado.textContent  + "9";
}
cero.onclick = function(){
    resultado.textContent = resultado.textContent  + "0";
}
reset.onclick = function(){
    resetear();
}
suma.onclick = function(){
    operandoa = resultado.textContent;
    operacion = "+";
    limpiar();
}
resta.onclick = function(){
    operandoa = resultado.textContent;
    operacion = "-";
    limpiar();
}
multiplicacion.onclick = function(){
    operandoa = resultado.textContent;
    operacion = "*";
    limpiar();
}
division.onclick = function(){
    operandoa = resultado.textContent;
    operacion = "/";
    limpiar();
}
cuadrado.onclick = function(){
    operadoa = resultado.textContent;
    operacion ="^2" ;
    limpiar()
}
raiz.onclick = function(){
    operadoa = resultado.textContent;
    operacion="v~"
    limpiar()
}
seno.onclick = function(){
    operadoa = resultado.textContent;
    operacion="s";
    limpiar()
}
coseno.onclick = function(){
    operadoa = resultado.textContent;
    operacion="c";
    limpiar()
}
igual.onclick = function(){
    operandob = resultado.textContent;
    resolver();
}
function limpiar(){
    resultado.textContent = "";
  }
  function resetear(){
    resultado.textContent = "";
    operandoa = 0;
    operandob = 0;
    operacion = "";
  }
  function resolver(){
    var res = 0;
    switch(operacion){
      case "+":
        res = parseFloat(operandoa) + parseFloat(operandob);
        break;
      case "-":
          res = parseFloat(operandoa) - parseFloat(operandob);
          break;
      case "*":
        res = parseFloat(operandoa) * parseFloat(operandob);
        break;
      case "/":
        res = parseFloat(operandoa) / parseFloat(operandob);
        break;
      case "^2" :
        res = parseFloat(operadoa)*parseFloat(operadoa);
        break;
      case "v~":
        res = Math.sqrt(parseFloat(operadoa));
        break;
      case "s":
        res= Math.sin(parseFloat(operadoa)* Math.PI/180) ;
        break;
      case "c":
        res= Math.cos(parseFloat(operadoa)* Math.PI/180) ;
        break;
    }
    resetear();
    resultado.textContent = res;
  }