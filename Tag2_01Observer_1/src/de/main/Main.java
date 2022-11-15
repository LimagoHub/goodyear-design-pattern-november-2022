package de.main;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteuer spediteuer = new Spediteuer();
    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(spediteuer::fahren);

        for (int i = 0; i < 15; i++) {
            piggy.fressen();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(Schwein sender) {
            metzger.schlachten(sender);
        }
    }

    class Metzger  {


        public void schlachten(Object schwein) {
            System.out.println("Messer wetz");
        }
    }
    class Spediteuer  {


        public void fahren(Object ware) {
            System.out.println("Wir fahren auf der Autobahn");
        }
    }
}

