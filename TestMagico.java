
package Magic_Offline;

public class TestMagico {

    
    public static void main(String[] args) {
        Carta hada= new Carta("Hada buscadora","Normal","Criatura",2);
        Carta glitters= new Carta("All that Glitters","Normal","Hechizo",3);
        hada.getNombre();
        hada.comparaCarta(glitters);
         System.out.println();
    }
    
}
