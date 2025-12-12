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

- Evidencias claras de los **4 endpoints POST** funcionando.<img width="719" height="402" alt="image_720" src="https://github.com/user-attachments/assets/ad967e25-6e5a-4fe8-ac83-476dcd7504d9" />
<img width="720" height="363" alt="image_720" src="https://github.com/user-attachments/assets/4f1c7e34-e2ae-41e8-9f0f-a265adb9eb83" />
<img width="720" height="380" alt="image_720" src="https://github.com/user-attachments/assets/2216e92b-c73a-4937-addf-8cc387f41519" />
<img width="720" height="407" alt="image_720" src="https://github.com/user-attachments/assets/ae92f269-fdc0-49fa-afa8-7af715370580" />
<img width="720" height="405" alt="image_720" src="https://github.com/user-attachments/assets/de78fd59-d2de-4094-b590-18293ac15339" />
<img width="719" height="417" alt="image_720" src="https://github.com/user-attachments/assets/8d119d35-94e9-44fb-8727-8bff63721e72" />
<img width="720" height="397" alt="image_720" src="https://github.com/user-attachments/assets/2766075b-8f6d-4eb8-81b1-e048d0ac9c68" />










