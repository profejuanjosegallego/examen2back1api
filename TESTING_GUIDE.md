# Guía de Pruebas para Thunder Client

Aquí tienes los JSON de ejemplo para probar los endpoints POST de tu API.

## 1. Crear Comic
**Método:** POST  
**URL:** `http://localhost:8080/api/comics`  
**Body (JSON):**
```json
{
  "titulo": "Batman: Year One",
  "autor": "Frank Miller",
  "editorial": "DC Comics",
  "genero": "Superhéroes",
  "precio": 25.99,
  "stock": 100,
  "fechaPublicacion": "1987-02-01",
  "idioma": "Español",
  "formato": "Tapa dura",
  "numeroPaginas": 144,
  "isbn": "978-1401207526"
}
```

## 2. Crear Cliente
**Método:** POST  
**URL:** `http://localhost:8080/api/clientes`  
**Body (JSON):**
```json
{
  "nombre": "Juan",
  "apellido": "Perez",
  "email": "juan.perez@example.com",
  "telefono": "555-1234",
  "direccion": "Calle Falsa 123",
  "ciudad": "Madrid",
  "pais": "España",
  "fechaNacimiento": "1990-05-15",
  "genero": "Masculino",
  "estadoCivil": "Soltero",
  "ocupacion": "Ingeniero"
}
```

## 3. Crear Empleado
**Método:** POST  
**URL:** `http://localhost:8080/api/empleados`  
**Body (JSON):**
```json
{
  "nombre": "Maria",
  "apellido": "Gomez",
  "email": "maria.gomez@tienda.com",
  "telefono": "555-5678",
  "cargo": "Vendedora",
  "salario": 1500.00,
  "fechaContratacion": "2023-01-10",
  "departamento": "Ventas",
  "turno": "Mañana",
  "estado": "Activo",
  "direccion": "Av. Siempre Viva 742"
}
```

## 4. Crear Pedido
**Método:** POST  
**URL:** `http://localhost:8080/api/pedidos`  
**Body (JSON):**
```json
{
  "fechaPedido": "2023-10-27T10:30:00",
  "estado": "Pendiente",
  "total": 55.50,
  "metodoPago": "Tarjeta de Crédito",
  "direccionEnvio": "Calle Falsa 123",
  "codigoPostal": "28001",
  "ciudadEnvio": "Madrid",
  "paisEnvio": "España",
  "numeroSeguimiento": "TRACK123456",
  "observaciones": "Entregar por la tarde",
  "clienteNombre": "Juan Perez"
}
```
