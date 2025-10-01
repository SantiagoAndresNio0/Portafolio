function init(){
    var a = document.getElementById('a');
    var texto = document.getElementById('texto');
    var b = document.getElementById('b');
    var c = document.getElementById('c');
    var positivo = document.getElementById('positivo');
    var negativo = document.getElementById('negativo');
   
}
texto.onclick = function(){
    resultado();
}
function resultado(){
    var raiz=0;
    raiz=Math.sqrt((b.value * b.value) - 4* (a.value * c.value) );
    positivo.textContent = ((-1*b.value)+raiz)/2*a.value;
    negativo.textContent = ((-1*b.value)-raiz)/2*a.value;
    
}
