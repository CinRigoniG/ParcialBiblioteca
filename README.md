# 📚 Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema en Java basado en el paradigma de programación orientada a objetos para digitalizar la gestión de una biblioteca escolar, siguiendo el modelo UML provisto.

## 🧠 Descripción

El sistema gestiona:

- Publicaciones (Libros y Revistas)
- Editoriales y Autores
- Ejemplares asociados a publicaciones
- Usuarios
- Préstamos y líneas de préstamo

## 📌 Funcionalidades principales

### 1. Codificación e instanciación del modelo (40%)

Se implementan las clases según el diagrama UML. En el `main` se crean los siguientes objetos:

- Un **Libro** con título, año, género, una **Editorial** (con dirección) y al menos dos **Autores**.
- Dos **Ejemplares** para ese libro.
- Una **Revista** con al menos un ejemplar.
- Una **Biblioteca** que registre esas publicaciones.
- Un **Usuario** que realiza un **Préstamo** con al menos una **Línea de Préstamo** que referencia un ejemplar.

### 2. `estaDisponible()` – Ejemplar (10%)

```java
public boolean estaDisponible()
```

Retorna `true` si el estado del ejemplar es `DISPONIBLE`.

### 3. `getEjemplaresDisponibles()` – Publicacion (10%)

```java
public List<Ejemplar> getEjemplaresDisponibles()
```

Devuelve la lista de ejemplares de la publicación que están disponibles.

### 4. `mostrarHistorialPrestamos()` – Usuario (20%)

```java
public void mostrarHistorialPrestamos()
```

Imprime en consola la fecha del préstamo, códigos de ejemplares involucrados y fechas de devolución.

### 5. `agregarLineaPrestamo(Ejemplar)` – Prestamo (20%)

```java
public void agregarLineaPrestamo(Ejemplar ejemplar)
```

- Crea una nueva línea de préstamo.
- Asocia el ejemplar recibido.
- Establece la fecha de devolución estimada.
- Agrega la línea a la lista de líneas del préstamo.
