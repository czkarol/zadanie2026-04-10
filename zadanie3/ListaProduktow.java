import java.util.ArrayList;

public class ListaProduktow {
  public static void main(String[] args) {
    ArrayList<Produkt> listaProduktow = new ArrayList<Produkt>();
    listaProduktow.add(new Produkt("Jablko", 5, 4));
    listaProduktow.add(new Produkt("Orng", 7, 3));
    listaProduktow.add(new Produkt("Rower", 200, 1));
    listaProduktow.add(new Produkt("Kaloryfer", 150, 2));

    for(Produkt produkt : listaProduktow){
      System.out.println("----------------------");
      produkt.wyswietl();    
    }
  }
}
