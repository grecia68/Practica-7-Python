def calcular_promedio(calificaciones):
    promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2])/3
    return promedio

def evaluar_aprobacion(promedio):
    if promedio >= 6.0:
        estado = True
    else:
        estado = False
    return estado

print("================ REGISTRO DE ESTUDIANTES ================")
print()

num_estd = int(input("Ingrese el número de estudiantes a registrar: "))
print()

estudiantes = []
promedios = []
estados = []

for x in range(num_estd):
    print(f'Estudiante {x+1}')
    nombre = str(input("Nombre: "))
    estudiantes.append(nombre)

    calificaciones = []

    for y in range(3):
        print(f'Calificación {y+1}: ', end="")
        calificacion = int(input())
        calificaciones.append(calificacion)

    promedio = calcular_promedio(calificaciones)
    promedios.append(promedio)

    estado = evaluar_aprobacion(promedio)
    estados.append(estado)

    print() 

print("--------------- RESULTADOS ---------------")
print()

con_aprobado = 0
con_reprobado = 0

for x in range(num_estd):
    if estados[x]:
        print(f'{estudiantes[x]} - Promedio: {promedios[x]:.2f} - Aprobado')
        con_aprobado+=1
    else:
        print(f'{estudiantes[x]} - Promedio: {promedios[x]:.2f} - Reprobado')
        con_reprobado+=1

print()  
print(f'Total de estudiantes aprobados: {con_aprobado}')
print(f'Total de estudiantes reprobados: {con_reprobado}')











