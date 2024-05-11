
package Magic_Offline;

public class Carta {
   private String nombre;
   private String rareza;
   private String tipo;
   private int coste;
    
    public Carta(String name, String rare, String type, int cost){
        this.nombre= name;
        this.rareza= rare;
        this.tipo= type;
        this.coste= cost;
    }
    public String comparaCarta(Carta otra){
        String res="";
        if(this.tipo.equals(otra)){
            res+= "Son iguales";
        }    
        else{
            res+="Son diferentes";
        }
        return res;
    }
    
   public int getCoste(){
       return this.coste;
   }
   public void setCoste(int nuevoCoste){
       this.coste= nuevoCoste;
   }
    
    public String getNombre(){
        return this.nombre;
        
    }
    public void setNombre(String cambio){
        this.nombre= cambio;
    }
    public String toString(){
       String res="";
       res+= "Nombre de la carta: "+this.nombre+" Tipo: "+this.tipo;
       res+= "Rareza: "+this.rareza;
       res+= "Coste: "+this.coste;
       return res;
    }
}
