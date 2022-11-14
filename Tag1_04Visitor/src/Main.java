import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;
import de.visitor.PrintVisitor;
import de.visitor.ResetArbeitszeitVisitor;
import de.visitor.StatistikVisitor;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

//         var liste = List.of("Eins","Zwei","Drei");
//
//         liste.forEach(System.out::println );

        Firma firma = new Firma();

        firma.add(new LohnEmpfaenger("Schmitt",40,13));
        firma.add(new LohnEmpfaenger("Mayer",30,20));
        firma.add(new GehaltsEmpfaenger("Hinz",1000));
        firma.add(new GehaltsEmpfaenger("Kunz",3000));
        firma.add(new LohnEmpfaenger("Schulz",20,60));

        //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());


        firma.iterate(new StatistikVisitor());
    }
}