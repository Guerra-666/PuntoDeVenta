Gestión de Inventario

Este repositorio contiene una aplicación de gestión de inventario desarrollada en Java utilizando Swing para la interfaz gráfica. La aplicación permite realizar las siguientes operaciones:

    Alta de Producto
    Alta de Venta
    Visualizar Inventario
    Agregar Productos Nuevos

Tabla de Contenidos

    Requisitos
    Instalación
    Uso
    Estructura del Proyecto
    Contribuciones
    Licencia
    Futuras Mejoras

Requisitos

Para ejecutar esta aplicación, necesitas tener instalado:

    Java Development Kit (JDK)
    MySQL
    Apache Tomcat (o cualquier otro servidor compatible con Servlets y JSP)
    PHP

Instalación

    Clona el repositorio:

    bash

git clone https://github.com/tu-usuario/gestion-de-inventario.git
cd gestion-de-inventario

Configura la base de datos MySQL:

    Crea una base de datos en MySQL.
    Ejecuta los scripts SQL proporcionados en el directorio db/ para crear las tablas necesarias.

sql

CREATE DATABASE inventario_db;
USE inventario_db;

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    codigo_barras VARCHAR(255) NOT NULL,
    categoria VARCHAR(255),
    precio DECIMAL(10, 2),
    cantidad INT
);

CREATE TABLE ventas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    producto_id INT,
    cantidad INT,
    precio_venta DECIMAL(10, 2),
    fecha DATE,
    FOREIGN KEY (producto_id) REFERENCES productos(id)
);

Configura el archivo de propiedades de la base de datos:

Crea un archivo database.properties en el directorio src/main/resources/ con el siguiente contenido:

properties

db.url=jdbc:mysql://localhost:3306/inventario_db
db.username=tu_usuario
db.password=tu_contraseña

Compila y ejecuta la aplicación:

Utiliza tu IDE preferido para abrir el proyecto y compilarlo, o ejecuta los siguientes comandos desde la terminal:

bash

    javac -d bin src/*.java
    java -cp bin InventoryManagementApp

Uso

    Alta de Producto:
        Navega a la pestaña "Alta de Producto".
        Rellena los campos con la información del producto.
        Haz clic en "Agregar Producto".

    Alta de Venta:
        Navega a la pestaña "Alta de Venta".
        Rellena los campos con la información de la venta.
        Haz clic en "Registrar Venta". La fecha de la venta se rellenará automáticamente.

    Visualizar Inventario:
        Navega a la pestaña "Visualizar Inventario".
        Ingresa el código de barras del producto para verificar la cantidad en inventario.
        Haz clic en "Mostrar Inventario Total" para ver una lista completa del inventario.

    Agregar Productos Nuevos:
        Navega a la pestaña "Agregar Productos Nuevos".
        Rellena los campos con la información del nuevo producto.
        Haz clic en "Agregar Producto".

Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

scss

gestion-de-inventario/
├── src/
│   ├── InventoryManagementApp.java
│   └── (otros archivos .java)
├── db/
│   └── scripts.sql
└── README.md

Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos para contribuir:

    Haz un fork del repositorio.
    Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
    Realiza tus cambios y haz commit (git commit -am 'Añadir nueva funcionalidad').
    Empuja los cambios a la rama (git push origin feature/nueva-funcionalidad).
    Abre un Pull Request.

Licencia

Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.
Futuras Mejoras

    Conexión a MySQL:
        Implementar la conexión a una base de datos MySQL para persistir los datos de productos y ventas.
        Utilizar JDBC para interactuar con la base de datos.

    Integración con PHP:
        Crear un servicio RESTful utilizando PHP para manejar las peticiones CRUD (Crear, Leer, Actualizar, Borrar).
        Configurar un servidor Apache o Nginx para servir las peticiones PHP.
        Actualizar la aplicación Java para interactuar con los endpoints RESTful para realizar las operaciones necesarias.
