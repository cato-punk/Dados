1. identifique TODAS las clases presentes en el dominio problema
  Dado: Representa un dado. Su mision es simular un lanzamiento y mantener el valor de su cara superior.
  JuegoDeDados: hace juego completo. Coordina el lanzamiento de los dos dados, utiliza la funcionalidad de suma, y determina el resultado (ganar/perder).
  Suma:  para sumar dos números enteros. Se utiliza como un componente auxiliar para el JuegoDeDados.
  JuegoDeDadosTest: esta clase no es parte del dominio del problema , pero especificarla no esta demas
2. Establezca los atributos y métodos para c/CLASE.
  Clase: Dado
  Atributos: caraSuperior (int): Almacena el valor de la cara visible del dado después de un lanzamiento (entre 1 y 6).
  Métodos: lanzar(): Simula el lanzamiento del dado, generando un número aleatorio y asignándolo a caraSuperior.
           getCaraSuperior(): Retorna el valor actual de la caraSuperior


  Clase:JuegoDeDados
  Atributos: dado1 (Dado): Una instancia del primer dado utilizado en el juego.
             dado2 (Dado): Una instancia del segundo dado utilizado en el juego.
             sumador (Suma): Una instancia de la clase Suma para realizar la operación de adición.
  Métodos:
            JuegoDeDados(): Constructor que inicializa los dos Dados y el sumador.
            JuegoDeDados(Suma sumador): Un constructor alternativo que permite inyectar una instancia de Suma, útil para pruebas.
            jugar(): Ejecuta una ronda del juego. Lanza ambos dados, calcula la suma de sus caras superiores y determina si se ganó o se perdió, retornando un mensaje con el resultado.
            getSumaCaras(): Un metodo auxiliar para obtener la suma de las caras de los dados lanzados.
            getDado1(): Retorna la instancia de dado1.
            getDado2(): Retorna la instancia de dado2.  


  Clase: Suma
  Atributos:(No requiere atributos para su funcionalidad actual de solo sumar)
  Métodos:sumar(int a, int b): Recibe dos números enteros y retorna su suma       


3. Identifique y defina las relaciones entre clases presentes en este caso.
    Entre JuegoDeDados y Dado:
      General: Asociacion
      Relacion: Composición (una forma fuerte de agregacion) "tiene dos"
      Justificacion: Porque JuegoDeDados contiene dos Dados. La existencia de estos Dados esta ligada al JuegoDeDados en este contexto; si el juego de dados se destruye, esos dados específicos de ese juego no tienen sentido dentro de esa instancia del juego.
      Multiplicidad: Un JuegoDeDados tiene 2 Dados.    

    Entre JuegoDeDados y Suma:
      General: Asociacion
      Relacion: Agregacion ("tiene una", agregacion mas debil)
      Justificación: Un JuegoDeDados utiliza o tiene una Suma. La Suma es un componente que puede existir independientemente del JuegoDeDados y podría ser reutilizada por otras clases si fuera necesario. La vida de una instancia de Suma no está estrictamente ligada a la vida de una instancia de JuegoDeDados.
      Multiplicidad: Un JuegoDeDados tiene 1 Suma.











