Algoritmo EjemploArregloPSeInt
    // 1. Declarar el arreglo y variables
    Definir i, numeros Como Entero
    Dimension numeros[5]
    
    // 2. Llenar el arreglo con un ciclo Para
    Escribir "Por favor, ingresa 5 números:"
    Para i <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir "Número para la posición ", i, ":"
        Leer numeros[i]
    FinPara
	
    // 3. Mostrar el contenido del arreglo
    Escribir "Los números que ingresaste son:"
    Para i <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir "Posición ", i, ": ", numeros[i]
    FinPara
FinAlgoritmo