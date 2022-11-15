package de.tiere;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein {

    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

    public void addPigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }
    public void removePropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
    }

    private void firePropertyChanged(PropertyChangedEvent event) {
        propertyChangedListeners.forEach(listener->listener.properyChanged(event));
    }

    private String name;
    private int gewicht;

    public Schwein() {
        this("nobody");
    }

    public Schwein(String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        firePropertyChanged(new PropertyChangedEvent(this, "name", this.name = name, name));
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        firePropertyChanged(new PropertyChangedEvent(this, "gewicht", this.gewicht = gewicht, gewicht));
        if(gewicht > 20) firePigTooFatEvent();
    }
    public void fressen() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
