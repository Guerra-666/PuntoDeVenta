## Gestión de Inventario

Este repositorio contiene una aplicación de gestión de inventario desarrollada en Java utilizando Swing para la interfaz gráfica. La aplicación permite realizar las siguientes operaciones:

- Alta de Producto
- Alta de Venta
- Visualizar Inventario
- Agregar Productos Nuevos

### Tabla de Contenidos

- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)
- [Futuras Mejoras](#futuras-mejoras)

### Requisitos

Para ejecutar esta aplicación, necesitas tener instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [XAMMP](https://www.apachefriends.org/es/index.html)


### Instalación

1. **Clona el repositorio:**

    ```bash
    git clone https://github.com/tu-usuario/gestion-de-inventario.git
    cd gestion-de-inventario
    ```

2. **Compila y ejecuta la aplicación:**

    Utiliza tu IDE preferido para abrir el proyecto y compilarlo, o ejecuta los siguientes comandos desde la terminal:

    ```bash
    javac -d bin src/*.java
    java -cp bin InventoryManagementApp
    ```

### Uso

1. **Alta de Producto:**

    - Navega a la pestaña "Alta de Producto".
    - Rellena los campos con la información del producto.
    - Haz clic en "Agregar Producto".

2. **Alta de Venta:**

    - Navega a la pestaña "Alta de Venta".
    - Rellena los campos con la información de la venta.
    - Haz clic en "Registrar Venta". La fecha de la venta se rellenará automáticamente.

3. **Visualizar Inventario:**

    - Navega a la pestaña "Visualizar Inventario".
    - Ingresa el código de barras del producto para verificar la cantidad en inventario.
    - Haz clic en "Mostrar Inventario Total" para ver una lista completa del inventario.

4. **Agregar Productos Nuevos:**

    - Navega a la pestaña "Agregar Productos Nuevos".
    - Rellena los campos con la información del nuevo producto.
    - Haz clic en "Agregar Producto".

### Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

```
gestion-de-inventario/
├── src/
│   ├── InventoryManagementApp.java
│   └── (otros archivos .java)
├── db/
│   └── scripts.sql
└── README.md
```

### Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos para contribuir:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Empuja los cambios a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

### Licencia

Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

### Futuras Mejoras

- **Conexión a MySQL:**
    - Implementar la conexión a una base de datos MySQL para persistir los datos de productos y ventas.
    - Utilizar JDBC para interactuar con la base de datos.

- **Integración con PHP:**
    - Crear un servicio REST utilizando PHP para manejar las peticiones CRUD (Crear, Leer, Actualizar, Borrar).
    - Configurar un servidor Apache para servir las peticiones PHP.
    - Actualizar la aplicación Java para interactuar con los endpoints RESTful para realizar las operaciones necesarias.

---
