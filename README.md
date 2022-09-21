# poop-code

## Propósito

La idea inicial es crear pequeños proyectos con "código de mierda" (a partir de ahora "poop-code").

A partir de estos proyectos de poop-code hacer diversos "retos" para ir aplicando buenas prácticas de desarrollo.

Por ejemplo el primer reto sería realizar tests que probaran todo el código y nos sirvieran a futuro para realizar refactorizaciones con seguridad de no romper nada.

Una vez se tenga un "ganador" el proyecto de poop-code con sus tests pasará a ser otro proyecto poop-code y tendrá un nuevo reto, por ejemplo, refactorizar de una manera específica.

## Por qué participar

Creo que siempre es interesante ver código "legacy", sobre todo pasados unos años, este código en muchos casos cuando se escribió realmente se consideraba bueno y que seguía buenas prácticas, al menos en el ámbito y ambiente en el que se generó seguramente estaba admitido. Entonces por una parte conoceremos diferentes formas de llegar al mismo lugar, seguramente se vean incluso paso a paso como llegar a un código que actualmente se considere que está bien.

Luego en la parte de los retos, como la idea es que los poop-code no sean grandes, creo que pueden ser ideales para aprender/probar cosas que normalmente a nivel laboral no se prueban. Nuevas librerías, patrones que nos parecen extraños porque nunca los hemos implementado, etc... Si hay varias aportaciones seguramente conozcamos cosas que nunca hemos visto o que solo hemos visto en algún tutorial o noticia. Yo os invito por ejemplo a revisar índices como éste https://github.com/akullpp/awesome-java/blob/master/README.md de librerías y probar a hacer retos con cosas que no hayáis utilizado. Es posible que en este índice existan librerías muy verdes actualmente pero nadie nos dice que sean las más comunes dentro de 5 años.


## Requisitos de un poop-code

Cada proyecto de poop-code debe cumplir los siguientes requisitos en su primera versión:

- LA HISTORIA PREVIA. Debe tener una historia interesante. Debe contarse cómo se llegó a tener ese código en un mundo imaginario, cuales fueron las razones y como ha llegado a nosotros.
- ESTADO DEL PROYECTO. Debe funcionar "bien", no tiene por qué tener mucha lógica de negocio pero debe ser un proyecto que compile correctamente y que funcione, nuestro poop-code debe ser susceptible de que alguien diga "funciona bien, así que no lo toques"
- TECNOLOGÍAS. Inicialmente se utilizará Java y Springboot como base. Las versiones mínimas, java 11 y Springboot 2.7, pero pueden ser superiores. Además utilizaremos Maven para agilizar todo el tema de dependencias. Aunque sea poop-code vamos a sobreentender que viene de un entorno en el que las versiones de java y Spring se han ido actualizando (aunque el código siga siendo de un estilo prehistórico)
- FUNCIONALIDAD. Inicialmente todos los proyectos tendrán una funcionalidad básica de una única operación rest a la cual se le podrá hacer una petición y obtendremos una respuesta. La idea es poder probar fácilmente con un cliente rest. Puede tener parámetros que modifiquen el resultado como filtros.
- TESTS. No debe tener tests.
- NOMENCLATURA. El modulo inicial deberá tener un nombre, a elegir el que se quiera, por ejemplo el primero se va a utilizar el nombre "dragon-ball-generator". A este nombre le van a seguir sufijos, con los que indicaremos qué retos ha pasado. Inicialmente entonces el módulo se llamará "dragon-ball-generator-poop-code". Cuando hayamos realizado el reto de poner tests, el nuevo módulo se llamará "dragon-ball-generator-poop-code_tests". Si se hace otro reto de "Unificación de nomenclatura" pues se llamará  algo como "dragon-ball-generator-poop-code_tests_rename". De esta manera podremos tener varios módulos en los que podremos ir viendo una especie de histórico del poop-code como si fueramos dando saltos en el tiempo. En algún momento se podrá hacer una revisión y ver si realmente se ha mejorado el código inicial o solo se han dado vueltas.


## Información de un reto

Cada reto debe constar de la siguiente información:

- EL MOMENTO ACTUAL. Como parte de la historia hay que contar qué se quiere hacer ahora y por qué, qué motivaciones llevan a querer hacer cambios en este poop-code. Por ejemplo el primer reto podría ser "Tests de todo el código"
- OBJETIVOS. Se debe indicar qué objetivos tenemos, por ejemplo si es el reto de hacer tests, pues sería Objetivo 1. 100% de cobertura del código funcional de nuestra aplicación
- COSAS QUE NO SE PUEDEN TOCAR. La idea es ir haciendo "retos" de forma progresiva no es interesante que a la vez que se hagan los tests, se realice refactorización y se cambie todo completamente. Por ejemplo para el reto de tests, se indicará que está totalmente prohibido tocar el código productivo.

## Participantes

Está abierto al mundo entero xD. Aunque sí es cierto que habrá un límite de tiempo para revisar las aportaciones, por ser claros, no se van a revisar aportaciones dentro de 10 años y lo mismo si llegara el caso improbable de recibir decenas de aportaciones no se revisarían todas.

## Forma de participar

Hay 2 formas de participar, como creador de poop-codes iniciales o como participante de los retos:
- Como creador, los poop-code se subirán como módulos independientes en este proyecto, será un repositorio único inicialmente, así que se hará una pr con el poop-code y una vez revisado se aceptará y pasará a la rama main. Si a futuro creciera mucho crearíamos un repositorio por poop-code. Solo se aceptarán poop-codes que ofrezcan algo nuevo a lo ya existente, que contengan code-smells interesantes o casos de código de mierda que no se tenga contemplado en anteriores poop-codes.
- Como participante, las aportaciones se harán creando un branch desde el poop-code que se indique en el reto, se realizará el reto y se hará una pr. Se revisarán estás pull request pero seguramente no se lleguen a mergear nunca. Lo más seguro es que se coja lo mejor de varias y se cree el código para el módulo que dará paso al siguiente reto. Me explico si el primer reto es hacer tests, una vez recibidos varios pull request se elegirá cual de ellos es mejor y se creará un nuevo módulo que contendrá el código base del poop-code + los tests (a modo Frankenstein de todas las aportaciones interesantes)

## Qué debe tener una pr

Debe cumplir los siguientes requisitos:

- Compilar bien todo, no se revisarán prs que no pasen "mvn clean install" (Esto incluye que pasen los tests, si existieran)
- Todos los poop-code tendrán un README.md en su base. El participante deberá añadir en este fichero explicación de qué ha hecho y por qué. Si se ha apoyado en alguna tecnología, librería, si ha aplicado algún patrón de diseño, etc... Nos interesa más el por qué de cada elección que lo que se ha elegido. Me explico, me da igual que se elija para hacer tests unitarios junit5 que testng, pero si hay una razón de peso por la que has optado por algo es muy interesante mencionarlo.
- Cumplir todos los objetivos marcados en el reto, no valen "soluciones a medias". Si se pide cubrir todo el código con tests no vale hacer un caso de test y decir "ya lo demás igual". Como la idea es ir iterando el código por diferentes retos es necesario que se realice todo lo comentado en el test para poder reutilizarlo en siguientes retos.
