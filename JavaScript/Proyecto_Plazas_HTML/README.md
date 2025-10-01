# Sistema de Gestión de Parqueadero

## Descripción

Este proyecto es una aplicación web que permite gestionar el estado de las plazas de un parqueadero en tiempo real. Los usuarios pueden registrarse e iniciar sesión para visualizar qué plazas están ocupadas (rojas) o disponibles (verdes).

La aplicación utiliza Firebase para la autenticación de usuarios y almacenamiento de datos, proporcionando una interfaz simple y moderna para monitorear el estado de las plazas de estacionamiento.

## Características

- **Autenticación segura**: Registro e inicio de sesión con Firebase Auth
- **Monitoreo en tiempo real**: Visualización del estado de las plazas cada 10 segundos
- **Interfaz intuitiva**: Diseño moderno con colores que indican disponibilidad
- **Gestión de plazas**: Control de 4-5 plazas de estacionamiento numeradas

## Tecnologías

- HTML5, CSS3, JavaScript
- Firebase Authentication
- Firebase Realtime Database / Firestore

## Uso

1. Abrir `login.html` o `4plazas.html` en un navegador web
2. Crear una cuenta nueva o iniciar sesión
3. Visualizar el estado de las plazas en tiempo real
4. Cerrar sesión cuando termine la consulta
