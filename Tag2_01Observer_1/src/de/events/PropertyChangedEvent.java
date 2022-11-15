package de.events;

public class PropertyChangedEvent {

    private final Object sender;
    private final String propertyName;
    private final Object oldValue;
    private final Object newValue;

    public PropertyChangedEvent(final Object sender, final String propertyName, final Object oldValue, final Object newValue) {
        this.sender = sender;
        this.propertyName = propertyName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Object getSender() {
        return sender;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyChangedEvent{");
        sb.append("sender=").append(sender);
        sb.append(", propertyName='").append(propertyName).append('\'');
        sb.append(", oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append('}');
        return sb.toString();
    }
}
