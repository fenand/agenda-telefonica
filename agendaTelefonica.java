import java.util.HashMap;
// los metodos mas importantes de la clase hashmap es get y put
// put vale para añadir al mapa"coleccion" una entrada con la clave del objeto y el objeto
// y get vale para sacar el objeto mediante la clave que tiene cada objeto
public class agendaTelefonica
{
    // para crear un hashmap se crea como un arraylist
    // definimos un nuevo atributo llamado agenda de telefono
    // dentro del menor y mayor hay que poner utiliza claves de tipo string asociados a valores de tipo string o del tipo que queramos

    private HashMap <String, String> agendaDeTelefonos;

    /**
     * Constructor for objects of  class agendaTelefonica
     */
    public agendaTelefonica(){
        // inicializar el atributo creado a unnuevo hashmap con la notacion diamantre <> y sin parametros para poder usar el metodo put si no se hace
        // se incia a null y no tiene un metodo put null
        agendaDeTelefonos  = new HashMap<>();
    }

    public void enterNumber(String nombre, String numeros){
        //metodo put  la cadena que recibimos como parametro se añade como clave y la segunda como valor
        agendaDeTelefonos.put(nombre,numeros);
    }

    public void lookupNumber(String nombre){
        // metodo que se pasa nombre por paramreto y y imprime por pantalla la clave con el metodo get  de mi hashmap
        System.out.println(agendaDeTelefonos.get(nombre));

    }

    /**
     * metodo para imprimir todas las claves 
     */
    // el metodo utiliza un meodo set que devuelve un conjunto de claves Set<K,V> devuelve la K que es la clave solo seria asi solo este metodo a utilizas Set<K>
    public void printAllName(){
    
        System.out.println(agendaDeTelefonos.keySet());
    
    }
}