# Practico3_Java
# Estructura del proyecto
## Clases implementadas
### `Estudiante`
Datos:
- Nombre
- Apellido
- Edad
- Documento
- Legajo

---

### `IndiceEstudiantes`
Implementacion de tabla hash de estudiantes tomando en cuenta:
- Factor de carga maximo
- Tamaño de la tabla
- Cantidad de estudiantes ya ingresados

Con metodos de:
- Insercion
- Funcion hash
- Busqueda
- Mostrar

---

### `Universidad`
Datos:
- Nombre
- Direccion
- Indice hash de estudiantes

---

# Tabla de trabajo

| Legajo  | ASCII total | h(k) | ¿Colisión? | Intentos (i²) | Posición final |
|---------|-------------|------|------------|---------------|----------------|
|  AB12   |     230     |  9   |     No     |       0       |       9        |
|  ZX90   |     283     |  11  |     No     |       0       |       11       |
|  LQ33   |     259     |  4   |     No     |       0       |       4        |
|  AC11   |     230     |  9   |     Si     |       1       |       10       |
|  AD10   |     230     |  9   |     Si     |       2       |       14       |
|  CA11   |     230     |  9   |     Si     |       3       |       6        |

---

# Reflexion

## ¿Dónde hubo más colisiones?

Mayores colisiones con los legajos:

- AB12
- AC11
- AD10
- CA11

---

## ¿Qué tan eficiente fue la exploración cuadrática?
La exploracion cuadratica resulto eficiente para distribuir los elementos y evitar agrupamientos lineales

---

## ¿Qué pasaría si el tamaño no fuera primo?
Podrian producirse mas colisiones, ya que comenzaria a seguir patrones y provocaria una peor distribucion de las claves
