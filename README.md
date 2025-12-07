# 🧪 Examen Práctico – API REST Tienda de Cómics

## 🎯 Objetivo

Desarrollar una **API REST** en **Java + Spring Boot** para una **tienda de cómics**, que permita **registrar información (operación POST)** en una base de datos H2 usando:

- Spring Web  
- Spring Data JPA  
- H2 Database  
- Arquitectura por capas: **Entidad – Repositorio – Servicio – Controlador**
- Pruebas usando un **cliente REST** (Postman, Insomnia, etc.)

> Importante: En este examen **solo es obligatorio implementar el registro de datos (POST)**. No es necesario implementar consultas (GET), actualizaciones (PUT) ni eliminación (DELETE).

---

## 🧩 Contexto del sistema

Vas a construir una API para la gestión de una **tienda de cómics**.  
La API debe manejar **4 tablas (4 entidades JPA)**:

1. `Comic`
2. `Cliente`
3. `Pedido`
4. `Empleado`

Cada tabla se representa como una clase **@Entity** y debe tener:

- Un campo `id` (tipo `Long`, clave primaria, autogenerado).
- **Mínimo 10 atributos adicionales** relacionados con el negocio.

---



## 🔌 Pruebas con cliente REST

Debes probar la API usando un cliente REST (**Postman**, **Insomnia**, etc.):

- Enviar al menos **una petición POST por cada entidad**:
  - `POST /api/comics`
  - `POST /api/clientes`
  - `POST /api/pedidos`
  - `POST /api/empleados`

Debes verificar que:

- La API responde con código **200** o **201**.
- La respuesta contiene el **objeto guardado** con su `id` generado.

**Evidencias sugeridas:**

- Capturas de pantalla de las peticiones POST exitosas.
- (Opcional) Exportar la colección de Postman.

---

## ✅ Criterios de evaluación (20 puntos)

### 1. Diseño de entidades (12 puntos)

- 4 entidades con:
  - Al menos **10 atributos adicionales** al `id`.
  - Tipos de datos adecuados.
  - Coherencia con el **contexto de tienda de cómics**.

### 2. Capas y endpoints (4 puntos)

- Repositorios correctos (extienden `JpaRepository`).
- Servicios que:
  - Usan el repositorio para **guardar los datos**.
  - **Validan al menos 1 campo** antes de guardar (por ejemplo: que el precio sea mayor que 0, que el nombre no esté vacío, etc.).
- Controladores REST funcionales con endpoints **POST**.

### 3. Configuración y ejecución (2 puntos)

- La aplicación se ejecuta **sin errores**.
- Configuración de **H2** funcional.

### 4. Pruebas con cliente REST (2 puntos)

- Evidencias claras de los **4 endpoints POST** funcionando.
