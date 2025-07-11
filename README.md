# SmartInventory 📦

Sistema de gestión avanzada de inventario desarrollado con **Java 17**, **Spring Boot** y una arquitectura limpia, siguiendo buenas prácticas de desarrollo backend.

## 🚀 Descripción

SmartInventory es un sistema modular para la gestión de inventario, diseñado con enfoque profesional, permitiendo:

- Registrar productos.
- Consultar el inventario actual.
- Actualizar y eliminar productos.
- Arquitectura limpia y escalable:
  - Controladores (Controller)
  - Servicios (Service)
  - Repositorios (Repository)
  - DTOs (Data Transfer Objects)
  - Mappers (conversión entre entidades y DTOs)

## ⚙️ Tecnologías usadas

- Java 17
- Spring Boot
- Spring Data JPA
- Base de datos H2 (modo memoria para desarrollo)
- Maven
- Git

## 📂 Estructura del proyecto
com.ibandorta.smartinventory
│
├── controller → Endpoints REST
├── service → Lógica de negocio
├── repository → Acceso a datos
├── dto → Transferencia segura de datos
├── mapper → Conversión entre entidad y DTO
├── model → Entidades JPA

## 📋 Funcionalidades actuales

- CRUD completo de productos (crear, leer, actualizar, eliminar).
- Separación total entre entidad y API mediante DTOs.
- Arquitectura lista para escalar y añadir más módulos.

## 🔭 Roadmap de mejoras (próximas fases)

1. ✅ Implementar autenticación y seguridad con Spring Security (JWT).
2. ✅ Añadir usuarios con roles (Admin, User).
3. ✅ Relaciones entre entidades (proveedores, categorías, almacenes).
4. ✅ Gestión de movimientos de inventario (entradas/salidas).
5. ✅ Filtros avanzados por nombre, categoría o rango de precios.
6. ✅ Exportación de inventario a formatos (CSV, Excel, PDF).
7. ✅ Documentación de la API con Swagger/OpenAPI.
8. ✅ Tests unitarios y de integración con JUnit y Mockito.
9. ✅ Persistencia en bases de datos reales como MySQL o PostgreSQL.

---

## 🎯 Objetivo final

Construir un sistema de inventario complejo, robusto y preparado para un entorno real de producción, aplicando las mejores prácticas de desarrollo backend profesional.

---

## 👨‍💻 Autor

Proyecto desarrollado por [Iban Dorta] (https://github.com/jidorta/smart-inventory) como práctica de backend y arquitectura limpia con Java.


