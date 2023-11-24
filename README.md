<h1 align="center">Proyecto PriorityBlockingQueue</h1>

<div align="center">
  <strong>Descripción del Proyecto:</strong>
  <p>PriorityBlockingQueue es una cola bloqueante sin límite que utiliza las mismas reglas de ordenamiento que la clase PriorityQueue y proporciona operaciones de recuperación de bloqueo. Aunque esta cola es lógicamente ilimitada, los intentos de adición pueden fallar debido a la escasez de recursos (causando OutOfMemoryError).</p>
</div>

<div align="center">
  <strong>Funcionamiento:</strong>
  <p>Los elementos de PriorityBlockingQueue se ordenan según su prioridad. La prioridad de un elemento se determina mediante un comparador, que se puede especificar al crear la cola o se puede utilizar el orden natural de los elementos.</p>
  <p>Cuando se añade un elemento a PriorityBlockingQueue, se coloca al principio de la cola si tiene la mayor prioridad. Si el elemento tiene la misma prioridad que otros elementos de la cola, se coloca al final de los elementos con esa prioridad. </p>
  <p>Cuando se retira un elemento de PriorityBlockingQueue, se retira el elemento con la mayor prioridad. Si hay varios elementos con la misma prioridad, se retira el elemento que ha estado en la cola durante más tiempo.</p>
</div>

<div align="center">
  <strong>Casos de uso:</strong>
  <ol>
    <li><strong>Programación Concurrente:</strong> Se puede utilizar para coordinar el acceso a recursos compartidos.</li>
    <li><strong>Almacenamiento en caché:</strong> Se puede utilizar para almacenar datos que deben accederse en orden de prioridad.</li>
    <li><strong>Procesamiento de eventos:</strong> Se puede utilizar para almacenar eventos que deben procesarse en orden de prioridad.</li>
  </ol>
</div>
