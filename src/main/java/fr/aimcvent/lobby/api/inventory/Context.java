package fr.aimcvent.lobby.api.inventory;

public interface Context {
    boolean has(String key);

    <T> T of(String key);

    <T> T of(String key, T def);
}
