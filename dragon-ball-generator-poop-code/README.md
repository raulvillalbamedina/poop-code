# Dragon Ball Generator Poop Code

## LA HISTORIA

Hace muchos años, un programador llamado Pepe, recién salido de sus estudios (aquí imaginad lo que queráis), llegó a su primer trabajo. En sus estudios había utilizado siempre código en lenguaje Cobol y tenía algunas nociones muy básicas de orientación a objetos.

La empresa a la que llegó utilizaban Java y Springboot como base de sus aplicaciones, principalmente hacían apis para videojuegos que utilizaban otras empresas.

A nivel de organización, siempre iban con prisas para cualquier cosa, no aplicaban ningún tipo de marco ágil de desarrollo, lo importante era tener para ya algo en producción, daba igual si bien o mal. 

A nivel de negocio tenían poca organización y los requerimientos eran siempre muy difusos, se sabía que se necesitaba algo pero encontrar a la persona que supiera el comportamiento específico era dificil.

La primera tarea de nuestro amigo Pepe fue la siguiente "Queremos un endpoint que devuelva NPCs generados aletoriamente", fin, sí solo tenía un título, no había descripción de nada al respecto. Bueno si le dieron más información, "se necesita en producción para hace 10 días en el pasado y tenemos máximo 5 días para hacerlo". 

Imaginad al pobre Pepe, recién llegado, sin unas especificaciones mínimas de qué tiene que hacer, donde lo tiene que hacer, pues era normal que creara un "poop-code".

Además en el área donde llegó Pepe faltaba personal técnico, así que documentación, persona de referencia o "on boarding" no existieron. 

Después de varios días dando bandazos con cosas como las siguientes y otras que os podéis imaginar, Pepe llegó a saber qué se necesitaba, lista de cosas que hizo:
- "qué es java y qué es Springboot"
- "A quién puedo preguntar como configuro todo en mi ordenador"
- "Sobre la tarea quién de la empresa puede decirme que hay que hacer exactamente"

Conclusión a la que llegó:
- Se necesitaba un servicio nuevo
- Un solo endpoint que devolviera un NPC (que es un Personaje no jugador en los videojuegos) generado aleatoriamente con varios campos.
- La posibilidad de enviar algunos campos por el endpoint.

Entonces Pepe se miró varios tutoriales "hola mundo" de las tecnologías, algún compañero le explico algo del IDE que usaban en la empresa, con mucha prisa y corriendo. Y finalmente Pepe consiguió hacer lo que le pedían y ponerlo en producción.

Bueno, no tan rápido, el proyecto de Pepe se subió varias veces a producción debido a que a veces daba errores al hacer la llamada al endpoint, algo de un índice de un array estaba mal o algo así dicen las malas lenguas... luego pidieron añadir un campo más, después añadir más valores posibles a uno de los campos y así un variado etc...

Entonces llegamos al momento en que el servicio hecho por Pepe estaba en producción, funcionaba como se necesitaba y entonces Pepe fue cambiado de equipo dentro de la empresa y su proyecto quedó "como se parió". Nadie lo volvió a revisar e incluso se olvidó que existía durante un tiempo.

Después, a lo largo de varios años, se necesitó, por requerimientos de negocio, añadir algún campo nuevo y cambios menores. Cualquier cambio en este servicio SIEMPRE requería hacer subidas a producción y por raro que parezca cosas que deberían ser rápidas y no tener ningún tipo de complejidad se demoraban mucho tiempo, daba igual quien realizara el cambio, fueran becarios, juniors o seniors.

Esta situación dió pie a que varias personas de la empresa pensaran que se debería revisar este servicio a ver si se podría mejorar algo en él...

Además han surgido varias necesidades nuevas, generación masiva de NPCs, recuperación de NPCs generados anteriormente, actualización de datos, etc... Todas estas necesidades se han ido aplazando debido a que nadie se atreve a meter mano en semejante berenjenal.

La frase que más se oye cuando se habla de este servicio es "está funcionando, que no lo toque nadie que la liamos!!!" y "a saber que hace, dicen que un tal Pepe lo hizo pero hace años que no está y no hay documentación...". 

Hay clientes que lo utilizan y se quejan de que es difícil de entender y que no existe documentación de nada, están frustrados y les obliga a realizar muchos procesos que otros servicios rest que utilizan ya les dan por defecto.




