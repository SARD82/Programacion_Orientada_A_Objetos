Algoritmo EjemploArregloPSeInt
    // 1. Declarar el arreglo y variables
    Definir i, numeros Como Entero
    Dimension numeros[5]
    
    // 2. Llenar el arreglo con un ciclo Para
    Escribir "Por favor, ingresa 5 n�meros:"
    Para i <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir "N�mero para la posici�n ", i, ":"
        Leer numeros[i]
    FinPara
	
    // 3. Mostrar el contenido del arreglo
    Escribir "Los n�meros que ingresaste son:"
    Para i <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir "Posici�n ", i, ": ", numeros[i]
    FinPara
FinAlgoritmo