package fr.aimcvent.lobby.api.server;

public enum State {
    DOWN,
    STARTING,
    STARTED,
    UNKNOWN;

    public static State of(String name) {
        try {
            return State.valueOf(name.toUpperCase());
        } catch (Throwable throwable) {
            return State.UNKNOWN;
        }
    }
}
