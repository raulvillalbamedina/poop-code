# Testear mucho y bien

Este reto va a consistir en añadir tests al proyecto.

## MOMENTO ACTUAL
Hay que ponerse en la piel de un programador con varios años de experiencia, por ejemplo 3 años en el mismo proyecto. Se va a llamar Javi, si quieres otro eres libre de imaginartelo. Javi ha llegado a la empresa y le han dicho que tienen un servicio del "año de la polca" que quieren evolucionar, refactorizar y poner todo lo más bonito posible. Le han dado el repositorio y cuando Javi se ha dado la vuelta diciendo un "¿qué mierda es esta?" se ha encontrado solo en la sala, sí lo habían abandonado a su suerte. A lo lejos un compañero le grita mientras se ríe "la que te ha caído chaval! vas a cagar sangre!".
Javi no sabe si dar la carta de que se va de la empresa o llorar en el regazo de su madre, pero de repente, "piriipi", un nuevo mail de su nuevo jefe con las indicaciones de lo que esperan que haga.

## OBJETIVOS
Mail del jefe de Javi:

"
Buenas Javier,

Bienvenido a bordo! Esperamos mucho de tí. Tu primera tarea es crear una capa de tests muy fuerte, a prueba de bombas, como solo tú puedes hacer (que para eso te hemos contratado). Tienes total libertad para elegir librerias o formas de testear (dentro del ámbito de java) pero recuerda esto bien y grábatelo a fuego "NO PUEDES TOCAR EL CÓDIGO PRODUCTIVO, NI UNA COMA" (Esto es todo lo que está dentro de src/main). Aún no te conocemos y no nos fiamos de que puedas romper algo. La idea es tener una "red de seguridad" de tests autoMÁGICOS que nos permita a futuro refactoriar este servicio sin miedo a romper nada. Ahora mismo nos da igual que estrategia o tipos de tests decidas implementar. Si quieres que sean todos de integración utilizando Springboot o si prefieros todos unitarios o prefieres hacer un "mix" nos parece bien lo que decidas, que para eso eres el ingeniero "champion" que hemos contratado.

Ah por cierto, todo lo que utilices, seguramente lo presentaremos a los demás equipos de desarrollo de la empresa para que lo empiecen a utilizar igual que lo hagas tú. Así que esperamos que seas tan experto en el testing como nos contaste en las entrevistas y no venga nadie de otros equipos hablando mal de tus propuestas.

pd. Ahora solo queremos tests que se ejecuten con maven y que nos permitan refactorizar sin miedo, no estamos interesados de momento en tests de carga ni nada parecido.

Saludos y para cualquier duda puedes escribir a cualquier otra persona del equipo
"


## COSAS QUE NO SE PUEDEN TOCAR

El código dentro de src/main
