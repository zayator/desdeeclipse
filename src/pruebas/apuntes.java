/*
 * throw new IllegalArgumentException ("") cuando queremos que una funcion de
 * error Por ej. : if (n<0) throw new IllegalArgumentException
 * ("n tiene que ser mayor que 0")
 * 
 * Integer.valueOf -> sirve para convertir de String a Int String.valueOf ->
 * sirve para convertir de Int a String Integer.toHexString ->convertir a base
 * 16 Integer.toBinaryString -> convertir a base 2 y asi con el resto de bases
 * tambien se piede introducir un valor en otra base con : int i=0x A (base16) /
 * i=0b 101 (base2) etc
 * 
 * Math.sqrt() -> para hacer una raiz cuadrada Math. (mirar en oracle) para
 * hacer diversas funciones matematicas
 * 
 * char -> valores con codigo asci .Ej; char c='F' (comillas simples) para meter
 * char tb se puede meter en exadecimal.Ej t="A\u01608"
 * 
 * t[] = a.split("b") ->te quita de la palabra almacenada en el string "a" los
 * caracteres que digas , en este caso "b" y deveulve un array de string. Ej =
 * "boo" -> "oo"
 * 
 * .trim :sirve para limpiar los espacios en blanco de un string escritos al
 * principio y al final de mismo
 * 
 * .indexOf("") : sirve para buscar dentro de un string . Deveulve una posicion.
 * Si no lo ha encontrado devolvera -1
 * 
 * .charAt() : igual que el anterior pero para buscar caracteres
 * 
 * substring(number,number) : saca un trozo desde donde se indique hasta el
 * final o hasta donde se indique
 * 
 * .replace("esto","poresto") -> para sustituir en un string
 * 
 * break : lo puedes poner dentro de un for ,swich while y do while.
 * 
 * compareTo : compara dos strings y devuelve un numero . --*+/-*+-*+Si devuelve
 * un 1 , significa que es mayor en el 'diccionario' , si devuelve un -1 ,
 * significa que es menor en el orden.
 * 
 * 
 * 
 * Algoritmo de la burbuja : sirve para ordenar un array . Mirar ejemplo en
 * "Funciones.java"
 * 
 * composicion de clase : una clase en la que uno de sus atributos es propio de
 * otra clase
 * 
 * new= sirve para crear un objeto (instanciar) toString() -> click derecho ,
 * source,toString() ;
 * 
 * constructor=dice los valores que toma por defecto un objeto, si no se
 * especifica , sus valores son 0 o null no devuelve nada y no tiene tipo ,
 * ademas se llama igual que la clase
 *
 * a.edad = 29; -> operacion tipo set (le da valor al atributo) -> setter
 * System.out.println(a); -> operacion tipo get(reclama el valor del atributo)
 * -> getter un getter de un atributo booleano es : .isAtributo el resto de
 * getters : .getAtributo
 * 
 * bean: clase donde todos sus atributos son private pero los setters son
 * publicos
 * 
 * StdDraw.enableDoubleBuffering()-> se escribe antes del bucle , pero no se
 * muestra nada hasta que no pones show StdDraw.show() -> muestra lo anterior
 * 
 * una funcion estatica no puede hacer uso de una no estatica , pero al revés si
 * 
 * las clases primitivas(escritaas en minusculas) no pueden tomar el valor null:
 * int a =null -> error
 * 
 * el exclusivo del random significa que va a restar uno . Si es del 1 al 100 ,
 * en verdad sera hasta el 99
 * 
 * new Arraylist <'objeto'>(); -> son arrays con arrays
 * 
 * para meter numeros en un array hay que utilizar clases "wraper" , son clases
 * que encapsulan datos primitivos como un objeto . (Son con los mismos nombres
 * pero la primera letra en mayusula e int es 'Integer')
 * 
 * Ejemplo: list<Integer> a = new Arraylist <Integer>(); a.size(); -> equivale
 * al lenght de los arrays.
 * 
 * Para acceder a una posicion del arraylist : a.get[numero] Para asignar una
 * poscion : a.set(posicion,valor)
 * a.set(a.size()-1,(a.get(o)+a.get(a.size()-1)))
 * 
 * PASO DE PARAMETROS POR COPIA 
 * -parametro real=parametro que determinas al
 * -llamar la funcion : multiplicar(n);, n seria el parametro real 
 * -parametro formal = parametro copia del parametro real : void multiplicar(int n ) ; 
 *                                                           n seria parametro formal
 * ARRAYLIST
 * 
 * si quieres duplicar un arraylist : al= new arraylist(al2) ;
 * 
 * al.remove('posicion'); : disminuye el size en uno
 * 
 * al.remove('objeto);
 * 
 * al.removeAll(al2); : elimina una lista de elementos especifica , en este caso borraria todos 
 *                      los elementos que coinciden entre al2 y al
 *
 *al.clear(); : elimina todos los elementos de una lista
 *if(al.isEmpty) : para saber si esta vacio un arraylist
 *
 *para poder borrar por identidad y no por indice (es decir , si tu tienes un array de longitud tres 
 *que contiene un numero dos en alguno de sus indices y haces al.remove(2), eliminaria el numero situado
 *en la posicion dos , no el que contiene dos ), necesitas alacenar el numero que quieras en un objeto:
 * Integer num=2;
 * al.remove(num);
 * 
 * De esta manera eliminaria todas las posiciones con un dos en su interior y no la poscion dos del array
 * 
 * al.sort(null); -> ordena listas de menor a mayor  ;
 * 
 * for( Tipodevariable 'variable'  : estructura que contiene los elemetos , como un array ) {} ->
 * for each , la variable 'variable' oscilara entre los elementos del tipo de la variable dento de
 * la estructura que contiene elementos.
 * 
 *  al.sort(null); -> ordena un arraylist de String de manera alfabetica
 *  
 *  EXCEPCIONES
 *  -Cuando se produce una excepcion , termina el proceso de forma abrupta . 
 *  -Una excepcion es un objeto.
 *  -Hay dos tipos de excepciones : Comprobadas(cheked) y no comprobadas(uncheked)
 *    Las excepciones comprobadas tienen la ,obligacion de usar un try catch o throws
 *    Las excepciones no comprobadas no tienen la obligacion
 *  Sintaxis: 
 *  
 *  try{
 *  
 *  }catch(excepcion (Por ejemplo "NumberFormatException") e){
 *   Se ejecuta esto si da error . Se llama manejador
 *  }
 * 
 *  Sintaxis II:
 *  e.printStakTrace();
 *  e.getCause();
 *  
 *  Entrada.entero("mensaje que solicita numero","mensaje en caso de error");
 *  
 * 'string'.matches(""); -> devuelve true o false en funcion de si el string cumple 
 *                         con el patron otorgado.Ej de patron : "[0-9]{4}[A-Z]{3}" 
 *                         
 *  EXPRESIONES REGULARES
 * "." -> cualquier caracter
 * "*" -> 0 o mas veces
 * "+" -> 1 o mas veces
 * "?" -> 0 o 1
 * "{4}" -> 4 veces
 * "{4,9}" -> entre 4 y 9 veces
 * "{ ,7}" -> 7 o menos 
 * "{5, }" -> 5 o mas veces
 * 
 *
 *
 *  
 *
 *
 *
 *
 *
 *
 *
 *
 */
