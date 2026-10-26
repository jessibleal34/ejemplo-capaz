# 📋 Sistema de Gestión de Tareas en Java

## 📌 Descripción del proyecto

Este proyecto consiste en una aplicación de consola desarrollada en Java para gestionar tareas. Permite crear tareas, consultar el listado, marcar tareas como completadas y guardar la información utilizando diferentes implementaciones de repositorios.

El proyecto tiene como objetivo poner en práctica conceptos fundamentales de programación orientada a objetos, especialmente el uso de interfaces, la separación por capas y la inyección de dependencias.

## 🎯 Objetivos

- Aplicar interfaces para definir contratos entre componentes.
- Separar las responsabilidades mediante una arquitectura por capas.
- Implementar la inyección de dependencias mediante constructores.
- Utilizar diferentes implementaciones de un mismo repositorio.
- Comprender cómo cambiar una implementación sin modificar la lógica de negocio.

## 🛠️ Tecnologías utilizadas

- **Java 26:** lenguaje de programación.
- **Git:** sistema de control de versiones.
- **GitHub:** plataforma de alojamiento del repositorio.
- **VS Code:** editor utilizado para desarrollar el proyecto.

## ⚙️ Funcionalidades

La aplicación permite:

- Crear tareas.
- Consultar las tareas registradas.
- Marcar tareas como completadas.
- Seleccionar diferentes implementaciones del repositorio.
- Mostrar mensajes de confirmación al guardar tareas en el modo de registro.

## 🏗️ Arquitectura del proyecto

El proyecto utiliza una organización por capas para separar las responsabilidades.

### 1. Capa de presentación

Se encarga de interactuar con el usuario mediante la consola y gestionar las opciones del menú.

### 2. Capa de negocio

Contiene la lógica relacionada con las tareas y los servicios que gestionan las operaciones de la aplicación.

### 3. Capa de persistencia

Define el contrato del repositorio mediante la interfaz `RepositorioTareas` y permite utilizar distintas implementaciones para gestionar las tareas.

## 🧩 Interfaces e inyección de dependencias

La interfaz `RepositorioTareas` define las operaciones que deben implementar los repositorios.

La clase `ServicioTareas` trabaja con esta interfaz en lugar de depender directamente de una implementación específica.

La clase `Principal` selecciona el repositorio que se utilizará y lo proporciona al servicio mediante inyección de dependencias.

Este diseño permite cambiar la implementación del repositorio sin modificar la lógica principal del servicio.

## 📂 Estructura del proyecto

La estructura general del proyecto se organiza dentro de la carpeta `src`.

```text
src/
└── com/
    └── tareas/
        ├── Principal.java
        ├── negocio/
        ├── presentacion/
        └── persistence/
            └── repository/
                ├── RepositorioTareas.java
                └── RepositorioTareasLog.java
```

La estructura exacta puede incluir otras clases e implementaciones de repositorios.

## 🚀 Requisitos previos

Para ejecutar el proyecto necesitas:

- Tener instalado el JDK de Java.
- Tener Git instalado.
- Disponer de una terminal, como Git Bash.
- Tener el proyecto descargado en tu equipo.

## 💻 Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone URL_DE_TU_REPOSITORIO
```

Reemplaza `URL_DE_TU_REPOSITORIO` por la dirección HTTPS de tu repositorio de GitHub.

### 2. Entrar en la carpeta del proyecto

```bash
cd ejemplo-capaz
```

### 3. Compilar el proyecto

Desde la carpeta raíz, ejecuta:

```bash
mkdir -p out
javac -encoding UTF-8 -d out $(find src -name "*.java")
```

### 4. Ejecutar la aplicación

Para utilizar el repositorio de archivos:

```bash
java -cp out com.tareas.Principal archivo
```

Para utilizar el repositorio en memoria:

```bash
java -cp out com.tareas.Principal memoria
```

Para utilizar el repositorio de registro:

```bash
java -cp out com.tareas.Principal log
```

**Nota:** los comandos anteriores corresponden a Git Bash. Las implementaciones disponibles dependen de las clases configuradas en el proyecto.

## 🧪 Pruebas realizadas

Se comprobó la ejecución de la aplicación en los modos `archivo` y `log`, verificando las operaciones de gestión de tareas y el mensaje de confirmación de guardado en el modo de registro.

El modo `memoria` también se utilizó durante las pruebas del proyecto.

## 📚 Conceptos aprendidos

Durante el desarrollo se trabajaron los siguientes conceptos:

- Programación orientada a objetos.
- Interfaces en Java.
- Separación de responsabilidades.
- Arquitectura por capas.
- Inyección de dependencias.
- Implementación de repositorios.
- Compilación y ejecución desde la terminal.
- Control de versiones con Git.
- Publicación de proyectos en GitHub.

## 👩‍💻 Autora

Proyecto desarrollado como ejercicio práctico de aprendizaje de Java, interfaces, arquitectura por capas e inyección de dependencias.