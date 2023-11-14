# PracticaProcesosPriorityBlockingQueue
**Nombre del Proyecto:** PriorityBlockingQueue
**Descripción:**  PriorityBlockingQueue es una cola bloqueante sin límite que utiliza las 
mismas reglas de ordenamiento que la clase PriorityQueue y proporciona operaciones de recuperación de
bloqueo. Mientras que esta cola es lógicamente ilimitada, los intentos de adición pueden fallar debido
a la escasez de recursos (causando OutOfMemoryError).
<br>
**Funcionamiento:**  
Los elementos de PriorityBlockingQueue se ordenan según su prioridad. La prioridad
de un elemento se determina mediante un comparador, que se puede especificar al crear
la cola o se puede utilizar el orden natural de los elementos.<br>
Cuando se añade un elemento a PriorityBlockingQueue, se coloca al principio de la cola 
si tiene la mayor prioridad. Si el elemento tiene la misma prioridad que otros elementos
de la cola, se coloca al final de los elementos con esa prioridad.<br>
Cuando se retira un elemento de PriorityBlockingQueue, se retira el elemento con la mayor
prioridad. Si hay varios elementos con la misma prioridad, se retira el elemento que ha estado 
en la cola durante más tiempo.<br>

**Casos de uso:**
1. Programación Concurrente: se puede utilizar para coordinar el acceso a recursos compartidos.
2. Almacenamiento en caché: se puede utilizar para almacenar datos que deben accederse en orden de prioridad.
3. Procesamiento de eventos: se puede utilizar para almacenar eventos que deben procesarse en orden de prioridad.
