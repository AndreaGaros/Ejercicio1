package Ejercicio1;

/**
 * Created by Andrea on 29/09/2015.
 */
public class Tree {

    //Declaramos variables
    public int metros;
    public String tipo;

    //Constructores
    public Tree(){
        this(0,null);
    }

    public Tree (int metros){
        this(metros, null);
    }

    public Tree (String tipo){
        this(0,tipo);
    }

    public Tree (int metros, String tipo){
        this.metros = metros;
        this.tipo = tipo;
    }

    @Override       //Para sobreescribir un metodo

    //toString nos permite mostrar la información completa de un objeto (atributos).
    public String toString(){
        StringBuilder sb = new StringBuilder(); //para trabajar con cadenas de caracteres
        sb.append("Un"); //append para añadir a la cadena
        if (tipo == null)
            sb.append("arbol");
        else
            sb.append(tipo);

        sb.append("de");

        if (metros != 0)
            sb.append(metros).append("metros");

        return sb.toString();

    }

}
