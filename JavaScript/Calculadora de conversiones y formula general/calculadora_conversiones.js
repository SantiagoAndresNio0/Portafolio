function convertir() {
    // Obtener los valores del número, base de entrada y base de salida
    let numero = document.getElementById('numero').value;
    let baseEntrada = document.getElementById('base-entrada').value;
    let baseSalida = document.getElementById('base-salida').value;
    
    // Convertir el número a decimal
    let decimal = parseInt(numero, baseEntrada);
    
    // Convertir el número decimal a la base de salida
    let resultado;
    switch (baseSalida) {
        case 'binario':
            resultado = decimal.toString(2);
            break;
        case 'octal':
            resultado = decimal.toString(8);
            break;
        case 'decimal':
            resultado = decimal.toString(10);
            break;
        case 'hexadecimal':
            resultado = decimal.toString(16).toUpperCase();
            break;
        default:
            resultado = "Base de salida no válida";
    }
    
    // Mostrar el resultado
    document.getElementById('resultado').innerText = `Resultado: ${resultado}`;
}
