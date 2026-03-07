# AppGYM

## Descripción
AppGYM es una aplicación Android desarrollada en **Kotlin** con **Android Studio**, diseñada para demostrar el uso de **Activities** y **Fragments** mediante una aplicacion de gimnasio.
La aplicación permite capturar información del usuario, seleccionar partes del cuerpo a entrenar, visualizar ejercicios recomendados, dar seguimiento al progreso de una rutina y mostrar un resumen final.

---

## Objetivo
Desarrollar una aplicación Android que demuestre el uso de **Activities** y **Fragments** para explicar diferentes elementos de interfaz de usuario de manera funcional, interactiva y visualmente organizada.

---

## Estructura general de la aplicación

### Activities
- **WelcomeActivity**: pantalla de bienvenida.
- **MainActivity**: activity principal que contiene los 5 fragments.

### Fragments
1. **Perfil**
   - Captura la información del usuario mediante `EditText`.
   - Datos registrados:
     - Nombre
     - Edad
     - País
     - Número de teléfono
     - Peso
     - Altura
     - IMC (se genera automaticamente mediante su altura y peso)
     - Motivación

2. **Selección**
   - Permite elegir partes del cuerpo, nivel de entrenamiento y activar recordatorios.
   - Elementos utilizados:
     - `CheckBox`
     - `RadioButton`
     - `Switch`

3. **Ejercicios recomendados**
   - Presenta botones para mostrar rutinas según la parte del cuerpo seleccionada.
   - Elementos utilizados:
     - `Button`
     - `ListView`

4. **Progreso**
   - Da seguimiento al avance de la rutina mediante una barra de progreso y botón de avance.
   - Elementos utilizados:
     - `Button`
     - `ProgressBar`
     - `TextView`

5. **Resumen final**
   - Muestra un cierre visual del flujo de la aplicación.
   - Elementos utilizados:
     - `TextView`
     - `ImageView`

---

## Elementos de interfaz utilizados
- `EditText`
- `Button`
- `CheckBox`
- `RadioButton`
- `Switch`
- `ListView`
- `TextView`
- `ImageView`
- `ProgressBar`

---

## Flujo de uso
1. El usuario abre la aplicación y visualiza la pantalla de bienvenida.
2. Ingresa al menú principal.
3. Completa su perfil con información personal y física.
4. Selecciona las partes del cuerpo que desea entrenar, el nivel y los recordatorios.
5. Consulta ejercicios recomendados.
6. Da seguimiento al progreso de la rutina.
7. Visualiza un resumen final del proceso.

---

## Tecnologías utilizadas
- **Kotlin**
- **Android Studio**
- **XML**
- **Activities**
- **Fragments**
- **BottomNavigationView**

---

## Instrucciones de ejecución
1. Abrir el proyecto en Android Studio.
2. Esperar a que Gradle sincronice correctamente.
3. Ejecutar la aplicación en un emulador o dispositivo Android.
4. Navegar entre las diferentes pantallas utilizando el menú inferior y los botones de navegación.

---

## Evidencias
<img width="442" height="914" alt="image" src="https://github.com/user-attachments/assets/00717154-2594-4a62-9dd1-bbfacbdca5bb" />
<img width="444" height="924" alt="image" src="https://github.com/user-attachments/assets/22b65b54-d6b8-4f59-aefa-624d1f454cad" />
<img width="467" height="932" alt="image" src="https://github.com/user-attachments/assets/8b8956ae-206a-4b75-9ace-b74a40787444" />
<img width="437" height="918" alt="image" src="https://github.com/user-attachments/assets/4a63f93e-7a53-4c84-9695-ed98c9ee0464" />
<img width="446" height="925" alt="image" src="https://github.com/user-attachments/assets/88d55f55-6fc8-4018-b471-1992bdd4c8d2" />
<img width="450" height="923" alt="image" src="https://github.com/user-attachments/assets/7c2071b4-14b7-48e1-89f7-2813325f7a03" />


---

## Autora
**Emilia Ramírez**  
Proyecto académico para la materia de **Desarrollo de Aplicaciones Móviles Nativas**.
