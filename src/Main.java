// [x] 1. Skapa en hund som har ett namn
// [x] 2. Skapa ett hunddagis med lista för hundar
// [x] 3. Göra så att dagiset kan ta emot nya hundar
// [x] 4. Ropa upp alla hundar på plats

public class Main {
    static void main(String[] args) {
        HundDagis hundDagis = new HundDagis();

        hundDagis.taEmot(new Hund("Fido"));
        hundDagis.taEmot(new Hund("Bella"));

        hundDagis.ropaUpp();


    }
}
