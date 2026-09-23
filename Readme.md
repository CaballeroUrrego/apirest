# AUTOR : Sebastian Urrego-Desarollador de software 

# JDBC

**Java Database Connectivity** es una **API** (Interfaz de Programación de Aplicaciones) de **Java** que proporciona un conjunto de clases e interfaces para interactuar con **bases de datos relacionales** desde aplicaciones **Java**.

Permite a los desarrolladores escribir código **Java** para ejecutar **consultas SQL**, insertar, actualizar y eliminar datos en la **base de datos**, así como recuperar y manipular los resultados de las consultas.

Proporciona una forma *estándar y portátil* de conectarse a diversas **bases de datos**, independientemente del sistema operativo o del servidor de base de datos utilizado.

# DAO (Data Access Object)

**Data Access Object** es un *patrón de diseño* utilizado en el desarrollo de software para **separar la lógica de acceso a datos** de la **lógica de negocios** de una aplicación.

El propósito principal del **DAO** es *abstraer y encapsular* las operaciones de acceso a datos específicas de una *fuente de datos*, como una **base de datos**, **un archivo** o un **servicio web**, en un conjunto de métodos definidos en una interfaz.

Esto permite que la **lógica de negocio** de la aplicación interactúe con los **objetos de acceso** a datos a través de interfaces bien definidas, *en lugar de acceder directamente* a la lógica de acceso a datos.

# MAVEN

Es una *herramienta de* **gestión de proyectos** de código abierto. Proporciona una forma estándarizada de *construir, gestionar y desplegar* proyectos de **Java**.

Utiliza un archivo **XML** llamado **POM** (Project Object Model) para describir la estructura del proyecto, sus dependencias, configuraciones de compilación y despliegue, entre otros aspectos.

Se utiliza ampliamente en la comunidad de desarrollo **Java** debido a su facilidad de uso, su robusta gestión de dependencias y su capacidad para automatizar tareas repetitivas en el desarrollo de software.

# Arquitectura: CLIENTE-SERVIDOR

Es un **modelo** de computación distribuida en el que las tareas o funciones de una **aplicación** están divididas entre dos tipos de programas: **el cliente y el servidor**

Facilita la *escalabilidad y la distribución de las tareas* de procesamiento en una red, permitiendo que **múltiples clientes** accedan y compartan recursos o servicios proporcionados por el servidor de manera eficiente Además, facilita la **modularidad** y la actualización de la aplicación, ya que los cambios en la lógica del **servidor** pueden hacerse sin necesidad de modificar la **interfaz del cliente**

**Cliente:** Es la parte de la aplicación que solicita y consume los servicios proporcionados por el servidor

Los clientes suelen ser aplicaciones de usuario final que interactúan con la interfaz de usuario y envían solicitudes al servidor para realizar operaciones específicas

**Servidor:** Es la parte de la aplicación que recibe las solicitudes del cliente, procesa estas solicitudes y devuelve los resultados adecuados

Los servidores suelen ser programas que se ejecutan en máquinas dedicadas y que están diseñados para manejar múltiples solicitudes de clientes simultáneamente

#  framework Spring

Es un **framework** de desarrollo de aplicaciones **Java** que proporciona soporte integral para el desarrollo de aplicaciones empresariales Ofrece una amplia gama de **características y módulos** que me abordan diferentes aspectos del desarrollo de software, incluyendo la inversión de control (IoC), la *inyección de dependencias*, la gestión transaccional, el desarrollo basado en aspectos (AOP), la seguridad, la *persistencia de datos*, entre otros

**Spring** se integra fácilmente con otros **frameworks y tecnologías**, lo que lo convierte en una opción popular para el desarrollo de aplicaciones **Java** en una amplia variedad de contextos, desde aplicaciones web hasta servicios **RESTful**, **microservicios** y aplicaciones empresariales complejas.

# Hibernate

Es un **framework** de mapeo objeto-relacional (**ORM**) para **Java** que simplifica la interacción con **bases de datos relacionales** al permitir a los desarrolladores trabajar con objetos **Java** en lugar de **SQL** directamente

Proporciona herramientas para mapear **objetos** a **tablas** de **base de datos**, gestionar sesiones y transacciones, realizar consultas utilizando **HQL** (Hibernate Query Language) y gestionar relaciones entre entidades, lo que facilita el desarrollo de aplicaciones al eliminar la necesidad de escribir consultas **SQL** manualmente y proporcionar una abstracción de la capa de persistencia.

# Persistencia de Datos

### Entidades
*Persistencia de datos*

Son **clases** que representan objetos de negocio en tu aplicación Las **entidades** están relacionadas con las **tablas** de la base de datos Por ejemplo, si estás construyendo una aplicación de comercio electrónico, podrías tener una entidad Producto que corresponde a la tabla productos en la base de datos

### Repositorios
*Persistencia de datos*

Son **interfaces** o **clases** que proporcionan **métodos** para realizar operaciones **CRUD** en las **entidades** Los **repositorios** actúan como una capa de abstracción entre la *lógica de negocio* y el *almacenamiento de datos*, permitiendo a la aplicación interactuar con la **base de datos** de manera más fácil y consistente

### Servicios
*Persistencia de datos*

Son **clases** que encapsulan la **lógica de negocio** de tu aplicación Los servicios suelen ser responsables de coordinar las operaciones en las entidades y repositorios, aplicando reglas de negocio y realizando operaciones complejas que van más allá de la simple manipulación de datos

### Controladores
*Persistencia de datos*

Son **componentes** responsables de manejar las **peticiones HTTP** y de interactuar con el **usuario** En el contexto de una aplicación web, los **controladores** reciben **solicitudes HTTP**, llaman a los **servicios** correspondientes para procesar la *lógica de negocio* y devuelven **respuestas HTTP** adecuadas.

# Modelo Vista Controlador

**MVC** (Modelo-Vista-Controlador) en **Java** es un **patrón arquitectónico** que divide una aplicación en tres componentes principales: el **Modelo**, que representa los datos y la lógica de negocio; la **Vista**, que es la interfaz de usuario; y el **Controlador**, que actúa como intermediario entre el modelo y la vista, manejando las solicitudes del usuario y coordinando la interacción entre los otros dos componentes.

Este enfoque facilita la *modularidad, la escalabilidad y el mantenimiento* del código en aplicaciones web Java.

# Práctica: API REST de Productos

## Objetivo
Crear y probar una API REST para administrar productos mediante operaciones CRUD:
* Crear productos.
* Consultar productos.
* Actualizar productos.
* Eliminar productos.

## Tecnologías utilizadas
* Java 21
* Spring Boot 4.1.1
* Spring Web MVC
* Spring Data JPA
* Hibernate
* PostgreSQL 16
* DBeaver
* Docker
* Docker Compose
* Maven
* Visual Studio Code
* Postman

## Inicialización del proyecto

### Requisitos

Antes de iniciar el proyecto, instala las siguientes herramientas:

* Java 21
* Docker Desktop
* Visual Studio Code
* Postman, para probar la API

Comprueba que Java y Docker estén disponibles:

```powershell
java -version
docker --version
docker compose version
```

### Configuración del archivo `.env`

En la raíz del proyecto debe existir un archivo llamado `.env` con la configuración de PostgreSQL:

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/databaseProducto
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=postgres
SPRING_DATASOURCE_DB=databaseProducto
```

> No publiques el archivo `.env` en repositorios públicos porque contiene credenciales de acceso.

### Iniciar PostgreSQL con Docker

Abre PowerShell en la carpeta raíz del proyecto, donde están `docker-compose.yml` y `.env`:

```powershell
docker compose up -d
```

Este comando descarga la imagen `postgres:16` si es necesario, crea el contenedor `apirest-postgres` y expone PostgreSQL en el puerto `5432`.

Comprueba que el contenedor esté funcionando:

```powershell
docker compose ps
```

Para consultar los registros de PostgreSQL:

```powershell
docker compose logs -f postgres
```

Presiona `Ctrl+C` para salir de los registros. El contenedor seguirá ejecutándose.



La API estará disponible en:

```text
http://localhost:8080
```

También puedes iniciar la aplicación desde Visual Studio Code ejecutando la clase `ApirestApplication`.

### Probar la API en Postman

La ruta base es:

```text
http://localhost:8080/Productos
```

| Operación | Método | URL |
|---|---|---|
| Obtener todos los productos | `GET` | `http://localhost:8080/Productos` |
| Obtener un producto | `GET` | `http://localhost:8080/Productos/1` |
| Crear un producto | `POST` | `http://localhost:8080/Productos` |
| Actualizar un producto | `PUT` | `http://localhost:8080/Productos/1` |
| Eliminar un producto | `DELETE` | `http://localhost:8080/Productos/1` |

Para las peticiones `POST` y `PUT`, selecciona **Body > raw > JSON** y utiliza:

```json
{
	"nombre": "Laptop",
	"precio": 899.99
}
```

Añade el encabezado:

```text
Content-Type: application/json
```



Para detener la aplicación Spring Boot, presiona `Ctrl+C` en la terminal donde está ejecutándose.

Para detener PostgreSQL:

```powershell
docker compose down
```

Los datos se conservan en la carpeta `postgres/` gracias al volumen configurado en `docker-compose.yml`.

> No elimines la carpeta `postgres/` si quieres conservar los datos de la base de datos.